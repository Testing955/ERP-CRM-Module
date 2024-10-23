package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginUserAccount;

public class LoginUserAccountStepDefinitions {
	WebDriver driver;
	LoginUserAccount loginUserAccount;

	public LoginUserAccountStepDefinitions() {
		driver = BaseClass.getDriver();
		loginUserAccount = new LoginUserAccount(driver);
	}

	@Given("the browser is launching")
	public void the_browser_is_launching() {

	}

	@When("the user enters the email {string}")
	public void the_user_enters_the_email(String email) {
		loginUserAccount.userEnterTheEmailInTheEmailField(email);
	}

	@When("the user enters the password {string}")
	public void the_user_enters_the_password(String password) {
		loginUserAccount.userEnterThePasswordInThePasswordField(password);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		loginUserAccount.userClickOnTheLoginButton();
	}

	@Then("the user should be logged into their account")
	public void the_user_should_be_logged_into_their_account() {

	}

}
