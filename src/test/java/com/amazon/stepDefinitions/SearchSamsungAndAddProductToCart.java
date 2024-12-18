package com.amazon.stepDefinitions;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.amazon.pageObjects.HomePage;
import com.amazon.pageObjects.SamsungProductsPage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSamsungAndAddProductToCart {
	private AppiumDriver driver;
	private HomePage homePage;
	private SamsungProductsPage samsungProductsPage;
	
	public SearchSamsungAndAddProductToCart() {
		System.out.println("Initializing SearchSamsungAndAddProductToCartSteps...");
		this.driver=Hooks.getDriver();
		if(driver == null) {
			System.out.println("Driver is null in SearchSamsungAndAddProductToCartSteps constructor!");
			throw new RuntimeException("Driver is not initialized.");
		}
		
		this.homePage=new HomePage(driver);
		this.samsungProductsPage=new SamsungProductsPage(driver);
		}
	
	
	
	@Given("the user is on Amazon home page")
	public void userIsOnAmazonHomePage() {
		System.out.println("Amazon Home Page Displayed.");
		
	}
	
	@When("the user enters product name {string} in search field")
	public void userEntersProductName(String productName) {
		homePage.enterTextInSearchField(productName);
		
	}
		
		
		
	
	@When("the user clicks on search button")
	public void userClicksSearchButtonButton() {
		homePage.clickSearchButton();;
	}
	
	@When("the user selects the product")
	public void userSelectsTheProduct() {
		samsungProductsPage.selectSamsungGalaxy15Product();
		
	}
	
	@When("the user selects the quantity {string}")
	public void userSelectsQuantity(String quantity) {
		samsungProductsPage.clickQuantityDropdown();
		samsungProductsPage.selectQuantityValue(quantity);
	}
	
	@When("the user clicks on Add To Cart button")
	public void userClicksOnAddToCartButton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		samsungProductsPage.clickAddToCartButton();
		
	}
	
	@Then("the product should be added in cart")
	public void productAddedToCart() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(samsungProductsPage.addedToCartMessageVissible()==true) {
			System.out.println("Product added to cart");
		}else {
			System.out.println("Product not added to cart");
		}
		
		
	}

}
