package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadOrganizationFilter extends BasePage {
	public LeadOrganizationFilter(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Organization Name']")
	WebElement validateLeadByOrganization;

	public void userEnterTheOrganizationNameInTheOrganizationFilter() {
		try {
			validateLeadByOrganization.sendKeys("MelinaNestorBird");
			validateLeadByOrganization.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
