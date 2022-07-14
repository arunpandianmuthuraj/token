package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class SelectHotelPage extends Baseclass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="radiobutton_span")
	private WebElement PleaseSelectText;
	
	@FindBy(xpath="(//td[@class='login_title'])[2]")
	private WebElement BookHotel;

	public WebElement getBookHotel() {
		return BookHotel;
	}
	
	public WebElement getPleaseSelectText() {
		return PleaseSelectText;
	}
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
public void selectHotel() {
click(getSelectHotel());	
click(getBtnContinue());

}
public String bookHotelText() {
	String text = getText(getBookHotel());
	return text;
}
public String pleaseSelectText() {
	String text = getText(getPleaseSelectText());
	return text;

}
public String bookHotel() {
	String text = getText(getBookHotel());
	return text;

}


public void selectcontinue() {
	click(getBtnContinue());
	

}





}