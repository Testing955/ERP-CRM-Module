package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	WebDriver driver;

	@Before
	public void setup() throws IOException {
		driver = BaseClass.initializeBrowser();
		driver.get(BaseClass.getProperties().getProperty("appURL"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); 
		driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				// Capture screenshot as a file
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				// Convert file to byte array
				byte[] screenshotBytes = FileUtils.readFileToByteArray(screenshot);

				// Attach the screenshot to the scenario
				scenario.attach(screenshotBytes, "image/png", "Screenshot");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
