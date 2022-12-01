package bank.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObjects.HomePageObject;
import pageObjects.PageGenerator_Bank;

public class HomePageStep {
	
	WebDriver driver;
	HomePageObject homePage;
	
	public HomePageStep() {
		driver = Hooks.openAndQuitBrowser();
		homePage = PageGenerator_Bank.getHomePage(driver);
	}


	@Then("^Home page displayed$")
	public void homePageDisplayed()  {
		Assert.assertTrue(homePage.isWelcomeMessageDisplayed());
	    
	    
	}

}
