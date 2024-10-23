package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenderField extends BasePage {
	public GenderField(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-fieldname='gender']")
	WebElement byClickingOnTheGenderFieldTheGenderDropIsOpen;
	@FindBy(xpath = "//p[@title='Create a new Gender']")
	WebElement clickOnTheCreateANewGender;
	@FindBy(xpath = "//h3[text()='New Gender']")
	WebElement verifyNewGenderText;
	@FindBy(xpath = "//div[@data-fieldname='__column_1']//label[text()='Gender']")
	WebElement verifyGenderText;
	@FindBy(xpath="//div[@data-fieldname='__column_1']//input[@data-fieldname='gender']")
	WebElement enterTheGenderTagInTheGenderField;
	@FindBy(xpath = "//div[@data-page-route='Gender']//button[@data-label='Save']")
	WebElement clickOnTheSaveOptionUnderGenderPage;

	public void clickingOnTheGenderFieldByTheUserTheGenderDropIsOpen() {
		try {
			byClickingOnTheGenderFieldTheGenderDropIsOpen.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userChooseTheOptionClickOnTheCreateANewGender() {
		try {
			clickOnTheCreateANewGender.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean validateNewGenderText() {
		boolean newGenderText = false;
		try {
			newGenderText = verifyNewGenderText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return newGenderText;
	}

	public boolean validatGenderText() {
		boolean genderText = false;
		try {
			genderText = verifyGenderText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return genderText;
	}
	
	public void userEnterTheGenderTagInTheGenderField(String genderField) {
		try {
			enterTheGenderTagInTheGenderField.sendKeys(genderField);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void userClickOnTheSaveOptionUnderGenderPage(){
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(clickOnTheSaveOptionUnderGenderPage));
            
            saveButton.click();
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
