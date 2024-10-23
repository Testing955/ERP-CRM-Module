package stepDefinitions;

import org.openqa.selenium.WebDriver;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IndustryOption;

public class IndustryOptionStepDefinitions extends Baseclass {
	WebDriver driver;
	IndustryOption industryOption;

	public IndustryOptionStepDefinitions() {
		driver = BaseClass.getDriver();
		industryOption = new IndustryOption(driver);
	}

	@Then("the user clicks on the {string} option to choose the industry")
	public void the_user_clicks_on_the_option_to_choose_the_industry(String industry) {
		industryOption.userClickOnTheIndustryFieldOption();
	}

	@Then("from the Industry dropdown, the user chooses the option {string}")
	public void from_the_industry_dropdown_the_user_chooses_the_option(String createNewIndustry) {
		industryOption.userChooseTheOptionsFromTheIndustryDropDown();
	}

	@Then("on the popup, the user validates the text {string}")
	public void on_the_popup_the_user_validates_the_text(String newIndustryTypeText) {
		industryOption.ValidatetheNewIndustryTypeText();
	}

	@Then("on the popup, the text {string} should be visible")
	public void on_the_popup_the_text_should_be_visible(String string) {
		industryOption.validateTheIndustryTypeTextInPopUp();
	}

	@Then("in the {string} field on the popup, the user enters the data")
	public void in_the_field_on_the_popup_the_user_enters_the_data(String industryDatapopup) {
		industryOption.userEnterTheIndustryTypeDataInTheIndustryFieldInPopUp(randomString().toLowerCase());
	}

	@Then("after that, the user validates the text {string} on the popup")
	public void after_that_the_user_validates_the_text_on_the_popup(String editFullform) {
		industryOption.userValidateEditFullFormTextInPopUpIndustryType();
	}

	@When("all the details are filled, the user clicks on the {string} option")
	public void all_the_details_are_filled_the_user_clicks_on_the_option(String saveoption) {
		// industryOption.userClickOnTheSaveOptionInPopUpIndustryType();
	}

	@When("if the user doesn't want to create the new industry, they click on the {string} option from the popup")
	public void if_the_user_doesn_t_want_to_create_the_new_industry_they_click_on_the_option_from_the_popup(
			String closeButton) {
		// industryOption.userClickOnTheCloseButtonInPopUpIndustryType();
	}

	@When("the user clicks on the Edit Form option, then on the New Industry page, the text {string} should be displayed")
	public void the_user_clicks_on_the_edit_form_option_then_on_the_new_industry_page_the_text_should_be_displayed(
			String newIndustryTextInIndustryType) {
		industryOption.userVerifyNewIndustryTypeTextInTheNewIndustryPage();
	}

	@When("the text {string} should also be displayed on the {string} page")
	public void the_text_should_also_be_displayed_on_the_page(String string, String industryTextInNew) {
		industryOption.userverifyIndustryTextInTheNewIndustryPage();
	}

	@When("in the {string} field, the user enters the data")
	public void in_the_field_the_user_enters_the_data(String string) {
		industryOption.userenterTheDataInTheIndustryFieldInTheNewIndustryPage(randomString().toLowerCase());
	}

	@When("the data is saved after clicking on the {string} option from the {string} page")
	public void the_data_is_saved_after_clicking_on_the_option_from_the_page(String string, String string2) {
		industryOption.userClickOnTheSaveOptionInTheNewIndustryPage();
	}

}
