package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator_Bank {

	public static HomePageObject getHomePage(WebDriver driver) {
		
		return new HomePageObject(driver);
	}
	
	public static RegisterPageObject getRegisterPage(WebDriver driver) {

		return new RegisterPageObject(driver);
	}
	
	public static LoginPageObject getLoginPage(WebDriver driver) {

		return new LoginPageObject(driver);
	}


}
