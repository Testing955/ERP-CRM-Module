package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LeadStatusFilter;

public class LeadStatusFilterStepDefinitions {
	WebDriver driver;
	LeadStatusFilter leadStatusFilter;
	
	public LeadStatusFilterStepDefinitions() {
		driver = BaseClass.getDriver();
		leadStatusFilter = new LeadStatusFilter(driver);
	}
	
	@Then("in the lead page when the user enters the {string} option")
	public void in_the_lead_page_when_the_user_enters_the_option(String string) {
		leadStatusFilter.userCLickOnTheStatusDropDownAndSelectTheStatusFromIt();
	}

	@Then("according to the status the lead should be shown")
	public void according_to_the_status_the_lead_should_be_shown() {
		leadStatusFilter.userSelectTheLeadOption();
	}

}
