package com.amazon.pageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class SamsungProductsPage extends BasePage{
	
	public SamsungProductsPage(AppiumDriver driver) {
		super(driver);
	}

	private By samsungGalaxy15Product= By.xpath("//span[text()='Samsung Galaxy M15 5G Prime Edition (Blue Topaz,6GB RAM,128GB Storage) | Super AMOLED Display| 50MP Triple Cam| 6000mAh Battery| MediaTek Dimensity 6100+ | 4 Gen. OS Upgrade & 5 Year Security Update']");
	private By addToCartButtonButton= By.xpath("//input[@title='Add to Shopping Cart' and @type='submit']");
	private By addedToCartMessage= By.xpath("//span[@class='a-size-base a-color-attainable added-to-cart-success a-text-bold' and text()='Added to cart']");
	private By quantityDropdown= By.xpath("//span[text()='Quantity:']");
	
	
	
	public void selectSamsungGalaxy15Product() {
		driver.findElement(samsungGalaxy15Product).click();
	}
	
	public void clickAddToCartButton() {
		driver.findElement(addToCartButtonButton).click();
	}
	
	public boolean addedToCartMessageVissible() {
		boolean value= driver.findElement(addedToCartMessage).isDisplayed();
		
		return value;
	}
	
	public void clickQuantityDropdown() {
		driver.findElement(quantityDropdown).click();
	}
	
	public void selectQuantityValue(String value) {
		int val=Integer.parseInt(value);
		val--;
		value=String.valueOf(val);
		driver.findElement(By.xpath("//a[@id='mobileQuantityDropDown_"+value+"']")).click();
	}
}
