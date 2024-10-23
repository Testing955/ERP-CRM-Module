package stepDefinitions;

import org.openqa.selenium.WebDriver;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.TerritoryOption;

public class TerritoryOptionStepDefinitions extends Baseclass {
	WebDriver driver;
	TerritoryOption territoryOption;

	public TerritoryOptionStepDefinitions() {
		driver = BaseClass.getDriver();
		territoryOption = new TerritoryOption(driver);
	}

	@Then("the user clicks on the territory option")
	public void the_user_clicks_on_the_territory_option() {
		territoryOption.userClickOnTheTerritoryOption();
	}

	@Then("the user selects the option {string} from the dropdown")
	public void the_user_selects_the_option_from_the_dropdown(String string) {
		territoryOption.userChooseTheOptionsFromTheTerritoryDropDown();
	}

}
