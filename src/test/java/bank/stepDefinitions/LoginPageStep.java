package bank.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.LoginPageObject;
import pageObjects.PageGenerator_Bank;

public class LoginPageStep extends BasePage {
	WebDriver driver;
	static String loginPageUrl;

	LoginPageObject loginPage;

	public LoginPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGenerator_Bank.getLoginPage(driver);
	}

	@Given("^Get login page Url$")
	public void getLoginPageUrl() {
		loginPageUrl = loginPage.getLoginPageUrl();
		System.out.println(loginPageUrl);

	}

	@Given("^Open Register page$")
	public void openRegisterPage() {
		loginPage.clickToHereLink();

	}

	@When("^Submit valid info to login form$")
	public void submitValidInfoToLoginForm() {
		loginPage.inputToUserIDTextbox(RegisterPageSteps.username);
		loginPage.inputToPasswordTextbox(RegisterPageSteps.password);
		
		sleepInSecond(5);
	}
		
	@When("^Click to login button$")
	public void clickToLoginButton() {
		loginPage.click_to_login_button();
	}
	}

	



