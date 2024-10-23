package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GenderField;

public class GenderFieldStepDefinitions extends Baseclass {
	WebDriver driver;
	GenderField genderField;
	public GenderFieldStepDefinitions() {
		driver=BaseClass.getDriver();
		genderField= new GenderField(driver);
	}
	@When("the user click on the gender field then gender drop down should be open")
	public void the_user_click_on_the_gender_field_then_gender_drop_down_should_be_open() {
		genderField.clickingOnTheGenderFieldByTheUserTheGenderDropIsOpen();
	}

	@When("under gender dropdown the user choose the option Create a new Gender")
	public void under_gender_dropdown_the_user_choose_the_option_create_a_new_gender() {
		genderField.userChooseTheOptionClickOnTheCreateANewGender();
	}
	
	@When("after selecting the option {string} text should be shown to the user")
	public void after_selecting_the_option_text_should_be_shown_to_the_user(String string) {
		Assert.assertTrue(genderField.validateNewGenderText());
	}
	
	@When("text {string} option should be shown to the user")
	public void text_option_should_be_shown_to_the_user(String gender) {
		Assert.assertTrue(genderField.validatGenderText());
	}

	@Then("the user enter the gender tag under gender field")
	public void the_user_enter_the_gender_tag_under_gender_field() {
		genderField.userEnterTheGenderTagInTheGenderField(randomString().toLowerCase());
	}

	@Then("after entering the tag the user user click on the save option to save the gender details")
	public void after_entering_the_tag_the_user_user_click_on_the_save_option_to_save_the_gender_details() {
		genderField.userClickOnTheSaveOptionUnderGenderPage();
	}

}
