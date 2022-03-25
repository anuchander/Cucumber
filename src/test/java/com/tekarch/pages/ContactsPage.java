package com.tekarch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tekarch.base.BasePage;
import com.tekarch.base.BaseTest;

public class ContactsPage extends BasePage{
	
	static WebDriver  driver;
	public ContactsPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("New", By.xpath("//input[@name='new']"));
		addObject("LastName" , By.id("name_lastcon2"));
		addObject("AccountName", By.id("con4"));
		addObject("Save", By.xpath("(//input[@name='save'])[1]"));
		addObject("CreateNewView", By.xpath("//a[normalize-space()='Create New View']"));
		addObject("ViewName", By.id("fname"));
		addObject("ViewUniqueName", By.id("devname"));
		addObject("RecentlyCreated", By.xpath("//select[@id='hotlist_mode']"));
		
			
	}
	
	

}
