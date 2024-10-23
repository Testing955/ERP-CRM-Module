package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadTypeOption extends BasePage {
	public LeadTypeOption(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//label[text()='Lead Type']")
	WebElement theTextLeadType;
	@FindBy(xpath = "//div[@data-fieldname='type']//select[@data-doctype='Lead']")
	WebElement clickOnTheLeadTypeDropDown;
	@FindBy(xpath = "//select[@data-fieldname='type']//option[@value!='']")
	List<WebElement> verifyTheListOfLeadTypeInTheLeadTypeDropDown;
	@FindBy(xpath = "//select[@data-fieldname='type']//option[@value='Channel Partner']")
	WebElement selectTheOptionClientFromTheLeadTypeDropDown;

	public boolean validatetheTextLeadType() {
		boolean leadType = false;
		try {
			leadType = theTextLeadType.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return leadType;
	}

	public void userClickOnTheLeadTypeDropDown() {
		try {
			clickOnTheLeadTypeDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyTheListOfLeadTypeInTheLeadTypeDropDown(String leadtypeDropDownList) {
		boolean verifyTheLeadTypeDrop = false;
		try {
			for (WebElement leadTypeDropDown : verifyTheListOfLeadTypeInTheLeadTypeDropDown) {
				if (leadTypeDropDown.getText().equals(leadtypeDropDownList)) {
					verifyTheLeadTypeDrop = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyTheLeadTypeDrop;
	}

	public void userSelectTheOptionClientFromTheLeadTypeDropDown() {
		try {
			selectTheOptionClientFromTheLeadTypeDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
