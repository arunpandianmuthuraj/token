package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class LoginPage extends Baseclass {
	String attribute;
	String invalid;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
   
    
	@FindBy(id = "username")
	private WebElement txtUsername;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(id="username_show")
	private WebElement text;
	@FindBy(xpath="//b[contains(text(),'Invalid ')]")
    private WebElement invalidLogin;
	public WebElement getInvalidLogin() {
		return invalidLogin;
	}

	

	public WebElement getText() {
		return text;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String UserName, String Password) {
		sendKeys(getTxtUsername(), UserName);
		sendKeys(getTxtPassword(), Password);
		click(getBtnLogin());
	}
	public void loginWithKeys(String user,String pass) throws AWTException {
    	sendKeys(getTxtUsername(),user);
		sendKeys(getTxtPassword(),pass);
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
	}
	
	public void loginwithInvalidDetails(String UserName, String Password) {
		sendKeys(getTxtUsername(), UserName);
		sendKeys(getTxtPassword(), Password);
		click(getBtnLogin());
	}
	
	public String getAttribute() {
		 attribute = getAttribute(getText());
		return attribute;
		
	}
	
	public String invalid() {
		String invalid = getText(getInvalidLogin());
		System.out.println(invalid);
		return invalid;

	}



	
	
}