package com.pages;






import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;



public class SearchHotelPage extends Baseclass {

	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;

	@FindBy(id="room_type")
	private WebElement roomType;

	@FindBy(id="room_nos")
	private WebElement roomNo;

	@FindBy(id="datepick_in")
	private WebElement dateIn;

	@FindBy(id="datepick_out")
	private WebElement dateout;

	@FindBy(id="adult_room")
	private WebElement adultRoom;

	@FindBy(id="child_room")
	private WebElement childRoom;

	@FindBy(id="Submit")
	private WebElement btnSubmit;
	

    @FindBy(xpath="//span[contains(text(),'Please ')]")
    private WebElement PleaseSelectHotel;
    
    @FindBy(id="checkin_span")
    private WebElement CheckInWrong;
    @FindBy(id="checkout_span")
    private WebElement CheckOutWrong;
    @FindBy(xpath="(//td[@class='login_title'])[1]")
	private WebElement SelectHotelText;
    
	public WebElement getSelectHotelText() {
		return SelectHotelText;
	}

	public WebElement getCheckInWrong() {
		return CheckInWrong;
	}

	public WebElement getCheckOutWrong() {
		return CheckOutWrong;
	}

	public WebElement getPleaseSelectHotel() {
		return PleaseSelectHotel;
	}



	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void searchHotel(String location, String hotels, String roomType, String roomNo, String dateIn,
			String dateOut, String adultRoom, String childRomm) {
		selectDropDownByVisibleText(getLocation(),location);
		selectDropDownByVisibleText(getHotels(),hotels);
		selectDropDownByVisibleText(getRoomType(),roomType);
		selectDropDownByVisibleText(getRoomNo(),roomNo);
		clear(getDateIn());
		sendKeys(getDateIn(),dateIn);
		clear(getDateout());
		sendKeys(getDateout(),dateOut);
		selectDropDownByVisibleText(getAdultRoom(),adultRoom);
		selectDropDownByVisibleText(getChildRoom(),childRomm);
		click(getBtnSubmit());

	}

	public void searchHotel(String location,String roomNo, String dateIn,String dateOut, String adultRoom ) {
		selectDropDownByVisibleText(getLocation(),location);
		selectDropDownByVisibleText(getRoomNo(),roomNo);
		clear(getDateIn());
		sendKeys(getDateIn(),dateIn);
		clear(getDateout());
		sendKeys(getDateout(),dateOut);
		selectDropDownByVisibleText(getAdultRoom(),adultRoom);
		click(getBtnSubmit());

	}
	
	public String selectHotelText() {
		String  searchHotelcontains = getText(getSelectHotelText());
		return searchHotelcontains;
		
	
	}
	
	public String pleaseSelectHotelText() {
		String pleaseSelectText = getText(getPleaseSelectHotel());
		return pleaseSelectText;
	}
	
	public String checkInDateWrong() {
		String text = getText(getCheckInWrong());
		return text;

	}
	
	public String checkOutDateWrong() {
		 String text = getText(getCheckOutWrong());
		return text;

	}
	
	
	public void searchHotel() {
		click(getBtnSubmit());

	}
	
	
	

	
}



