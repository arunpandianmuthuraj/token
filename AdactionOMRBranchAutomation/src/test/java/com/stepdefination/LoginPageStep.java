	package com.stepdefination;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.Base.Baseclass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends Baseclass {
	PageObjectManager pom =new PageObjectManager();
	@Given("User is on the Adactin Home Page")
	public void userIsOnTheAdactinHomePage() throws FileNotFoundException, IOException {
//	 getDriver(getPropertyFileValue("browseType"));
//	 loadUrl(getPropertyFileValue("url"));
	}

	@When("User Should Perform Login {string},{string}")
	public void userShouldPerformLogin(String UserName, String Password) {
		pom.getLoginPage().login(UserName, Password);
	   
	}

	@When("User Should Perform Login {string},{string} With Help of ENTER key")
	public void userShouldPerformLoginWithHelpOfENTERKey(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithKeys(username, password);
	}
	@When("User Should Perform Login {string},{string} with in valid details")
	public void user_Should_Perform_Login_with_in_valid_details(String username, String password) {
		pom.getLoginPage().loginwithInvalidDetails(username, password);
	}

	@Then("User Should Verify Login Error Message Contains After Login {string}")
	public void userShouldVerifyLoginErrorMessageContainsAfterLogin(String string) {
	    String invalid = pom.getLoginPage().invalid();
	    boolean contains = invalid.contains(string);
	    Assert.assertTrue(contains);
	}
}
