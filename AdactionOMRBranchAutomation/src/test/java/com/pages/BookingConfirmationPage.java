package com.pages;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;
/**
 * 
 * @author ArunPandian
 * @Description To confirm booking in Adactin Hotel
 * @CreationDate 24/06/2022
 *
 */
	public class  BookingConfirmationPage extends Baseclass {
		
		
		public BookingConfirmationPage() {
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmationPage;
	
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getBookingConfirmationPage() {
		return bookingConfirmationPage;
	}

	/**
	 * 
	 * @return String
	 * @Description Used to get order id
	 * @CreationDate 24/06/2022
	 * 
	 */


	public String getGetOrderId() {
		String orderId = getAttribute(orderNo);
		return orderId;
		
		
		
		
	}

	
	
	
	
	

	}
	
	
	
	
	
	
	
	/*	
		public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
		}
		static String orderIdno;
		@FindBy(id="order_no")
		private WebElement orderId;
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement btnItinary;

		public WebElement getOrderId() {
			return orderId;
		}

		public WebElement getBtnItinary() {
			return btnItinary;
		}

		
		public void orderId() {
		 orderIdno = getAttribute(getOrderId());
		 click(getBtnItinary());
		

		}
		
		*/




	