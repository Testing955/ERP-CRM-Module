package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadStatusFilter extends BasePage {
	public LeadStatusFilter(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//select[@placeholder='Status']")
	WebElement userChooseTheStatusFromTheStatusDropDown;
	@FindBy(xpath="//select[@placeholder='Status']//option[text()='Converted']")
	WebElement leadOptionFromTheDropDown;
	
	public void userCLickOnTheStatusDropDownAndSelectTheStatusFromIt() {
		try {
			userChooseTheStatusFromTheStatusDropDown.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void userSelectTheLeadOption() {
		try {
		leadOptionFromTheDropDown.click();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}