package com.tekarch.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tekarch.base.BasePage;
import com.tekarch.base.BaseTest;

public class LeadsPage extends BasePage{
	
	static WebDriver  driver;
	public LeadsPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("ViewLeads", By.xpath("//select[@id='fcf']"));
			
	}
	
	

}
