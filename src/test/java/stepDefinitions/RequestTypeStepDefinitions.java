package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RequestType;

public class RequestTypeStepDefinitions extends Baseclass {
	WebDriver driver;
	RequestType requestType;

	public RequestTypeStepDefinitions() {
		driver = BaseClass.getDriver();
		requestType = new RequestType(driver);
	}

	@Then("validate whether the text {string} is visible or not")
	public void validate_whether_the_text_is_visible_or_not(String string) {
		Assert.assertTrue(requestType.validateTheRequestTypeText());
	}

	@When("the user clicks on the {string} option, the request type dropdown should be displayed")
	public void the_user_clicks_on_the_option_the_request_type_dropdown_should_be_displayed(String string) {
		requestType.userClickOnTheRequestTypeOption();
	}

	@Then("in the requesttype section the mention text should be shown {string}")
	public void in_the_requesttype_section_the_mention_text_should_be_shown(String requestTypeText) {
		Assert.assertTrue(requestType.userVerifyTheListOfRequestTypeInTheRequestTypeDropDown(requestTypeText));
	}

	@When("the user selects the respective option from the dropdown")
	public void the_user_selects_the_respective_option_from_the_dropdown() {
		requestType.userSelectTheOptionsFromTheDropDown();
	}

}
