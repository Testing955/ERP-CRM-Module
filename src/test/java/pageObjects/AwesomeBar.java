package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AwesomeBar extends BasePage {
	public AwesomeBar(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Search or type a command (Ctrl + G)']")
	WebElement entersTheSearchTextInTheAwesomeBar;
	
	public void userentersTheSearchTextInTheAwesomeBar() {
		try {
			entersTheSearchTextInTheAwesomeBar.sendKeys("new lead");
			entersTheSearchTextInTheAwesomeBar.sendKeys(Keys.RETURN);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
