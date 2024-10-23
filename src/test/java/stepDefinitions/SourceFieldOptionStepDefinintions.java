package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SourceFieldOption;

public class SourceFieldOptionStepDefinintions extends Baseclass {
	WebDriver driver;
	SourceFieldOption sourceFieldOption;

	public SourceFieldOptionStepDefinintions() {
		driver = BaseClass.getDriver();
		sourceFieldOption = new SourceFieldOption(driver);
	}

	@When("the user click on the source field then leadsource drop down should be open")
	public void the_user_click_on_the_source_field_then_leadsource_drop_down_should_be_open() {
		sourceFieldOption.clickingOnTheLeadSourceByTheUserTheLeadSourceDropIsOpen();
	}

	@When("under source field dropdown the user choose the option Create a new Lead Source")
	public void under_source_field_dropdown_the_user_choose_the_option_create_a_new_lead_source() {
		sourceFieldOption.userclickOnTheCreateANewLeadSource();
	}

	@When("after selecting the option the text {string} should be shown to the user in the lead source popup")
	public void after_selecting_the_option_the_text_should_be_shown_to_the_user_in_the_lead_source_popup(
			String string) {
		Assert.assertTrue(sourceFieldOption.validateNewLeadSourceTextFromThePopUp());
	}

	@When("text {string} option should be visible to the user in the lead source popup")
	public void text_option_should_be_visible_to_the_user_in_the_lead_source_popup(String string) {
		Assert.assertTrue(sourceFieldOption.validateSourceNameTextFromThePopUp());
	}

	@Then("the user enter the lead source tag under lead source field popup")
	public void the_user_enter_the_lead_source_tag_under_lead_source_field_popup() {
		sourceFieldOption.userEnterTheSourceTagInTheSourcePopUpField(randomString().toLowerCase());
	}

	@When("the user click on the close option then the pop up sourcefield should be closed")
	public void the_user_click_on_the_close_option_then_the_pop_up_sourcefield_should_be_closed() {
//		sourceFieldOption.userClickOnTheCloseOption();
	}

	@Then("after entering the tag the user user click on the save option from the source pop to save the lead details")
	public void after_entering_the_tag_the_user_user_click_on_the_save_option_from_the_source_pop_to_save_the_lead_details() {
//		sourceFieldOption.userClickOnTheSaveOptionFromTheLeadSourcePopUP();
	}

	@When("the user click on the edit option under leadsource popup")
	public void the_user_click_on_the_edit_option_under_leadsource_popup() {
		sourceFieldOption.userClickOnTheEditFullForm();
	}

	@Then("the option {string} should be shown to the user in the lead source field")
	public void the_option_should_be_shown_to_the_user_in_the_lead_source_field(String string) {
		sourceFieldOption.validateNewLeadSourceTextFromTheLeadSourcePage();
	}

	@Then("text {string} option should be shown to the user in the lead source field")
	public void text_option_should_be_shown_to_the_user_in_the_lead_source_field(String string) {
		sourceFieldOption.validateSourceTextFromTheLeadSourcePage();
	}

	@Then("the user enter the lead source details under lead source field")
	public void the_user_enter_the_lead_source_details_under_lead_source_field() {
		sourceFieldOption.userEnterTheLeadSourceTagInTheLeadSourceField(randomString().toLowerCase());
	}

	@Then("after entering the tag the user user click on the save option from the Leadsource field")
	public void after_entering_the_tag_the_user_user_click_on_the_save_option_from_the_leadsource_field() {
		sourceFieldOption.userclickOnTheSaveOptionUnderLeadSourcePage();
	}

}
