package stepDefinitions;

import org.openqa.selenium.WebDriver;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewLeadFunctionality;

public class AddNewLeadFunctionalityStepDefinitions extends Baseclass {
	WebDriver driver;
	AddNewLeadFunctionality addNewLeadFunctionality;

	public AddNewLeadFunctionalityStepDefinitions() {
		driver = BaseClass.getDriver();
		addNewLeadFunctionality = new AddNewLeadFunctionality(driver);
	}

	@Then("user enter the firstname in the firstname field")
	public void user_enter_the_firstname_in_the_firstname_field() {
		addNewLeadFunctionality.userEnterTheFirstNameInTheFirstNameField(randomString().toLowerCase());
	}

	@Then("user enter the middlename in the middlename field")
	public void user_enter_the_middlename_in_the_middlename_field() {
		addNewLeadFunctionality.userEnterTheMiddleNameInTheMiddleNameField(randomString().toLowerCase());
	}

	@Then("user enter the lastame in the lastname field")
	public void user_enter_the_lastame_in_the_lastname_field() {
		addNewLeadFunctionality.userEnterTheLastNameInTheLastNameField(randomString().toLowerCase());
	}

	@Then("user enter the jobtitle in the jobtitle field")
	public void user_enter_the_jobtitle_in_the_jobtitle_field() {
		addNewLeadFunctionality.userEnterTheJobTitleInTheJobTitleField(randomString().toLowerCase());
	}

	@When("the user clicks on the status options")
	public void the_user_clicks_on_the_status_options() {
		addNewLeadFunctionality.userClickOnTheStatusOption();
	}

	@Then("in the status dropdown user select the option lead from the dropdown")
	public void in_the_status_dropdown_user_select_the_option_lead_from_the_dropdown() {
		addNewLeadFunctionality.userSelectTheOptionFromTheOption();
	}

	@When("the user click on the leadtype option dropdown down should open")
	public void the_user_click_on_the_leadtype_option_dropdown_down_should_open() {
		addNewLeadFunctionality.userClickOnTheLeadTypeDropDown();
	}

	@When("from the dropdown user select the desired option from it")
	public void from_the_dropdown_user_select_the_desired_option_from_it() {
		addNewLeadFunctionality.userSelectTheOptionClientFromTheLeadTypeDropDown();
	}

	@Then("user clicks on the request type option dropdown should open")
	public void user_clicks_on_the_request_type_option_dropdown_should_open() {
		addNewLeadFunctionality.userClickOnTheRequestTypeOption();
	}

	@Then("from the dropdown user select the options from it")
	public void from_the_dropdown_user_select_the_options_from_it() {
		addNewLeadFunctionality.userSelectTheOptionsFromTheDropDown();
	}

	@Then("the user enters the email ID in the {string} field")
	public void the_user_enters_the_email_id_in_the_field(String emailfield) {
		addNewLeadFunctionality.userEnterTheEmailInTheEmailFieldBox(randomString() + "@yopmail.com");
	}

	@Then("the user enters the mobile number in the {string} field")
	public void the_user_enters_the_mobile_number_in_the_field(String mobileNumber) {
		addNewLeadFunctionality.userEnterTheMobileNumberInMobileNumberField(randomNumber());
	}

	@Then("the user enters the phone number in the {string} field")
	public void the_user_enters_the_phone_number_in_the_field(String phoneNumber) {
		addNewLeadFunctionality.userEnterThePhoneNumberFieldInPhoneNumberFieldField(randomNumber());
	}

	@Then("the user enters the website in the {string} field")
	public void the_user_enters_the_website_in_the_field(String website) {
		addNewLeadFunctionality.userEnterTheWebsiteFieldInTheWebsiteFieldFieldBox(randomString().toLowerCase());
	}

	@Then("the user enters the WhatsApp number in the {string} field")
	public void the_user_enters_the_whats_app_number_in_the_field(String whatsappNumber) {
		addNewLeadFunctionality.userEnterTheWhatsappNumberInWhatsappField(randomNumber());
	}

	@Then("the user enters the phone extension number in the {string} field")
	public void the_user_enters_the_phone_extension_number_in_the_field(String phoneExtn) {
		addNewLeadFunctionality.userEnterThePhoneExtNumberInphoneExtField(randomNumber());
	}

	@Then("the user enters the organization name in the {string} field")
	public void the_user_enters_the_organization_name_in_the_field(String organizationName) {
		addNewLeadFunctionality.userEnterTheOrganizationNameInOrganizationNameField(randomString().toLowerCase());
	}

	@Then("the user enters the annual revenue in the {string} field")
	public void the_user_enters_the_annual_revenue_in_the_field(String string) {
		addNewLeadFunctionality.userEnterTheAnnualRevenueFieldInAnnualRevenueFieldField(randomNumber());
	}

	@Then("from the {string} dropdown, the user selects the desired option")
	public void from_the_dropdown_the_user_selects_the_desired_option(String noOfEmployees) {
		addNewLeadFunctionality.userSelectTheNoOfEmployeesFromTheOptionNoOfEmployess();
	}

	@Then("in the {string} field, the user enters the fax number")
	public void in_the_field_the_user_enters_the_fax_number(String faxNumber) {
		addNewLeadFunctionality.userEnterTheFaxNumberInfaxField(randomNumber());
	}

	@When("the user clicks on the {string} option from there choose marketoption")
	public void the_user_clicks_on_the_option_from_there_choose_marketoption(String string) {
		addNewLeadFunctionality.userClickOnTheMarketSegmentDropDown();
	}

	@Then("from the {string} dropdown, the user chooses the desired option")
	public void from_the_dropdown_the_user_chooses_the_desired_option(String string) {
		addNewLeadFunctionality.userChooseTheOptionFromTheMarketSegmentDropDown();
	}

	@Then("the user enters the city name in the {string} field")
	public void the_user_enters_the_city_name_in_the_field(String city) {
		addNewLeadFunctionality.userEnterTheCityDetailsInTheCityFields(randomString().toLowerCase());
	}

	@Then("the state name in the {string} field")
	public void the_state_name_in_the_field(String state) {
		addNewLeadFunctionality.userEnterTheStateDetailsInTheStateFields(randomString().toLowerCase());
	}

	@Then("from the {string} field, the user chooses the option")
	public void from_the_field_the_user_chooses_the_option(String string) {
		addNewLeadFunctionality.userSelectTheOptionFromTheQualificationDropDown();
	}

}
