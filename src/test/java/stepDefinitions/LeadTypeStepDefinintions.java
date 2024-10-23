package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeadTypeOption;

public class LeadTypeStepDefinintions extends Baseclass {
	WebDriver driver;
	LeadTypeOption leadTypeOption;

	public LeadTypeStepDefinintions() {
		driver = BaseClass.getDriver();
		leadTypeOption = new LeadTypeOption(driver);
	}

	@Then("the text {string} should be visible to the user")
	public void the_text_should_be_visible_to_the_user(String string) {
		Assert.assertTrue(leadTypeOption.validatetheTextLeadType());
	}

	@When("the user clicks on the LeadType dropdown the dropdown list should open")
	public void the_user_clicks_on_the_lead_type_dropdown_the_dropdown_list_should_open() {
		leadTypeOption.userClickOnTheLeadTypeDropDown();
	}

	@Then("in the leadtype section the mention text should be shown {string}")
	public void in_the_leadtype_section_the_mention_text_should_be_shown(String string) {
		Assert.assertTrue(leadTypeOption.userVerifyTheListOfLeadTypeInTheLeadTypeDropDown(string));
	}

	@Then("the user selects an option from the LeadType dropdown list")
	public void the_user_selects_an_option_from_the_lead_type_dropdown_list() {
		leadTypeOption.userSelectTheOptionClientFromTheLeadTypeDropDown();
		}
	}
