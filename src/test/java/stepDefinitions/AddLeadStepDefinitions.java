package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddLeadOption;

public class AddLeadStepDefinitions extends Baseclass {
	WebDriver driver;
	AddLeadOption addLeadOption;

	public AddLeadStepDefinitions() {
		driver = BaseClass.getDriver();
		addLeadOption = new AddLeadOption(driver);
	}

	@Then("in the lead page verify the option {string}")
	public void in_the_lead_page_verify_the_option(String addLeadText) {
		Assert.assertTrue(addLeadOption.UserVerifyAddLeadText());
	}
	
	@Then("in the section1 mention text should be showm {string}")
	public void in_the_section1_mention_text_should_be_showm(String string) {
		addLeadOption.userVerifySaveText();
	}

	@Then("in the lead page when the user click on the add lead option then add lead page should open")
	public void in_the_lead_page_when_the_user_click_on_the_add_lead_option_then_add_lead_page_should_open() {
		addLeadOption.userClickOnTheAddLeadOption();
	}

	@When("new lead page is open then verify the title {string}")
	public void new_lead_page_is_open_then_verify_the_title(String string) {
		Assert.assertTrue(addLeadOption.userVerifyTheTextNewLead());
	}

	@Then("in the section1 mention text should be shown  {string}")
	public void in_the_section1_mentioned_text_should_be_shown(String series) {
		Assert.assertTrue(addLeadOption.userVerifyTheLeastOfTheElementPresentOnTheLeadPage(series));
	}

	@Then("in the section1 mention text should be shown {string}")
	public void in_the_section1_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyTheLeastOfTheElementPresentOnTheLeadPage(string));
	}

	@Then("user verify the text in the section1  {string}")
	public void user_verify_the_text_in_the_section1(String firstNameTextual) {
		Assert.assertTrue(addLeadOption.userVerifyTheTextFirstName());
	}

	@Then("in the section2 mention text should be shown {string}")
	public void in_the_section2_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyLeastSection2(string));
	}
	@Then("in the section3 mention text should be shown {string}")
	public void in_the_section3_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.UserVerifyLeastSection3(string));
	}

	@Then("user verify the text in the section3 {string}")
	public void user_verify_the_text_in_the_section3(String string) {
		Assert.assertTrue(addLeadOption.UserVerifyTheStatusText());
	}

	@Then("in the status section the mention text should be shown {string}")
	public void in_the_status_section_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyTheStatusLeastDropDown(string));
	}
	@When("also verify the title {string}")
	public void also_verify_the_title(String string) {
		Assert.assertTrue(addLeadOption.userVerfiyTheTextContactInfo());
	}

	@Then("in the Contact Info section email and website the mention text should be shown {string}")
	public void in_the_contact_info_section_email_and_website_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyConatactInfoElementsEmailAndWebsite(string));
	}

	@Then("in the Contact Info section mobile and whatsapp the mention text should be shown {string}")
	public void in_the_contact_info_section_mobile_and_whatsapp_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyConatactInfoElementsMobileAndWhatsAppNumber(string));
	}

	@Then("in the Contact Info section phone and phoneextn the mention text should be shown {string}")
	public void in_the_contact_info_section_phone_and_phoneextn_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyConatactInfoElementsPhoneAndPhoneExt(string));
	}
	
	@When("verify the title {string}")
	public void verify_the_title(String organizationTitle) {
		Assert.assertTrue(addLeadOption.userVerifyTheOrganizationTitle());
	}
	
	@Then("in the organization Info section of organization email and no of employees the mention text should be shown {string}")
	public void in_the_organization_info_section_of_organization_email_and_no_of_employees_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyOranizationNameandNoOfEmployessSection(string));
	}
	
	@Then("in the no of employee section the mention text should be shown {string}")
	public void in_the_no_of_employee_section_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyTheListUnderNoOfEmployeesDropDown(string));
	}
	
	@Then("in the organization Info section of organization Annual revenue Industry and MarketSegment the mention text should be shown {string}")
	public void in_the_organization_info_section_of_organization_annual_revenue_industry_and_market_segment_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyOrganizationAnnualIndustryAndMarketSegmentSection(string));
	}
	
	@Then("in the organization Info section of organization Territory and Fax the mention text should be shown {string}")
	public void in_the_organization_info_section_of_organization_territory_and_fax_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyOrganizationTerritoryAndFax(string));
	}
	
	@When("the user click on the address and contact then address and contacts dropdown should open")
	public void the_user_click_on_the_address_and_contact_then_address_and_contacts_dropdown_should_open() {
		Assert.assertTrue(addLeadOption.userVerifyAddressAndContactsText());
	}

	@Then("in the address and contact Info section the mention text should be shown {string}")
	public void in_the_address_and_contact_info_section_the_mention_text_should_be_shown(String addressandcontactInfo) {
		Assert.assertTrue(addLeadOption.userVerifyAddressAndContactElements(addressandcontactInfo));
	}
	
	@When("verify the title of the section {string}")
	public void verify_the_title_of_the_section(String string) {
		Assert.assertTrue(addLeadOption.userVerifyQualificationText());
	}
	
	@When("the user click on the qualification then qualification dropdown should open")
	public void the_user_click_on_the_qualification_then_qualification_dropdown_should_open() {
		addLeadOption.userClickOnTheQualification();
	}

	@Then("in the qualification Info section the mention text should be shown {string}")
	public void in_the_qualification_info_section_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyQualificationElements(string));
	}

	@When("the user click on the qualification status then qualification status dropdown should open")
	public void the_user_click_on_the_qualification_status_then_qualification_status_dropdown_should_open() {
		addLeadOption.userVerifyQualificationStatusDropDown();
	}

	@Then("in the qualification status Info section the mention text should be shown {string}")
	public void in_the_qualification_status_info_section_the_mention_text_should_be_shown(String string) {
	   Assert.assertTrue(addLeadOption.userVerifyQualificationStatusDropDownElements(string));
	}
	
	@When("the user click on the additional information then additional information dropdown should open")
	public void the_user_click_on_the_additional_information_then_additional_information_dropdown_should_open() {
	   addLeadOption.userClickOnTheAdditionalInformationOption();
	}

	@Then("in the additional information Info section the mention text should be shown {string}")
	public void in_the_additional_information_info_section_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(addLeadOption.userVerifyAdditionalInformationElements(string));
	}

	
	@Then("in the additional information Info section the mention checkbox should be shown {string}")
	public void in_the_additional_information_info_section_the_mention_checkbox_should_be_shown(String string) {
	   Assert.assertTrue(addLeadOption.userVerifyAdditionalInformationCheckBox(string));
	}

}
