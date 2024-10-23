package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddLeadOption extends BasePage {
	public AddLeadOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[span[contains(normalize-space(), 'Add Lead')]]")
	WebElement verifyAddLeadOption;
	@FindBy(xpath = "//h3[normalize-space()='New Lead']")
	WebElement verifyNewLeadText;
	@FindBy(xpath = "//button[@data-label!='']/span[contains(.,'S')]")
	WebElement verifySaveOptionText;
	@FindBy(xpath = "//label[text()='First Name']")
	WebElement verifyFirstNameText;
	@FindBy(xpath = "//div[@data-fieldname='__column_1']//div[@class='frappe-control input-max-width']//label[@class='control-label']")
	List<WebElement> verifyListOfTheELementsInTheSection1;
	@FindBy(xpath = "//div[@data-fieldname='column_break_1']//div[@class='frappe-control input-max-width']//label[@class='control-label']")
	List<WebElement> verifyListOfTheELementsInTheSection2;
	@FindBy(xpath = "//div[@data-fieldname='col_break123']//div[@class='frappe-control input-max-width']//label[@class='control-label']")
	List<WebElement> verifyListOfTheElementInTheSection3;
	@FindBy(xpath = "//label[text()='Status']")
	WebElement verifyStatusText;
	@FindBy(xpath = "//div[@class='control-input-wrapper']//select[@data-fieldname='status']//option")
	List<WebElement> verifyTheListOfStatusOnTheStatusDropDown;
	@FindBy(xpath = "//div[normalize-space()='Contact Info']")
	WebElement verifyTheTextContactInfo;
	@FindBy(xpath = "//div[@data-fieldname='__column_2']//label")
	List<WebElement> verifyConatactInfoElementsEmailAndWebsite;
	@FindBy(xpath = "//div[@data-fieldname='column_break_20']//label")
	List<WebElement> verifyConatactInfoElementsMobileAndWhatsAppNumber;
	@FindBy(xpath = "//div[@data-fieldname='column_break_16']//label")
	List<WebElement> verifyConatactInfoElementsPhoneAndPhoneExt;
	@FindBy(xpath = "//div[@class='section-head' and normalize-space(text())='Organization']")
	WebElement verifyTheOrganizationTitle;
	@FindBy(xpath = "//div[@data-fieldname='__column_3']//label")
	List<WebElement> verifyOranizationNameandNoOfEmployessSection;
	@FindBy(xpath = "//div[@data-fieldname='no_of_employees']//option[@value!='']")
	List<WebElement> verifyTheListUnderNoOfEmployeesDropDown;
	@FindBy(xpath = "//div[@data-fieldname='column_break_28']//label")
	List<WebElement> verifyOrganizationAnnualIndustryAndMarketSegmentSection;
	@FindBy(xpath = "//div[@data-fieldname='column_break_31']//label")
	List<WebElement> verifyOrganizationTerritoryAndFax;
	@FindBy(xpath = "//div[contains(@class,'section-head collapsible') and normalize-space(text())='Address & Contacts']")
	WebElement verifyAddressAndContactsText;
	@FindBy(xpath = "//div[@data-fieldname='column_break_38']//label")
	List<WebElement> verifyAddressAndContactElements;
	@FindBy(xpath = "//div[contains(@class,'section-head collapsible')and normalize-space(text())='Qualification']")
	WebElement verifyQualificationText;
	@FindBy(xpath = "//div[@data-fieldname='qualification_tab']//label")
	List<WebElement> verifyQualificationElements;
	@FindBy(xpath = "//div[@data-fieldname='qualification_status']//select")
	WebElement verifyQualificationStatusDropDown;
	@FindBy(xpath = "//div[@data-fieldname='qualification_status']//option[@value!='']")
	List<WebElement> verifyQualificationStatusDropDownElements;
	@FindBy(xpath = "//div[contains(@class,'section-head collapsible')and normalize-space(text())='Additional Information']")
	WebElement verifyAdditionalInformationText;
	@FindBy(xpath = "//div[@data-fieldname='other_info_tab']//div[@class='frappe-control input-max-width']//label")
	List<WebElement> verifyAdditionalInformationElements;
	@FindBy(xpath = "//div[@data-fieldname='column_break_50']//span[@class='label-area']")
	List<WebElement> verifyAdditionalInformationCheckBox;

	public boolean UserVerifyAddLeadText() {
		boolean verifyText = false;
		try {
			verifyText = verifyAddLeadOption.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyText;
	}

	public void userVerifySaveText() {
		try {
			verifySaveOptionText.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheAddLeadOption() {
		verifyAddLeadOption.click();
	}

	public boolean userVerifyTheTextNewLead() {
		boolean verifyText = false;
		try {
			verifyText = verifyNewLeadText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyText;
	}

	public boolean userVerifyTheLeastOfTheElementPresentOnTheLeadPage(String value) {
		boolean verfiyTextSection = false;
		try {
			for (WebElement section1 : verifyListOfTheELementsInTheSection1) {
				if (section1.getText().equals(value)) {
					verfiyTextSection = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verfiyTextSection;
	}

	public boolean userVerifyTheTextFirstName() {
		boolean verifyTextFirstName = false;
		try {
			// Check if the 'First Name' label is displayed
			if (verifyFirstNameText.isDisplayed()) {
				verifyTextFirstName = true; // Set to true if element is displayed
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyTextFirstName; // Return the result of the check
	}

	public boolean userVerifyLeastSection2(String value2) {
		boolean verifyLeastSection2 = false;
		try {
			for (WebElement leastSection2 : verifyListOfTheELementsInTheSection2) {
				if (leastSection2.getText().equals(value2)) {
					verifyLeastSection2 = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyLeastSection2;
	}

	public boolean UserVerifyLeastSection3(String value3) {
		boolean verifyLeastSection3 = false;
		try {
			for (WebElement leastSection3 : verifyListOfTheElementInTheSection3) {
				if (leastSection3.getText().equals(value3)) {
					verifyLeastSection3 = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyLeastSection3;
	}

	public boolean UserVerifyTheStatusText() {
		boolean verifyStatusTextual = false;
		try {
			verifyStatusTextual = verifyStatusText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyStatusTextual;
	}

	public boolean userVerifyTheStatusLeastDropDown(String statusLeastDropdown) {
		boolean verifyThestatusLeast = false;
		try {
			for (WebElement statusDropdown : verifyTheListOfStatusOnTheStatusDropDown) {
				if (statusDropdown.getText().equals(statusLeastDropdown)) {
					verifyThestatusLeast = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyThestatusLeast;
	}

	public boolean userVerfiyTheTextContactInfo() {
		boolean verifyContactInfoText = false;
		try {
			verifyContactInfoText = verifyTheTextContactInfo.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyContactInfoText;
	}

	public boolean userVerifyConatactInfoElementsEmailAndWebsite(String contactInfoElementsEmailAndWebsite) {
		boolean contactsInfoElements = false;
		try {
			for (WebElement contactInfo : verifyConatactInfoElementsEmailAndWebsite) {
				if (contactInfo.getText().equals(contactInfoElementsEmailAndWebsite)) {
					contactsInfoElements = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contactsInfoElements;
	}

	public boolean userVerifyConatactInfoElementsMobileAndWhatsAppNumber(
			String conatactInfoElementsMobileAndWhatsAppNumber) {
		boolean conatactsInfoMobileAndWhatsApp = false;
		try {
			for (WebElement contactInfoMobandWhats : verifyConatactInfoElementsMobileAndWhatsAppNumber) {
				if (contactInfoMobandWhats.getText().equals(conatactInfoElementsMobileAndWhatsAppNumber)) {
					conatactsInfoMobileAndWhatsApp = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conatactsInfoMobileAndWhatsApp;
	}

	public boolean userVerifyConatactInfoElementsPhoneAndPhoneExt(String conatactInfoElementsPhoneAndPhoneExt) {
		boolean conatactInfoPhoneAndPhoneExt = false;
		try {
			for (WebElement conatactPhoneAndPhoneExt : verifyConatactInfoElementsPhoneAndPhoneExt) {
				if (conatactPhoneAndPhoneExt.getText().equals(conatactInfoElementsPhoneAndPhoneExt)) {
					conatactInfoPhoneAndPhoneExt = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conatactInfoPhoneAndPhoneExt;
	}

	public boolean userVerifyTheOrganizationTitle() {
		boolean verifyOrganizationTitle = false;
		try {
			verifyOrganizationTitle = verifyTheOrganizationTitle.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyOrganizationTitle;
	}

	public boolean userVerifyOranizationNameandNoOfEmployessSection(String organizationNameAndNoOfEmployee) {
		boolean verifyOrganizationNameandNoOfEmployee = false;
		try {
			for (WebElement organizationAndNoOfEmployee : verifyOranizationNameandNoOfEmployessSection) {
				if (organizationAndNoOfEmployee.getText().equals(organizationNameAndNoOfEmployee)) {
					verifyOrganizationNameandNoOfEmployee = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyOrganizationNameandNoOfEmployee;
	}

	public boolean userVerifyTheListUnderNoOfEmployeesDropDown(String listUnderNoOfEnployee) {
		boolean verifyListunderNoOfEmployee = false;
		try {
			for (WebElement listUnderNoOfEmployee : verifyTheListUnderNoOfEmployeesDropDown) {
				if (listUnderNoOfEmployee.getText().equals(listUnderNoOfEnployee)) {
					verifyListunderNoOfEmployee = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return verifyListunderNoOfEmployee;
	}

	public boolean userVerifyOrganizationAnnualIndustryAndMarketSegmentSection(String organizationAnnualAndMarket) {
		boolean organizationAnnualIndustryAndMarketSegmentSection = false;
		try {
			for (WebElement AnnualIndustryAndMarketSegmentSection : verifyOrganizationAnnualIndustryAndMarketSegmentSection) {
				if (AnnualIndustryAndMarketSegmentSection.getText().equals(organizationAnnualAndMarket)) {
					organizationAnnualIndustryAndMarketSegmentSection = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return organizationAnnualIndustryAndMarketSegmentSection;
	}

	public boolean userVerifyOrganizationTerritoryAndFax(String organizationTerritoryAndFax) {
		boolean OrganizationTerritoryAndFax = false;
		try {
			for (WebElement TerritoryAndFax : verifyOrganizationTerritoryAndFax) {
				if (TerritoryAndFax.getText().equals(organizationTerritoryAndFax)) {
					OrganizationTerritoryAndFax = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return OrganizationTerritoryAndFax;
	}

	public boolean userVerifyAddressAndContactsText() {
		boolean addressAndContact = false;
		try {
			addressAndContact = verifyAddressAndContactsText.isDisplayed();
			verifyAddressAndContactsText.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return addressAndContact;
	}

	public boolean userVerifyAddressAndContactElements(String addressAndContactElements) {
		boolean addressAndContactsElements = false;
		try {
			for (WebElement addressAndContacts : verifyAddressAndContactElements) {
				if (addressAndContacts.getText().equals(addressAndContactElements)) {
					addressAndContactsElements = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return addressAndContactsElements;
	}

	public boolean userVerifyQualificationText() {
		boolean qualificationText = false;
		try {
			qualificationText = verifyQualificationText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return qualificationText;
	}

	public void userClickOnTheQualification() {
		try {
			verifyQualificationText.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyQualificationElements(String qualificationElementSections) {
		boolean qualificationElements = false;
		{
			try {
				for (WebElement qualificationElementSection : verifyQualificationElements) {
					if (qualificationElementSection.getText().equals(qualificationElementSections)) {
						qualificationElements = true;
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return qualificationElements;
	}

	public void userVerifyQualificationStatusDropDown() {
		try {
			verifyQualificationStatusDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyQualificationStatusDropDownElements(String qualificationStatusDropDownElements) {
		boolean qualificationStatusDropDownElement = false;
		try {
			for (WebElement qualificationStatusDropDown : verifyQualificationStatusDropDownElements) {
				if (qualificationStatusDropDown.getText().equals(qualificationStatusDropDownElements)) {
					qualificationStatusDropDownElement = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return qualificationStatusDropDownElement;
	}

	public boolean userVerifyAdditionalInformationText() {
		boolean additionalInformationText = false;
		try {
			verifyAdditionalInformationText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return additionalInformationText;
	}

	public void userClickOnTheAdditionalInformationOption() {
		try {
			verifyAdditionalInformationText.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyAdditionalInformationElements(String additionalInformationElements) {
		boolean additionalInformationElement = false;
		try {
			for (WebElement additionalInformation : verifyAdditionalInformationElements) {
				if (additionalInformation.getText().equals(additionalInformationElements)) {
					additionalInformationElement = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return additionalInformationElement;
	}

	public boolean userVerifyAdditionalInformationCheckBox(String additionalInformationCheckBox) {
		boolean additionalInformationCheckBoxes = false;
		try {
			for (WebElement additionalInformationCheckBoxing : verifyAdditionalInformationCheckBox) {
				if (additionalInformationCheckBoxing.getText().equals(additionalInformationCheckBox)) {
					additionalInformationCheckBoxes = true;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return additionalInformationCheckBoxes;
	}

}
