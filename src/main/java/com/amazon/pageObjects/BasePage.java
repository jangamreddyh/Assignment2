package com.amazon.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	protected AppiumDriver driver;
	
	public BasePage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void dropdown(WebElement element, String value) {
	Select dropdown=new Select(element);
	dropdown.selectByValue(value);
	}
	
	

}
