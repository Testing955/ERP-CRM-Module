package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusLeadList extends BasePage {
	public StatusLeadList(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//select[@placeholder='Status']")
	WebElement statusText;
	@FindBy(xpath="//div[@class='form-group']//select[@data-fieldname='status']")
	WebElement clickOnThestatusOption;
	@FindBy(xpath="//select[@placeholder='Status']/option[normalize-space(text()) != '']")
	List<WebElement>statusDropdownList;
	@FindBy(xpath="//div[@class='control-input-wrapper']//select[@data-fieldname='status']//option")
	WebElement selectTheOptionFromTheOption;
	public boolean validateStatusText() {
		boolean validateStatus=false;
		try {
			validateStatus=statusText.isDisplayed();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return validateStatus;
	}
	public void userClickOnTheStatusOption() {
		try {
			clickOnThestatusOption.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public boolean validateStatusDrooDownList(String value) {
			boolean statusList = false;
			try {
				for(WebElement statusDropList:statusDropdownList ) {
					if(statusDropList.getText().equals(value)) {
						statusList=true;
						break;
					}
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return statusList;
		}
		
		public void userSelectTheOptionFromTheOption() {
			try {
				selectTheOptionFromTheOption.click();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

