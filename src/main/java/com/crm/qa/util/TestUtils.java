package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtils extends TestBase {
	
	//public static long page_Load_Timeouts=20;
	
	//public static long Implicit_Wait=30;
	
	
	public void  Switchtofreame() {
		
		driver.switchTo().frame("mainpanel");	
		
	}
}
