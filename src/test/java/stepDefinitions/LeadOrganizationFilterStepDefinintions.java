package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LeadOrganizationFilter;

public class LeadOrganizationFilterStepDefinintions {
	WebDriver driver;
	LeadOrganizationFilter leadOrganizationFilter;
	public LeadOrganizationFilterStepDefinintions() {
		driver = BaseClass.getDriver();
		leadOrganizationFilter= new LeadOrganizationFilter(driver);
		}
	@Then("in the lead page when the user enters the organization in the {string} option")
	public void in_the_lead_page_when_the_user_enters_the_organization_in_the_option(String string) {
		leadOrganizationFilter.userEnterTheOrganizationNameInTheOrganizationFilter();
	}

	@Then("according to the organization the lead should be shown")
	public void according_to_the_organization_the_lead_should_be_shown() {
		
	}
}
