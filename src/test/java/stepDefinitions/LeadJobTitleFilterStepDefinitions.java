package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeadJobTitleFilter;

public class LeadJobTitleFilterStepDefinitions {
	WebDriver driver;
	LeadJobTitleFilter leadJobTitleFilter ;
	public LeadJobTitleFilterStepDefinitions() {
		driver = BaseClass.getDriver();
		leadJobTitleFilter= new LeadJobTitleFilter(driver);
	}
	
	@When("the user enters the job title in the {string} option")
	public void the_user_enters_the_job_title_in_the_option(String string) {
		leadJobTitleFilter.userEnterTheJobTitleInTheJobTitleFilter();
	}

	@Then("according to the job the lead should be shown")
	public void according_to_the_job_the_lead_should_be_shown() {

	}

}
