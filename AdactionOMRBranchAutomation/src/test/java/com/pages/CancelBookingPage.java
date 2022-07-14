



package com.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;



public class CancelBookingPage extends Baseclass {

public CancelBookingPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text()='Booked Itinerary']")
private WebElement clickItinarary;


@FindBy(id = "order_id_text")
private WebElement clickSearchBox;

@FindBy(id = "search_hotel_id")
private WebElement clickGoButton;



@FindBy(xpath="//input[@type='button'][1]")
private WebElement clickOrderId;


@FindBy(name = "cancelall")
private WebElement clickCancel;

@FindBy(id="search_result_error")
private WebElement BookingCancel;


//@FindBy(name = "ids[]")
//private WebElement selectId;
//public WebElement getSelectId() {
//	return selectId;
//}


public WebElement getBookingCancel() {
	return BookingCancel;
}

public WebElement getClickItinarary() {
	return clickItinarary;
}

public WebElement getClickOrderId() {
	return clickOrderId;
}

public WebElement getClickSearchBox() {
	return clickSearchBox;
}

public WebElement getClickGoButton() {
	return clickGoButton;
}


public WebElement getClickCancel() {
	return clickCancel;
}

public void cancelOrderId() throws InterruptedException {
	click(getClickItinarary());
	click(getClickOrderId());
	alretAccepct();
	Thread.sleep(4000);

}

public void cancelOrderId(String orderId) {
	click(getClickItinarary());
	sendKeys(clickSearchBox, orderId);
	click(getClickGoButton());
//	click(getSelectId());
	click(getClickCancel());
	alretAccepct();
	System.out.println("Deleted Successfully" );

}
public String bookingCancelText() {
	String bookingcancel = getText(getBookingCancel());
	return bookingcancel;
	
}


}














/*package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class CancelBookingPage extends BookingConfirmationPage{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_id_text")
	private WebElement orderbox;
	
	@FindBy(id="search_hotel_id")
	private WebElement ordersearch;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement caneclbtn;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnItinary;

	
	public WebElement getBtnItinary() {
		return btnItinary;
	}



	public WebElement getOrderbox() {
		return orderbox;
	}




	public WebElement getOrdersearch() {
		return ordersearch;
	}




	public WebElement getCaneclbtn() {
		return caneclbtn;
	}




	public void cancelOrderId() {
		
		sendKeys(getOrderId(), "02IL9Q5YK3");
		click(getOrdersearch());
		click(getCaneclbtn());
		alretAccepct();

	}
	

	public void cancelOrderId(String orderid) {
		click(btnItinary);
		sendKeys(getOrderbox(), orderid);
		click(getOrdersearch());
		click(getCaneclbtn());
		alretAccepct();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



*/