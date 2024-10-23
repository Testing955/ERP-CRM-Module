package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadFilterOption extends BasePage {
	public LeadFilterOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[text()='Filter']")
	WebElement verifyFilterText;
	@FindBy(xpath = "//button[@title='Clear all filters']")
	WebElement clickOnTheClearOption;

	public boolean verifyFilterText() {
		boolean verifyText = false;
		try {
			verifyText = verifyFilterText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyText;
	}

	public void userClickOnTheClearOption() {
		try {
			clickOnTheClearOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}