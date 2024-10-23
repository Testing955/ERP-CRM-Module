package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadOwner extends BasePage{
	public LeadOwner(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="")
	WebElement lead;

}
