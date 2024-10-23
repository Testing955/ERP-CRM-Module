package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LeadTerritoryFilter;

public class LeadTerritoryStepDefinitions {
	WebDriver driver;
	LeadTerritoryFilter leadTerritoryFilter;

	public LeadTerritoryStepDefinitions() {
		driver = BaseClass.getDriver();
		leadTerritoryFilter = new LeadTerritoryFilter(driver);
	}

	@Then("in the lead page when the user enter territory in the {string} option")
	public void in_the_lead_page_when_the_user_enter_territory_in_the_option(String string) {
		leadTerritoryFilter.userCLickOnTheTerritoryDropDown();
	}

	@Then("according to the territory the lead should be shown")
	public void according_to_the_territory_the_lead_should_be_shown() {
		leadTerritoryFilter.userSelectsTheTerritoryOptions();

	}
}