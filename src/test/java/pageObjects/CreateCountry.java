package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCountry extends BasePage {
	public CreateCountry(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[text()=' Create a new Country']")
	WebElement clickOnTheCreateANewCountry;
	@FindBy(xpath = "//div[@class='modal fade show']//h4[text()='New Country']")
	WebElement validateNewCountryTextInPopUp;
	@FindBy(xpath = "//div[@class='modal fade show']//label[text()='Country Name']")
	WebElement validateCountryNameTextValidateInPopUp;
	@FindBy(xpath = "//div[@class='modal fade show']//input[@data-fieldname='country_name']")
	WebElement enterTheDataInCountryNameField;
	@FindBy(xpath = "//div[@class='modal fade show']//button[normalize-space()='Edit Full Form']")
	WebElement clickOnTheEditFullFormOption;
	@FindBy(xpath = "//div[@class='modal fade show']//button[normalize-space()='Save']")
	WebElement clickOnTheSaveButtonPopUp;
	@FindBy(xpath = "//div[@class='modal fade show']//button[@class='btn btn-modal-close btn-link']")
	WebElement clickOnTheCloseButtonPresentOnThePopUpBox;
	@FindBy(xpath = "//h3[normalize-space()='New Country']")
	WebElement newCountryTextInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//label[text()='Country Name']")
	WebElement countryNameTextInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//input[@data-fieldname='country_name']")
	WebElement countryNameFieldInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//label[text()='Date Format']")
	WebElement dateFormatTextInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//input[@data-fieldname='date_format']")
	WebElement dateFormatFieldInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//label[text()='Time format']")
	WebElement timeFormatTextInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//label[text()='Time Zones']")
	WebElement timeZonesFormatTextInNewCountryPage;
	@FindBy(xpath = "//div[@class='std-form-layout']//label[text()='Code']")
	WebElement codeTextFormatInNewCountryPage;
	@FindBy(xpath = "//div[@data-page-route='Country']//button[@data-label='Save']")
	WebElement saveTextInNewCountryPage;

	public void userClickOnTheCreateANewCountry() {
		try {
			clickOnTheCreateANewCountry.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userValidateNewCountryTextInPopUp() {
		boolean newCountryTextInPopUp = false;
		try {
			newCountryTextInPopUp = validateNewCountryTextInPopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return newCountryTextInPopUp;
	}

	public boolean userValidateCountryNameTextValidateInPopUp() {
		boolean countryNameTextValidateInPopUp = false;
		try {
			countryNameTextValidateInPopUp = validateCountryNameTextValidateInPopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return countryNameTextValidateInPopUp;
	}

	public void userEnterTheDataInCountryNameField(String dataInCountryNameField) {
		try {
			enterTheDataInCountryNameField.sendKeys(dataInCountryNameField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void UserclickOnTheEditFullFormOption() {
		try {
			clickOnTheEditFullFormOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheSaveButtonPopUp() {
		try {
			clickOnTheSaveButtonPopUp.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheCloseButtonPresentOnThePopUpBox() {
		try {
			clickOnTheCloseButtonPresentOnThePopUpBox.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean validateNewCountryTextInNewCountryPage() {
		boolean NewcountryTextInNewCountryPage = false;
		try {
			NewcountryTextInNewCountryPage = newCountryTextInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return NewcountryTextInNewCountryPage;
	}

	public boolean validateCountryNameTextInNewCountryPage() {
		boolean countryTextInNewCountryPage = false;
		try {
			countryTextInNewCountryPage = countryNameTextInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return countryTextInNewCountryPage;
	}

	public void userEntryCountryNameFieldInNewCountryPage(String countryNameField) {
		try {
			countryNameFieldInNewCountryPage.clear();
			countryNameFieldInNewCountryPage.sendKeys(countryNameField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userValidatedateFormatTextInNewCountryPage() {
		boolean dateFormatInNewCountryPage = false;
		try {
			dateFormatInNewCountryPage = dateFormatTextInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dateFormatInNewCountryPage;
	}

	public boolean userValidatetimeFormatTextInNewCountryPage() {
		boolean timeFormatInNewCountryPage = false;
		try {
			timeFormatInNewCountryPage = timeFormatTextInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return timeFormatInNewCountryPage;
	}

	public boolean userValidatetimeZonesFormatTextInNewCountryPage() {
		boolean timeZonesFormatInNewCountryPage = false;
		try {
			timeZonesFormatInNewCountryPage = timeZonesFormatTextInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return timeZonesFormatInNewCountryPage;
	}

	public boolean userValidateCodeTextFormatInNewCountryPage() {
		boolean codeTextInNewCountryPage = false;
		try {
			codeTextInNewCountryPage = codeTextFormatInNewCountryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return codeTextInNewCountryPage;
	}

	public void userClickOnThesaveTextInNewCountryPage() {
		try {
			saveTextInNewCountryPage.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
