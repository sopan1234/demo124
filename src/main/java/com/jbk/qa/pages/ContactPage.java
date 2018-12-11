package com.jbk.qa.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{
	
	

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement verifycontactlabel;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement submit;
	
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycontactlabel() {
		
		return verifycontactlabel.isDisplayed();
		
	}
	
	 /*public void selectcontactByName() {
		
		driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[12]/td[1]/input")).click();
		
	}*/
	
	public void clickonnewcontactvalue(String title,String fname,String lname,String com) {
		
		Select s=new Select(driver.findElement(By.name("title")));
		
		s.selectByVisibleText(title);
		
		firstname.sendKeys(fname);
		
		lastname.sendKeys(lname);
		
		company.sendKeys(com);
		
		submit.click();
	}
	
	
	
	
	
}
