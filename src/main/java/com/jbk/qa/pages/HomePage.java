package com.jbk.qa.pages;

import org.apache.http.cookie.SM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {
	
@FindBy(xpath="//td[contains(text(),'User: Naveen K ')]")
WebElement usernamelabel;

@FindBy(xpath=".//*[@id='navmenu']/ul/li[4]/a")
WebElement Contactslink;

@FindBy(xpath=".//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")
WebElement newcontact;

@FindBy(xpath="//td[contains(text(),'Deals')]")
WebElement Dealslink;


@FindBy(xpath="//td[contains(text(),'Tasks')]")
WebElement Taskslink;


public HomePage() {
	PageFactory.initElements(driver, this);
}


public boolean verifypagellabel() {
	
	return usernamelabel.isDisplayed();
	
}

public String verifyTitlepage() {
	
	return driver.getTitle();
}



public ContactPage clickoncontact() {
	
	
	Contactslink.click();
	
	return new ContactPage();
}


public Dealespage clickondeals() {
	
	Dealslink.click();
	
	return new Dealespage();
}

public tasklinkpage clickonTask() {
	
	Taskslink.click();
	
	return new tasklinkpage();
	
}

public void clickonnewContact() {
	
	Actions action=new Actions(driver);
	
	action.moveToElement(Contactslink);
	
	newcontact.click();
}
	
	
	

}
