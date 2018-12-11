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

public class HomePageTest extends TestBase {
	
	loginPage loginpage;
	
	HomePage homepage;
	
	TestUtils testutils;
	
	ContactPage contactpage;
	
	

public HomePageTest() {
	
	super();
}

@BeforeMethod

public void setup() {
	
	initilization();
	
	testutils=new TestUtils();
	
	loginpage = new loginPage();
	
	homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	
	
}


@Test(priority=1)
public void verifypageTilelTest() {
	
	String title=homepage.verifyTitlepage();
	
	Assert.assertEquals(title, "CRMPRO","title is not matched");
}

@Test(priority=2)

public void verifypageTitleLabel() {
	
	testutils.Switchtofreame();
	
	boolean flag=homepage.verifypagellabel();
	
	Assert.assertTrue(flag);
}

@Test(priority=3)
public void clickonconatcttest() {
	
	testutils.Switchtofreame();
	
	contactpage=homepage.clickoncontact();
	
}

@AfterMethod

public void tearup() {
	
	driver.close();
	
}
	

}
