package com.stepdefination;

import org.junit.Assert;


import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;


public class CancelHotelStep   {
	PageObjectManager pom =new PageObjectManager();
	
	
	@Then("User Should Cancel The Order Id")
	public void userShouldCancelTheOrderId() throws InterruptedException {
		pom.getCancelBookingPage().cancelOrderId();

	}

	@Then("User Should Verify Message After Cancelling {string}")
	public void userShouldVerifyMessageAfterCancelling(String string) {
		String bookingCancelText = pom.getCancelBookingPage().bookingCancelText();
		Assert.assertEquals("verify the search hotel", bookingCancelText, string);
	}

	@Then("User Should Cancel The Previously Booked Order Id {string}")
	public void userShouldCancelThePreviouslyBookedOrderId(String orderId) {
	pom.getCancelBookingPage().cancelOrderId(orderId);
		

	}
	
}
	
	
	
	
	
	
	/*
	
	@Then("User Should Cancel The Order Id")
	public void userShouldCancelTheOrderId() throws InterruptedException {
		pom.getCancelBookingPage().cancelOrderId();
	}

	@Then("User Should Verify Message After Cancelling {string}")
	public void userShouldVerifyMessageAfterCancelling(String string) {
	   
	}

	@When("User Should Cancel The Previously Booked Order Id {string}")
	public void userShouldCancelThePreviouslyBookedOrderId(String orderid) {
		pom.getCancelBookingPage().cancelOrderId(orderid);
	  */
	


//String OrderId = pom.getBookingConfirmationPage().getGetOrderId();
//Thread.sleep(3000);
//pom.getCancelBookingPage().cancelOrderId();(OrderId);