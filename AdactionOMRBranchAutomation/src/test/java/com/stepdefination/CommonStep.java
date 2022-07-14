package com.stepdefination;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.When;

public class CommonStep {
	PageObjectManager pom =new PageObjectManager();
	@When("User Should Verify Welcome Message After Login {string}")
	public void userShouldVerifyWelcomeMessageAfterLogin(String string) {
		String attribute = pom.getLoginPage().getAttribute();
		Assert.assertEquals(attribute, string);
	  
	}
	
	
	

}
