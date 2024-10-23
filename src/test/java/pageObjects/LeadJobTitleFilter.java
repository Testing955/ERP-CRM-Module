package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadJobTitleFilter extends BasePage {
	public LeadJobTitleFilter(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Job Title']")
	WebElement enterJobTitleField;

	public void userEnterTheJobTitleInTheJobTitleFilter() {
		try {
			enterJobTitleField.sendKeys("SalesManager");
			enterJobTitleField.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}