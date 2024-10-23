package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import crmTestBase.Baseclass;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SalutationField;

public class SalutationFieldStepDefinitions extends Baseclass{
	WebDriver driver;
	SalutationField salutationField;
	public SalutationFieldStepDefinitions() {
		driver = BaseClass.getDriver();
		salutationField=new SalutationField(driver);
	}
	
	@When("the user click on the saluation field then salutation drop down should be open")
	public void the_user_click_on_the_saluation_field_then_salutation_drop_down_should_be_open() {
		salutationField.userClickOnTheSalutationField();
	}
	@When("under salutation dropdown the user choose the option Create a new Salutation")
	public void under_salutation_dropdown_the_user_choose_the_option_create_a_new_salutation() {
		salutationField.userClickOnTheCreateANewSalutationOptionFromTheDropDown();
	}
	@When("after selecting the option the text {string} should be shown to the user")
	public void after_selecting_the_option_the_text_should_be_shown_to_the_user(String newSalutationText){
		Assert.assertTrue(salutationField.userVerifyTheNewSalutationText());
	}
	@When("under new salution option the text {string} should be shown to the user")
	public void under_new_salution_option_the_text_should_be_shown_to_the_user(String string) {
		Assert.assertTrue(salutationField.userVerifyTheSalutionText());
		}
	@Then("the user enter the salutation tag under salutation field")
	public void the_user_enter_the_salutation_tag_under_salutation_field() {
		salutationField.userEnterTheSaluationTagInTheField(randomString().toLowerCase());
	}
	@Then("after entering the tag the user user click on the save option to save the salutation details")
	public void after_entering_the_tag_the_user_user_click_on_the_save_option_to_save_the_salutation_details() {
		salutationField.userClickOnTheSaveOptionUnderSalutationPage();
	}
	
	
}
