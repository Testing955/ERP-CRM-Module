package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadTitleFilter extends BasePage {
	public LeadTitleFilter(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[@placeholder='Title']")
WebElement verifyTitleText;

public boolean userVerifyTheTitleText() {
	boolean verifyText=false;
	try {
		verifyText=verifyTitleText.isDisplayed();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return verifyText;
}
public void userEntersTheTitle() {
	try {
		verifyTitleText.sendKeys("Alka Pharmaceutical ");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}



