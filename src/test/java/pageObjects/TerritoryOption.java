package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TerritoryOption extends BasePage {
	public TerritoryOption(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@data-fieldname='column_break_31']//input[@data-target='Territory']")
	WebElement clickOnTheTerritoryOption;
	@FindBy(xpath="//span[contains(@class,'link-option') and normalize-space(text())='Create a new Territory']")
	WebElement clickOnTheNewTerritoryOptionFromTheTerritoryDropDownList;
	@FindBy(xpath="//p[@title='Bihar']")
	WebElement territoryField;
	
	public void userClickOnTheTerritoryOption() {
		try {
			clickOnTheTerritoryOption.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void userClickOnTheTerritoryOptionFromTheTerritoryDropDownList() {
		 Actions actions = new Actions(driver);
		 actions.moveToElement(clickOnTheNewTerritoryOptionFromTheTerritoryDropDownList).click().perform();;
	}
	
	public void userChooseTheOptionsFromTheTerritoryDropDown() {
		try {
			territoryField.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
