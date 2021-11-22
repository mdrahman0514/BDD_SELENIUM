package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPOM {
	
	WebDriver driver;
	
	public AmazonCartPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="//*[@id=\"nav-cart-text-container\"]/span[2]")
	WebElement click_Cart;
	public WebElement Cart() {
		return click_Cart;
		
		
	}
	
	
	
}
