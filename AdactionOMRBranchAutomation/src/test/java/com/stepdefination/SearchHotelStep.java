package com.stepdefination;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStep {
	PageObjectManager pom =new PageObjectManager();
	@When("User Should Fill & Submit All Feilds In Search Hotel Page {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_Should_Fill_Submit_All_Feilds_In_Search_Hotel_Page_and(String location, String hotels, String roomType, String roomNo, String dateIn,
			String dateOut, String adultRoom, String childRomm) {
		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, roomNo, dateIn, dateOut, adultRoom, childRomm);
	   
	}

	@Then("User Should Verify Message After Search {string}")
	public void user_Should_Verify_Message_After_Search(String string) {
		String searchHotelText = pom.getSearchHotelPage().selectHotelText();
	
		Assert.assertEquals("verify the search hotel", searchHotelText, string);
	   
	}

	@When("User Should Fill & Submit Only Mandatory Feilds In Search Hotel Page {string},{string},{string},{string} and {string}")
	public void user_Should_Fill_Submit_Only_Mandatory_Feilds_In_Search_Hotel_Page_and(String location,String roomNo, String dateIn,String dateOut, String adultRoom) {
	   
		pom.getSearchHotelPage().searchHotel(location, roomNo, dateIn, dateOut, adultRoom);
	}

	@Then("User Should Verify Invalid Date Error Message After Search {string},{string}")
	public void user_Should_Verify_Invalid_Date_Error_Message_After_Search(String string, String string2) {
		String checkInDateWrong = pom.getSearchHotelPage().checkInDateWrong();
		Assert.assertEquals("verify the search hotel", checkInDateWrong, string);
		String checkOutDateWrong = pom.getSearchHotelPage().checkOutDateWrong();
		Assert.assertEquals("verify the search hotel", checkOutDateWrong, string2);
		
	}

	@When("User Should Submit Search Hotel Page Without Filling Any Details")
	public void user_Should_Submit_Search_Hotel_Page_Without_Filling_Any_Details() {
		pom.getSearchHotelPage().searchHotel();
	}

	@Then("User Should Verify  Error Message After Search {string}")
	public void user_Should_Verify_Error_Message_After_Search(String string) {
		String pleaseSelectHotelText = pom.getSearchHotelPage().pleaseSelectHotelText();
		Assert.assertEquals("verify the search hotel", pleaseSelectHotelText, string);
		
	}



}

