package com.stepdefination;

import org.junit.Assert;



import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SelectHotelStep {
	PageObjectManager pom =new PageObjectManager();
	@Then("User Should Select Hotel")
	public void userShouldSelectHotel() {
	  pom.getSelectHotelPage().selectHotel();
	}

	@Then("User Should Verify Message After Select {string}")
	public void userShouldVerifyMessageAfterSelect(String string) {
		 String selectHotelText = pom.getSelectHotelPage().bookHotelText();
		 Assert.assertEquals("verify the select hotel", selectHotelText, string);
	}

	@Then("User Should Continue To Book Hotel Page Without Selecting Hotel")
	public void userShouldContinueToBookHotelPageWithoutSelectingHotel() {
		pom.getSelectHotelPage().selectcontinue();
	}

	@Then("User Should Verify Error Message After Not Selecting Hotel {string}")
	public void userShouldVerifyErrorMessageAfterNotSelectingHotel(String string) {
	  String pleaseSelectText = pom.getSelectHotelPage().pleaseSelectText();
	  Assert.assertEquals("verify the select hotel", pleaseSelectText, string);
}
}