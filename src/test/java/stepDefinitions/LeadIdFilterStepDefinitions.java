package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeadIdFilter;

public class LeadIdFilterStepDefinitions {
	WebDriver driver;
	LeadIdFilter leadIdFilter;

	public LeadIdFilterStepDefinitions() {
		driver = BaseClass.getDriver();
		leadIdFilter = new LeadIdFilter(driver);
	}

	@When("the user enter the id in the {string} option")
	public void the_user_enter_the_id_in_the_option(String string) {
		leadIdFilter.userEnterTheLeadIdInTheIdFilter();
	}

	@Then("according to the id the lead should be shown")
	public void according_to_the_id_the_lead_should_be_shown() {

	}

}
