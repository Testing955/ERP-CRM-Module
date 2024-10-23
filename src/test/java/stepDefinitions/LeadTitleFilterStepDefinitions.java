package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LeadTitleFilter;

public class LeadTitleFilterStepDefinitions {
	WebDriver driver;
	LeadTitleFilter leadTitleFilter;

	public LeadTitleFilterStepDefinitions() {
		driver = BaseClass.getDriver();
		leadTitleFilter = new LeadTitleFilter(driver);
	}

	@Then("in the lead page when the user enter the title in the {string} option")
	public void in_the_lead_page_when_the_user_enter_the_title_in_the_option(String string) {
		leadTitleFilter.userVerifyTheTitleText();
	}

	@Then("according to the title the lead should be shown")
	public void according_to_the_title_the_lead_should_be_shown() {
		leadTitleFilter.userEntersTheTitle();
	}
}
