package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalutationField extends BasePage {
	public SalutationField(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@data-target='Salutation']")
	WebElement clickOnTheSalutationField;
	@FindBy(xpath="//p[@title='Create a new Salutation']")
	WebElement clickOnTheCreateANewSalutationOptionFromTheDropDown;
	@FindBy(xpath="//h3[text()='New Salutation']")
	WebElement verifyTheNewSalutationText;
	@FindBy(xpath="//div[@id='page-Salutation']//label[text()='Salutation']")
	WebElement verifyTheSalutionText;
	@FindBy(xpath="//input[@data-doctype='Salutation']")
	WebElement enterTheSaluationTagInTheField;
	@FindBy(xpath="//div[@id='page-Salutation']//button[@data-label='Save']")
	WebElement clickOnTheSaveOptionUnderSalutationPage;
	
	public void userClickOnTheSalutationField() {
		try {
			clickOnTheSalutationField.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void userClickOnTheCreateANewSalutationOptionFromTheDropDown() {
		try {
			clickOnTheCreateANewSalutationOptionFromTheDropDown.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean userVerifyTheNewSalutationText() {
		boolean theNewSalutationText=false;
		try {
			theNewSalutationText=verifyTheNewSalutationText.isDisplayed();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return theNewSalutationText;
	}
	
	public boolean userVerifyTheSalutionText() {
		boolean theSalutationText=false;
		try {
			theSalutationText=verifyTheSalutionText.isDisplayed();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return theSalutationText;
	}
	
	public void userEnterTheSaluationTagInTheField(String salutationTag) {
		try {
			enterTheSaluationTagInTheField.sendKeys(salutationTag);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
    public void userClickOnTheSaveOptionUnderSalutationPage() {
        try {
            // Apply explicit wait to wait until the save button is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(clickOnTheSaveOptionUnderSalutationPage));
            
            saveButton.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}


