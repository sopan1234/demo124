package com.qa.tests;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.loginPage;

public class LoginPageTest extends TestBase {

	HomePage homepage;

	loginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod

	public void setup() {

		initilization();

		loginpage = new loginPage();

	}

	@Test(priority = 1)

	public void loginpagetitletest() {

		String title = loginpage.validatelogin();

		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");

	}

	@Test(priority = 2)

	public void crmlogologoTest() {

		boolean flag = loginpage.validateCrmimage();

		Assert.assertTrue(flag);

	}

	@Test(priority = 3)
	public void loginTest() {
homepage=new HomePage(); 
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		

	}

	@AfterMethod

	public void Tearup() {

		driver.quit();
	}

}
