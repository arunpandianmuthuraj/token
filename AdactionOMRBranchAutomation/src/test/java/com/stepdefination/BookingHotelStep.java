package com.stepdefination;

import java.util.List;


import java.util.Map;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import cucumber.api.java.en.Then;

public class BookingHotelStep {
	
	PageObjectManager pom =new PageObjectManager();
	@Then("User Should Book Hotel {string},{string} and {string}")
	public void userShouldBookHotelAnd(String firstname, String lastname, String address, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 List<Map<String,String>> m =dataTable.asMaps();
	 String ccNo = m.get(2).get("CreditCardNo");
	 String ccType = m.get(2).get("CreditCardType");
	 String ccExp = m.get(2).get("Month");
	 String ccYear = m.get(2).get("Year");
	 String ccCvv = m.get(2).get("CCVNo");
	 
		pom.getBookingHotelPage().bookHotel(firstname, lastname, address, ccNo, ccType, ccExp, ccYear, ccCvv); 
	}

	@Then("User Should Verify Message After Booking {string}")
	public void userShouldVerifyMessageAfterBooking(String string) {
	   String bookingConformation = pom.getBookingHotelPage().bookingConformation();
	   Assert.assertEquals("verify the search hotel", bookingConformation, string);
	}

	@Then("User Should Book Hotel Without Filling All Mandatory Feilds")
	public void userShouldBookHotelWithoutFillingAllMandatoryFeilds() {
	   pom.getBookingHotelPage().bookHotel();
	}

	@Then("User Should Verify All Error Message After Booking {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAllErrorMessageAfterBookingAnd(String fname, String lname, String address, String ccno, String cardtype, String ExpMonth, String cvno) {
		Assert.assertTrue("Verify firstNameError", pom.getBookingHotelPage().pleaseSelectFirstNameError().contains(fname));
		Assert.assertTrue("Verify lastNameError", pom.getBookingHotelPage().pleaseSelectLastNameError().contains(lname));
		Assert.assertTrue("Verify addressError", pom.getBookingHotelPage().pleaseSelectAddressError().contains(address));
		Assert.assertTrue("Verify ccnoError", pom.getBookingHotelPage().pleaseSelectCardNumberError().contains(ccno));
		Assert.assertTrue("Verify cctypeError", pom.getBookingHotelPage().pleaseSelectcardTypeError().contains(cardtype));
		Assert.assertTrue("Verify expmonthError", pom.getBookingHotelPage().pleaseSelectExpiryMonthError().contains(ExpMonth));
		Assert.assertTrue("Verify cvvError", pom.getBookingHotelPage().pleaseSelectCvNumberError().contains(cvno));
		
		
	
	}


}
                                       