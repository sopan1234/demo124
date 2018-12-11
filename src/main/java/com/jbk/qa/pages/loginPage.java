package com.jbk.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverSessions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class loginPage extends TestBase {

	@FindBy(xpath = ".//*[@id='loginForm']/div/input[1]")
	WebElement username;

	@FindBy(name = "password") 
	WebElement pass;

	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	WebElement submit;

	@FindBy(xpath = ".//*[@id='navbar-collapse']/ul/li[2]/a/font")
	WebElement signup;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatelogin() {

		return driver.getTitle();

	}

	public boolean validateCrmimage() {

		return crmlogo.isDisplayed();

	}

	public HomePage login(String user, String pas) {

		username.sendKeys(user);

		pass.sendKeys(pas,Keys.ENTER);
		

		//submit.click();

		return new HomePage();

	}

}
