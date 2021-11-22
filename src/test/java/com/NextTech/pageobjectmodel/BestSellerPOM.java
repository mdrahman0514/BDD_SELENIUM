//Package
package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//class
public class BestSellerPOM {
	//WebDriver is an interface here and helps to get web/Internet and driver is a global variable
	WebDriver driver;

	/*
	 * Constructor is not a method but a special type of method
	 * 1. ConstructorName and className should be same
	 * 2. Constructor has no return type
	 */
	
	//Constructor
	public BestSellerPOM (WebDriver driver) {
		//this means this class(BestSellerPOM), first driver is global variable 
		//then after equal driver is local variable
		this.driver = driver;
		//PageFactory helps to keep webElement 
		PageFactory.initElements(driver, this);
	}

	//xPath
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"]")
	
	//webElement click_bestseller,
	WebElement click_bestseller;
	
	//WebElement method
	public WebElement bestseller(){ 
		//returnType
		return click_bestseller;


	}


}
