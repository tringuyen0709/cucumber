package bank.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.PageGenerator_Bank;
import pageObjects.RegisterPageObject;

public class RegisterPageSteps {

	WebDriver driver;
	RegisterPageObject registerPage;
	String emailID = "test123@net.com";
	
	
	static String username, password;
	
	//Constructor luon goi ham nay dau tien khi vao class "RegisterPageSteps"
	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGenerator_Bank.getRegisterPage(driver);
		
	}
	


	@When("^Input to email textbox$")
	public void inputToEmailTextbox()  {
		registerPage.inputToEmailTextBox(emailID);
	    
	    
	}

	@When("^Click to Submit$")
	public void clickToSubmit()  {
		registerPage.clickToSubmitButton();
	    
	    
	}

	@Then("^Get user and password info$")
	public void getUserAndPasswordInfo()  {
		
		username = registerPage.getUserIDText();
		System.out.println(username);
		password = registerPage.getPasswordText();
		System.out.println(password);
	}

	@When("^Back to login page$")
	public void backToLoginPage()  {
		
		registerPage.openLoginPage(LoginPageStep.loginPageUrl);
	    
	    
	}






}
