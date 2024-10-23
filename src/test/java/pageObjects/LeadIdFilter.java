package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadIdFilter extends BasePage {
	public LeadIdFilter(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='ID']")
	WebElement enterTheLeadID;

	public void userEnterTheLeadIdInTheIdFilter() {
		try {
			enterTheLeadID.sendKeys("CRM-LEAD-2024-00114");
			enterTheLeadID.clear(); // comment it when we test the id filter specific functionality
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
