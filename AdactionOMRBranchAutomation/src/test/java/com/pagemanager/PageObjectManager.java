package com.pagemanager;

import com.pages.BookingConfirmationPage;
import com.pages.BookingHotelPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	/**
	 * 
	 * @author ArunPandian
	 * @Description To create object using singleton method 
	 * @CreationDate 25/06/2022
	 *
	 */

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingHotelPage bookingHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;
	public LoginPage getLoginPage() {
		return (loginPage==null) ? loginPage= new LoginPage(): loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null) ? searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null) ?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookingHotelPage getBookingHotelPage() {
		return (bookingHotelPage==null) ?bookingHotelPage=new BookingHotelPage():bookingHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)?cancelBookingPage=new CancelBookingPage():cancelBookingPage;
	}

}
