package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.internal.reflect.InjectableParameter;

public class TestBase {
	 
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public TestBase() {
		
		try {
			
			prop=new Properties();
			
			FileInputStream fs=new FileInputStream("D:\\sopan\\PomProject\\src\\main\\java\\com\\qa\\config\\config.properties");
			
			prop.load(fs);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void initilization() {
		
		
		String browsernme=prop.getProperty("browser");
		
		if(browsernme.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette","D:\\java by kiran\\gecodriver.exe");
			
			driver=new FirefoxDriver(); 
		}
		else if(browsernme.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\java by kiran\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
		
		
	}
	


}
