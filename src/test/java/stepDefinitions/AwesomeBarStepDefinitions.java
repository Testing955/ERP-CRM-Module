package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.AwesomeBar;

public class AwesomeBarStepDefinitions {
	WebDriver driver;
	AwesomeBar awesomeBar;

	public AwesomeBarStepDefinitions() {
		driver = BaseClass.getDriver();
		awesomeBar = new AwesomeBar(driver);
	}

	@When("the user enter the search page name in the awesomebar and press the enter")
	public void the_user_enter_the_search_page_name_in_the_awesomebar_and_press_the_enter() {
		awesomeBar.userentersTheSearchTextInTheAwesomeBar();
	}

}
