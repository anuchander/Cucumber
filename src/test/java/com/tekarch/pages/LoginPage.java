package com.tekarch.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tekarch.base.BasePage;
import com.tekarch.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver  driver;
	public LoginPage() {
		super(driver = BaseTest.getDriver());
	
		addObject("Username", By.id("username"));
		addObject("Password", By.id("password"));
		addObject("RememberMe", By.id("rememberUn"));	
		addObject("Login", By.name("Login"));
	}
	

}
