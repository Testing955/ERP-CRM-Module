package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUserAccount extends BasePage {
	public LoginUserAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='login_email']")
	WebElement emailField;
	@FindBy(xpath = "//input[@id='login_password']")
	WebElement passwordField;
	@FindBy(xpath = "//button[contains(., 'Login')]")
	WebElement loginButton;

	public void userEnterTheEmailInTheEmailField(String email) {
		try {
			emailField.sendKeys(email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterThePasswordInThePasswordField(String password) {
		try {
			passwordField.sendKeys(password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheLoginButton() {
		try {
			loginButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
