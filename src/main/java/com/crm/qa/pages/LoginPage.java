package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//*[@class='login']")
	WebElement Signinbutton;
	
	@FindBy(name="email")
	WebElement UserName;

	@FindBy(name="passwd")
	WebElement PassWord;
	
	@FindBy(name="SubmitLogin")
	WebElement Login;

	//Initializing
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public String login(String Username, String Password) throws InterruptedException  {
	  Thread.sleep(5000);
	  Signinbutton.click();
	  UserName.sendKeys(Username);
	  PassWord.sendKeys(Password);
	  Login.submit();
	  return driver.getTitle();
	  
	}
}
