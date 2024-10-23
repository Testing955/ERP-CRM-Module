package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LeadFilterOption;

public class LeadFilterStepDefinitions {
	WebDriver driver;
	LeadFilterOption leadFilterOption;
	public LeadFilterStepDefinitions() {
		driver = BaseClass.getDriver();
		leadFilterOption= new LeadFilterOption(driver);
		}
	@Then("in the lead page verify whether the {string} option is showing or not")
	public void in_the_lead_page_verify_whether_the_option_is_showing_or_not(String filterText) {
		//Assert.assertEquals(filterText, leadFilterOption.verifyFilterText());
		Assert.assertTrue(leadFilterOption.verifyFilterText());
	}

	@Then("in the lead page when the user click on the filter option applied filter should be removed")
	public void in_the_lead_page_when_the_user_click_on_the_filter_option_applied_filter_should_be_removed() {
		leadFilterOption.userClickOnTheClearOption();
	}

}
