package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadGeneration extends BasePage {
	public LeadGeneration(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h3[text()='Home']")
	WebElement homeTitleText;
	@FindBy(xpath = "//span[text()='CRM']")
	WebElement clickOnTheCRMOption;
	@FindBy(xpath = "//span[text()='Lead ']")
	WebElement clickOnTheLeadOption;
	@FindBy(xpath = "//h3[text()='Lead']")
	WebElement leadText;
	@FindBy(xpath = "//div[@class='list-row-col ellipsis hidden-xs']")
	List<WebElement> headerTitle;

	public boolean validateHomeText() {
		boolean validateText = false;
		try {
			validateText = homeTitleText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return validateText;
	}

	public void userClickOnTheCRMOption() {
		try {
			clickOnTheCRMOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void userClickOnTheLeadOption() {
		try {
			clickOnTheLeadOption.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean validateLeadText() {
		boolean validateleadText = false;
		try {
			validateleadText = leadText.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return validateleadText;
	}

	 public boolean validateHeaderList(String value) {
	        boolean headerList = false;
	        try {
	            for (WebElement ValidateheaderList : headerTitle) {
	                String headerText = ValidateheaderList.getText();
	                if (headerText.equals(value)) {
	                    headerList = true;
	                    break;
	                } else {
	                    // Print the text that is not matching
	                    System.out.println("Found header text: " + headerText + ", but expected: " + value);
	                }
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        return headerList;
	    }
	}