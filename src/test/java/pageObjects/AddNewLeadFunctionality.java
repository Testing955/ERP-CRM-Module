package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewLeadFunctionality extends BasePage {
	public AddNewLeadFunctionality(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-fieldname='first_name']")
	WebElement enterTheFirstNameInTheFirstNameField;
	@FindBy(xpath = "//input[@data-fieldname='middle_name']")
	WebElement enterTheMiddleNameInTheMiddleNameField;
	@FindBy(xpath = "//input[@data-fieldname='last_name']")
	WebElement enterTheLastNameInTheLastNameField;
	@FindBy(xpath = "//input[@data-fieldname='job_title']")
	WebElement enterTheJobTitleInTheJobTitleField;
	@FindBy(xpath = "//div[@class='form-group']//select[@data-fieldname='status']")
	WebElement clickOnThestatusOption;
	@FindBy(xpath = "//div[@class='control-input-wrapper']//select[@data-fieldname='status']//option")
	WebElement selectTheOptionFromTheOption;
	@FindBy(xpath = "//div[@data-fieldname='type']//select[@data-doctype='Lead']")
	WebElement clickOnTheLeadTypeDropDown;
	@FindBy(xpath = "//select[@data-fieldname='type']//option[@value='Channel Partner']")
	WebElement selectTheOptionClientFromTheLeadTypeDropDown;
	@FindBy(xpath = "//select[@data-fieldname='request_type']")
	WebElement clickOnTheRequestTypeOption;
	@FindBy(xpath = "//select[@data-fieldname='request_type']//option[normalize-space()='Request for Information']")
	WebElement selectTheOptionsFromTheDropDown;
	@FindBy(xpath = "//input[@data-fieldname='email_id']")
	WebElement emailFieldBox;
	@FindBy(xpath = "//input[@data-fieldname='mobile_no']")
	WebElement mobileNumberField;
	@FindBy(xpath = "//input[@data-fieldname='phone']")
	WebElement phoneNumberField;
	@FindBy(xpath = "//input[@data-fieldname='website']")
	WebElement websiteField;
	@FindBy(xpath = "//input[@data-fieldname='whatsapp_no']")
	WebElement whatsappField;
	@FindBy(xpath = "//input[@data-fieldname='phone_ext']")
	WebElement phoneExtField;
	@FindBy(xpath = "//div[@class='control-input-wrapper']//input[@data-fieldname='company_name']")
	WebElement organizationNameField;
	@FindBy(xpath = "//div[@class='control-input-wrapper']//input[@data-fieldname='annual_revenue']")
	WebElement annualRevenueField;
	@FindBy(xpath = "//select[@data-fieldname='no_of_employees']//option[@value='11-50']")
	WebElement SelectNoOfEmployees;
	@FindBy(xpath = "//input[@data-fieldname='fax']")
	WebElement faxField;
	@FindBy(xpath = "//input[@data-fieldname='market_segment']")
	WebElement marketSegmentField;
	@FindBy(xpath = "//p[@title='Business to Business']")
	WebElement userSelectTheOptionFromTheDropDown;
	@FindBy(xpath = "//input[@data-fieldname='city']")
	WebElement cityFields;
	@FindBy(xpath = "//input[@data-fieldname='state']")
	WebElement stateFields;
	@FindBy(xpath = "//option[normalize-space()='Unqualified']")
	WebElement selectTheOptionFromTheQualificationDropDown;
	@FindBy(xpath = "//input[@data-fieldname='qualified_by']")
	WebElement userCLickONTheQualifiedByOptions;
	@FindBy(xpath = "//span[text()=' Create a new User']")
	WebElement clickOnTheOptionsFromTheDropDown;

	public void userEnterTheFirstNameInTheFirstNameField(String firstName) {
		try {
			enterTheFirstNameInTheFirstNameField.sendKeys(firstName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheMiddleNameInTheMiddleNameField(String middleName) {
		try {
			enterTheMiddleNameInTheMiddleNameField.sendKeys(middleName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheLastNameInTheLastNameField(String lastName) {
		try {
			enterTheLastNameInTheLastNameField.sendKeys(lastName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheJobTitleInTheJobTitleField(String jobTitle) {
		try {
			enterTheJobTitleInTheJobTitleField.sendKeys(jobTitle);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheStatusOption() {
		try {
			clickOnThestatusOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userSelectTheOptionFromTheOption() {
		try {
			selectTheOptionFromTheOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheLeadTypeDropDown() {
		try {
			clickOnTheLeadTypeDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userSelectTheOptionClientFromTheLeadTypeDropDown() {
		try {
			selectTheOptionClientFromTheLeadTypeDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheRequestTypeOption() {
		try {
			clickOnTheRequestTypeOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userSelectTheOptionsFromTheDropDown() {
		try {
			selectTheOptionsFromTheDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheEmailInTheEmailFieldBox(String emailInEmailFieldBox) {
		try {
			emailFieldBox.sendKeys(emailInEmailFieldBox);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheMobileNumberInMobileNumberField(String mobileNumberInMobileNumberField) {
		try {
			mobileNumberField.sendKeys(mobileNumberInMobileNumberField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterThePhoneNumberFieldInPhoneNumberFieldField(String phoneNumberInPhoneNumberField) {
		try {
			phoneNumberField.sendKeys(phoneNumberInPhoneNumberField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheWebsiteFieldInTheWebsiteFieldFieldBox(String websiteInWebsiteFieldBox) {
		try {
			websiteField.sendKeys(websiteInWebsiteFieldBox);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheWhatsappNumberInWhatsappField(String whatsappNumberInWhatsappNumberField) {
		try {
			whatsappField.sendKeys(whatsappNumberInWhatsappNumberField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterThePhoneExtNumberInphoneExtField(String phoneExtFieldNumberInphoneExtFieldNumberField) {
		try {
			phoneExtField.sendKeys(phoneExtFieldNumberInphoneExtFieldNumberField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheOrganizationNameInOrganizationNameField(String organizationNameInorganizationNameField) {
		try {
			organizationNameField.sendKeys(organizationNameInorganizationNameField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheAnnualRevenueFieldInAnnualRevenueFieldField(String annualRevenueFieldField) {
		try {
			annualRevenueField.sendKeys(annualRevenueFieldField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userSelectTheNoOfEmployeesFromTheOptionNoOfEmployess() {
		try {
			SelectNoOfEmployees.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheFaxNumberInfaxField(String faxNumberField) {
		try {
			faxField.sendKeys(faxNumberField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheMarketSegmentDropDown() {
		try {
			marketSegmentField.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userChooseTheOptionFromTheMarketSegmentDropDown() {
		try {
			userSelectTheOptionFromTheDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheCityDetailsInTheCityFields(String enterTheCityNameInTheCityField) {
		try {
			cityFields.sendKeys(enterTheCityNameInTheCityField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheStateDetailsInTheStateFields(String enterTheStateNameInTheStateField) {
		try {
			stateFields.sendKeys(enterTheStateNameInTheStateField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userSelectTheOptionFromTheQualificationDropDown() {
		try {
			selectTheOptionFromTheQualificationDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheQualifiedByOptions() {
		try {
			userCLickONTheQualifiedByOptions.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheOptionsFromTheDropDown() {
		try {
			clickOnTheOptionsFromTheDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
