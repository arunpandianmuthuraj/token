package com.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;
/**
 * 
 * @author Arunpandian
 * @Description To book a hotel in Adactin Hotel
 * @CreationDate 29/06/2022
 *
 */
public class BookingHotelPage extends Baseclass{
	
	static String pleaseSelectFirstName;
	public BookingHotelPage() {
		PageFactory.initElements(driver, this);
	}

		@FindBy(id="first_name")
		private WebElement firstName;
		@FindBy(id="last_name")
		private WebElement lastName;
		@FindBy(id="address")
		private WebElement address;
		@FindBy(id="cc_num")
		private WebElement ccNo;
		@FindBy(id="cc_type")
		private WebElement ccType;
		@FindBy(id="cc_exp_month")
		private WebElement ccExp;
		@FindBy(id="cc_exp_year")
		private WebElement ccYear;
		@FindBy(id="cc_cvv")
		private WebElement ccCvv;
		@FindBy(id="book_now")
		private WebElement bookNow;
		
		@FindBy(xpath="(//td[@class='login_title'])[1]")
		private WebElement BookingConfromation;
		@FindBy(id="first_name_span")
		private WebElement PleaseSelectFirstNameError;
		@FindBy(id="last_name_span")
		private WebElement PleaseSelectLastNameError;
		@FindBy(id="address_span")
		private WebElement PleaseSelectAddressError;
		@FindBy(id="cc_num_span")
		private WebElement PleaseSelectCardNumberError;
		@FindBy(id="cc_type_span")
		private WebElement PleaseSelectcardTypeError;
		@FindBy(id="cc_expiry_span")
		private WebElement PleaseSelectExpiryMonthError;
		@FindBy(id="cc_cvv_span")
		private WebElement PleaseSelectCvNumberError;
		
		
		
		public WebElement getFirstName() {
			return firstName;
		}
		public WebElement getLastName() {
			return lastName;
		}
		public WebElement getAddress() {
			return address;
		}
		public WebElement getCcNo() {
			return ccNo;
		}
		public WebElement getCcType() {
			return ccType;
		}
		public WebElement getCcExp() {
			return ccExp;
		}
		public WebElement getCcYear() {
			return ccYear;
		}
		public WebElement getCcCvv() {
			return ccCvv;
		}
		public WebElement getBookNow() {
			return bookNow;
		}
		public WebElement getBookingConfromation() {
			return BookingConfromation;
		}
		public WebElement getPleaseSelectFirstName() {
			return PleaseSelectFirstNameError;
		}
		public WebElement getPleaseSelectLastName() {
			return PleaseSelectLastNameError;
		}
		public WebElement getPleaseSelectAddress() {
			return PleaseSelectAddressError;
		}
		public WebElement getPleaseSelectCardNumber() {
			return PleaseSelectCardNumberError;
		}
		public WebElement getPleaseSelectcardType() {
			return PleaseSelectcardTypeError;
		}
		public WebElement getPleaseSelectExpiryMonth() {
			return PleaseSelectExpiryMonthError;
		}
		public WebElement getPleaseSelectCvNumber() {
			return PleaseSelectCvNumberError;
		}
		/**
		 * 
		 * @param firstName
		 * @param lastName
		 * @param address
		 * @param dataTable
		 * @Description Used to book a hotel by filling all fields
		 * @CreationDate 29/06/2022
		 * 
		 */
		
		public void bookHotel(String firstname, String lastname, String address, String ccNo, String ccType, String ccExp, String ccYear, String ccCvv) throws InterruptedException {
			sendKeys(getFirstName(), firstname);
			sendKeys(getLastName(), lastname);
			sendKeys(getAddress(), address);
			sendKeys(getCcNo(), ccNo);
			selectDropDownByVisibleText(getCcType(), ccType);
			selectDropDownByVisibleText(getCcExp(), ccExp);
			selectDropDownByVisibleText(getCcYear(), ccYear);
			sendKeys(getCcCvv(), ccCvv);
			click(getBookNow());
			Thread.sleep(9000);
		
		}
		/**
		 * Description Used to book a hotel 
		 * @return String
		 * @CreationDate 29/06/2022
		 */
		public String bookingConformation() {
			String text = getText(getBookingConfromation());
			System.out.println(text);
			return text;

		}
		/**
		 * Description Used to book a hotel 
		 * @CreationDate 29/06/2022
		 * 
		 */
	
		public void bookHotel() {
			click(getBookNow());	

		}
		/**
		 * Description Used to book a hotel 
		 * @return String
		 * @CreationDate 29/06/2022
		 */
	
		public String pleaseSelectFirstNameError() {
			return  getText(getPleaseSelectFirstName());
		 
		}
		/**
		 * Description Used to book a hotel 
		 * @return String
		 * @CreationDate 29/06/2022
		 */
		public String pleaseSelectLastNameError() {
			return  getText(getPleaseSelectLastName());
		 
		}
		/**
		 * Description Used to book a hotel 
		 * @return String
		 * @CreationDate 29/06/2022
		 */
		public String pleaseSelectAddressError() {
			return getText(getPleaseSelectAddress());

		}
		/**
		 * Description Used to book a hotel 
		 * @return String
		 * @CreationDate 29/06/2022
		 */
		
		
		public String pleaseSelectCardNumberError() {
		return getText(getPleaseSelectCardNumber());

		}
		public String pleaseSelectcardTypeError() {
			return getText(getPleaseSelectcardType());
		}
		
		
		public String pleaseSelectExpiryMonthError() {
			return getText(getPleaseSelectExpiryMonth());

		}
		
		
		public String pleaseSelectCvNumberError() {
			return getText(getPleaseSelectCvNumber());

		}
		
		
		
		
		

	}


