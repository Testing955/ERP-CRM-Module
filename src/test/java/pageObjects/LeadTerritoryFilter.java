package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadTerritoryFilter extends BasePage {
	public LeadTerritoryFilter(WebDriver driver) {
	super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Territory']")
	WebElement territoryDropDown;
	@FindBy(xpath="//a/p[strong[text()='Bihar'] and span[text()='LG India']]")
	WebElement territoryOptions;
	@FindBy(xpath="//ul[@id='awesomplete_list_2']//li")
	List <WebElement> territoryList;
	
	public void userCLickOnTheTerritoryDropDown() {
		try {
			territoryDropDown.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void userSelectsTheTerritoryOptions() {
		try {
			territoryOptions.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
