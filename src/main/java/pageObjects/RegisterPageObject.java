package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class RegisterPageObject extends BasePage {
	
	WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		
		this.driver = driver;
	}

	public void inputToEmailTextBox(String emailID) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailID);
		
	}

	public void clickToSubmitButton() {
		waitForElementClickAble(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
		
		sleepInSecond(5);
		
		
	}

	public String getUserIDText() {
		waitForElementVisible(driver, RegisterPageUI.GET_USER_ID);
		return getWebElement(driver, RegisterPageUI.GET_USER_ID).getText();
	}

	public String getPasswordText() {
		waitForElementVisible(driver, RegisterPageUI.GET_PASSWORD);
		return getWebElement(driver, RegisterPageUI.GET_PASSWORD).getText();
	}

	public void openLoginPage(String loginPageUrl) {
		driver.get(loginPageUrl);
		
		
	}

	

}
