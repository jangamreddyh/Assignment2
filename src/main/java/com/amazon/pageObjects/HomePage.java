package com.amazon.pageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends BasePage {
	
	private By searchField= By.xpath("//input[@class='nav-input nav-progressive-attribute' and @type='text']");
	private By searchButton= By.xpath("//input[@type='submit' and @class='nav-input']");

	
	public HomePage(AppiumDriver driver) {
		super(driver);
	}
	
	
	public void enterTextInSearchField(String searchItem) {
		driver.findElement(searchField).sendKeys(searchItem);
	}
	
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
	

}
