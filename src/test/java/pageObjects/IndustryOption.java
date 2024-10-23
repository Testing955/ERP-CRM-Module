package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndustryOption extends BasePage {
	public IndustryOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@data-fieldname='column_break_28']//input[@data-fieldname='industry']")
	WebElement industryField;
	@FindBy(xpath = "//span[text()=' Create a new Industry Type']")
	WebElement chooseTheOptionsFromTheIndustryDropDown;
	@FindBy(xpath = "//h4[text()='New Industry Type']")
	WebElement theNewIndustryTypeTextInPopUp;
	@FindBy(xpath = "//div[@class='modal-body ui-front']//label[text()='Industry']")
	WebElement theIndustryTypeTextInPopUp;
	@FindBy(xpath = "//input[@data-doctype='Industry Type']")
	WebElement industryTypeFieldINPopUp;
	@FindBy(xpath = "//div[@class='modal-content']//button[normalize-space()='Edit Full Form']")
	WebElement validateEditFullFormTextInPopUpIndustryType;
//	@FindBy(xpath="")
//	WebElement clickOnTheEditFormOption;
	@FindBy(xpath = "//div[@class='modal-content']//button[normalize-space()='Save']")
	WebElement clickOnTheSaveOptionInPopUpIndustryType;
	@FindBy(xpath = "//div[@class='modal-content']//button[@class='btn btn-modal-close btn-link']")
	WebElement clickOnTheCloseButtonInPopUpIndustryType;
	@FindBy(xpath = "//div[@id='page-Industry Type']//h3[text()='New Industry Type']")
	WebElement verifyNewIndustryTypeTextInTheNewIndustryPage;
	@FindBy(xpath = "//div[@id='page-Industry Type']//label[text()='Industry']")
	WebElement verifyIndustryTextInTheNewIndustryPage;
	@FindBy(xpath = "//div[@id='page-Industry Type']//input[@data-doctype='Industry Type']")
	WebElement enterTheDataInTheIndustryFieldInTheNewIndustryPage;
	@FindBy(xpath = "//div[@id='page-Industry Type']//button[@data-label='Save']")
	WebElement clickOnTheSaveOptionInTheNewIndustryPage;

	public void userClickOnTheIndustryFieldOption() {
		try {
			industryField.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userChooseTheOptionsFromTheIndustryDropDown() {
		try {
			chooseTheOptionsFromTheIndustryDropDown.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean ValidatetheNewIndustryTypeText() {
		boolean newIndustryTypeText = false;
		try {
			newIndustryTypeText = theNewIndustryTypeTextInPopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return newIndustryTypeText;
	}

	public boolean validateTheIndustryTypeTextInPopUp() {
		boolean industryTypeText = false;
		try {
			industryTypeText = theIndustryTypeTextInPopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return industryTypeText;
	}

	public void userEnterTheIndustryTypeDataInTheIndustryFieldInPopUp(String industryTypeDataInPopup) {
		try {
			industryTypeFieldINPopUp.sendKeys(industryTypeDataInPopup);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userValidateEditFullFormTextInPopUpIndustryType() {
		boolean editFullFormText = false;
		try {
//			editFullFormText = validateEditFullFormTextInPopUpIndustryType.isDisplayed();
			validateEditFullFormTextInPopUpIndustryType.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return editFullFormText;
	}

//	public void 

	public boolean userClickOnTheSaveOptionInPopUpIndustryType() {
		boolean saveOptionInPopUpIndustryType = false;
		try {
			saveOptionInPopUpIndustryType = clickOnTheSaveOptionInPopUpIndustryType.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saveOptionInPopUpIndustryType;
	}

	public void userClickOnTheCloseButtonInPopUpIndustryType() {
		try {
			clickOnTheCloseButtonInPopUpIndustryType.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean userVerifyNewIndustryTypeTextInTheNewIndustryPage() {
		boolean newIndustryTypeTextInTheNewIndustryPage = false;
		try {
			newIndustryTypeTextInTheNewIndustryPage = verifyNewIndustryTypeTextInTheNewIndustryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return newIndustryTypeTextInTheNewIndustryPage;
	}

	public boolean userverifyIndustryTextInTheNewIndustryPage() {
		boolean industryTextInTheNewIndustryPage = false;
		try {
			industryTextInTheNewIndustryPage = verifyIndustryTextInTheNewIndustryPage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return industryTextInTheNewIndustryPage;
	}

	public void userenterTheDataInTheIndustryFieldInTheNewIndustryPage(
			String dataInTheIndustryFieldInTheNewIndustryPage) {
		try {
			enterTheDataInTheIndustryFieldInTheNewIndustryPage.clear();
			enterTheDataInTheIndustryFieldInTheNewIndustryPage.sendKeys(dataInTheIndustryFieldInTheNewIndustryPage);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheSaveOptionInTheNewIndustryPage() {
		try {
			clickOnTheSaveOptionInTheNewIndustryPage.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
