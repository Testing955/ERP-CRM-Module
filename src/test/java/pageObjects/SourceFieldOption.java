
package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SourceFieldOption extends BasePage {
	public SourceFieldOption(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-target='Lead Source']")
	WebElement byClickingOnTheLeadSourceFieldTheSourceDropIsOpen;
	@FindBy(xpath = "//p[@title='Create a new Lead Source']")
	WebElement clickOnTheCreateANewLeadSource;
	@FindBy(xpath = "//h4[text()='New Lead Source']")
	WebElement verifyNewLeadSourceTextFromThePopUp;
	@FindBy(xpath = "//div[@class='modal fade show']//label[text()='Source Name']")
	WebElement verifySourceNameTextFromThePopUp;
	@FindBy(xpath="//div[@class='modal fade show']//input[@data-fieldname='source_name']")
	WebElement enterTheSourceTagInTheSourcePopUpField;
	@FindBy(xpath = "//div[@class='modal fade show']//button[@class='btn btn-modal-close btn-link']")
	WebElement clickOnTheCloseOption;
	@FindBy(xpath = "//h3[text()='New Lead Source']")
	WebElement verifyNewLeadSourceTextFromTheLeadSourcePage;
	@FindBy(xpath = "//input[@data-fieldname='source_name']")
	WebElement enterTheLeadSourceTagInTheLeadSourceField;
	@FindBy(xpath = "//button[normalize-space()='Edit Full Form']")
	WebElement clickOnTheEditFullForm;
	@FindBy(xpath = "//div[@id='page-Lead Source']//label[text()='Source Name']")
	WebElement verifySourceTextFromTheLeadSourcePage;
	@FindBy(xpath = "//div[@class='modal-footer']//button[normalize-space()='Save']")
	WebElement clickOnTheSaveOptionFromTheLeadSourcePopUP;
	@FindBy(xpath = "//div[@data-page-route='Lead Source']//button[normalize-space()='Save']")
	WebElement clickOnTheSaveOptionUnderLeadSourcePage;

	public void clickingOnTheLeadSourceByTheUserTheLeadSourceDropIsOpen() {
		try {
			byClickingOnTheLeadSourceFieldTheSourceDropIsOpen.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userclickOnTheCreateANewLeadSource() {
		try {
			clickOnTheCreateANewLeadSource.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean validateNewLeadSourceTextFromThePopUp() {
		boolean NewLeadSourceTextFromThePopUp = false;
		try {
			NewLeadSourceTextFromThePopUp = verifyNewLeadSourceTextFromThePopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return NewLeadSourceTextFromThePopUp;
	}

	public boolean validateSourceNameTextFromThePopUp() {
		boolean sourceTextFromThePopUp = false;
		try {
			sourceTextFromThePopUp = verifySourceNameTextFromThePopUp.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sourceTextFromThePopUp;
	}
	
	public void userEnterTheSourceTagInTheSourcePopUpField(String leadSourceFieldPopup) {
		try {
			enterTheSourceTagInTheSourcePopUpField.sendKeys(leadSourceFieldPopup);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userEnterTheLeadSourceTagInTheLeadSourceField(String leadSourceField) {
		try {
			enterTheLeadSourceTagInTheLeadSourceField.clear();
			enterTheLeadSourceTagInTheLeadSourceField.sendKeys(leadSourceField);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheSaveOptionFromTheLeadSourcePopUP() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement saveButton = wait
					.until(ExpectedConditions.elementToBeClickable(clickOnTheSaveOptionFromTheLeadSourcePopUP));

			saveButton.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void userClickOnTheEditFullForm() {
		try {
			clickOnTheEditFullForm.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheCloseOption() {
		try {
			clickOnTheCloseOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean validateNewLeadSourceTextFromTheLeadSourcePage() {
		boolean NewLeadSourceTextFromTheLeadSourcePage = false;
		try {
			NewLeadSourceTextFromTheLeadSourcePage = verifyNewLeadSourceTextFromTheLeadSourcePage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return NewLeadSourceTextFromTheLeadSourcePage;
	}

	public boolean validateSourceTextFromTheLeadSourcePage() {
		boolean sourceTextFromTheLeadSourcePage = false;
		try {
			sourceTextFromTheLeadSourcePage = verifySourceTextFromTheLeadSourcePage.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sourceTextFromTheLeadSourcePage;
	}
	
	public void userclickOnTheSaveOptionUnderLeadSourcePage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement saveButtonOption = wait
					.until(ExpectedConditions.elementToBeClickable(clickOnTheSaveOptionUnderLeadSourcePage));
			saveButtonOption.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}