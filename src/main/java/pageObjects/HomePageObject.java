package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class HomePageObject extends BasePage {
	
WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		
		this.driver = driver;
	}

	public boolean isWelcomeMessageDisplayed() {
		
		waitForElementVisible(driver, HomePageUI.MESSAGE_LOGIN_SUCCESS);

		return getWebElement(driver, HomePageUI.MESSAGE_LOGIN_SUCCESS).isDisplayed();
	}

}
