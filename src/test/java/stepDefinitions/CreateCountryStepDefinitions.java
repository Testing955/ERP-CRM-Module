package stepDefinitions;

import org.openqa.selenium.WebDriver;

import crmTestBase.Baseclass;
import factory.BaseClass;
import pageObjects.CreateCountry;

public class CreateCountryStepDefinitions extends Baseclass {
	WebDriver driver;
	CreateCountry createCountry;
	public CreateCountryStepDefinitions() {
		driver = BaseClass.getDriver();
		createCountry= new CreateCountry(driver);
	}
	
}
