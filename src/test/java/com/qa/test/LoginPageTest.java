package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage  loginpage;
	HomePage   homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
		}
				
	@Test (priority=1)
	public void loginpageTitleTest() {
		String Title = loginpage.validateloginpagetitle();
		Assert.assertEquals(Title, "My Store");
	}
		
	@Test (priority=2)
	public void loginTest() throws InterruptedException {
		 String Title = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 Assert.assertEquals(Title, "Login - My Store");
		 
			
	}
			
	@AfterMethod	
	public void teardown() {
		driver.quit();
	}
		

	}

