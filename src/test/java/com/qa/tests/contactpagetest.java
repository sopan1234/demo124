package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtils;
import com.jbk.qa.pages.ContactPage;
import com.jbk.qa.pages.HomePage;

import com.jbk.qa.pages.loginPage;

public class contactpagetest extends TestBase {

	loginPage login;

	HomePage homepage;

	ContactPage contact;

	TestUtils tutils;

	public contactpagetest() {

		super();

	}

	@BeforeMethod
	public void name() {

		initilization();

		tutils = new TestUtils();

		login = new loginPage();

		contact = new ContactPage();

		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));

		tutils.Switchtofreame();

		contact = homepage.clickoncontact();

	}

	@Test(priority = 1)
	public void verifycontactpagelabel() {

		Assert.assertTrue(contact.verifycontactlabel(), "contacts is not match");

	}

/*	@Test(priority = 2)

	public void selectBynameTest() {
		
		contact.selectcontactByName();
		
	}
*/	
	@Test(priority = 2)
	public void clickonnewcontacttext() {
		
		homepage.clickonnewContact();
		
		contact.clickonnewcontactvalue("Mr.","san", "gsh", "googele");
		
	}

	@AfterMethod

	public void teardown() {

		driver.quit();

	}

}
