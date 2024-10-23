package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestType extends BasePage {
	public RequestType(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//label[text()='Request Type']")
	WebElement theRequestTypeText;
	@FindBy(xpath = "//select[@data-fieldname='request_type']")
	WebElement clickOnTheRequestTypeOption;
	@FindBy(xpath = "//select[@data-fieldname='request_type']//option[@value!='']")
	List<WebElement> verifyTheListOfRequestTypeInTheRequestTypeDropDown;
	@FindBy(xpath = "//select[@data-fieldname='request_type']//option[normalize-space()='Request for Information']")
	WebElement selectTheOptionsFromTheDropDown;

	public boolean validateTheRequestTypeText() {
		boolean requestTypeText = false;
		try {
			requestTypeText = theRequestTypeText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return requestTypeText;
	}

	public void userClickOnTheRequestTypeOption() {
		try {
			clickOnTheRequestTypeOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyTheListOfRequestTypeInTheRequestTypeDropDown(String requestTypeDropDownList) {
		boolean verifyListOfRequestTypeDropDown = false;
		try {
			for (WebElement requestTypeDropDown : verifyTheListOfRequestTypeInTheRequestTypeDropDown) {
				if (requestTypeDropDown.getText().equals(requestTypeDropDownList)) {
					verifyListOfRequestTypeDropDown = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyListOfRequestTypeDropDown;
	}

	public void userSelectTheOptionsFromTheDropDown() {
		try {
			selectTheOptionsFromTheDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
