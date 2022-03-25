package com.tekarch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tekarch.base.BasePage;
import com.tekarch.base.BaseTest;

public class HomePage extends BasePage{
	
	static WebDriver  driver;
	public HomePage() {
		super(driver = BaseTest.getDriver());
		//a[@title='Leads Tab']
		addObject("Leads", By.xpath("//a[@title='Leads Tab']"));
		addObject("Contacts", By.xpath("//a[normalize-space()='Contacts']"));
		addObject("Dialog", By.xpath("//a[@id='tryLexDialogX']"));
			
	}
	
	

}