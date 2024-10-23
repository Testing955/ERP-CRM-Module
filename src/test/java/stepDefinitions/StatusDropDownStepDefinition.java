package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StatusLeadList;

public class StatusDropDownStepDefinition {
	WebDriver driver;
	StatusLeadList statusLead;

	public StatusDropDownStepDefinition() {
		driver = BaseClass.getDriver();
		statusLead = new StatusLeadList(driver);
	}

	@When("the user should able to see the text {string}")
	public void the_user_should_able_to_see_the_text(String statusText) {
		Assert.assertTrue(statusLead.validateStatusText());
	}

	@When("after clicking on the status dropdown the droplist should open")
	public void after_clicking_on_the_status_dropdown_the_droplist_should_open() {
		statusLead.userClickOnTheStatusOption();
	}

	@Then("the following text should be shown to the user {string}")
	public void the_following_text_should_be_shown_to_the_user(String statusDropDownList) {
		Assert.assertTrue(statusLead.validateStatusDrooDownList(statusDropDownList));
		}
}
