package com.linkedin.qa.pages;


import org.openqa.selenium.support.PageFactory;

import com.linkedin.qa.base.TestBase;



public class HomePage extends TestBase {

	
	
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String verifyHomePageTitle(){
		
		return driver.getTitle();
		
	}
	
	


	

	


	
	
	
	
	
	
	
}
