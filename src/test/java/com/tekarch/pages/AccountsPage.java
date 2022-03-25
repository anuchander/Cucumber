package com.tekarch.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tekarch.base.BasePage;
import com.tekarch.base.BaseTest;

public class AccountsPage extends BasePage{
		
		static WebDriver  driver;
		public AccountsPage() {
			super(driver = BaseTest.getDriver());
			
				
		}
		
}
