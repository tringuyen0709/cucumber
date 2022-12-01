package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class LoginPageObject extends BasePage {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
	}

	public String getLoginPageUrl() {
		
		return driver.getCurrentUrl();
	}

	public void clickToHereLink() {
		waitForElementClickAble(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
		sleepInSecond(5);
	}

	public void inputToUserIDTextbox(String username) {
		waitForElementVisible(driver, LoginPageUI.LOGIN_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.LOGIN_TEXTBOX, username);
		

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		

	}

	public void click_to_login_button() {
		waitForElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		
	}

}
