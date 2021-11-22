package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {

	WebDriver driver;

	//Constructor
	public AmazonSearchPOM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	//xPath of amazonSearch bar
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	WebElement click_AmazonSearch; //WebElement method
	public WebElement AmazonSearch(){ //method
		return click_AmazonSearch; //returnType
		}
	
	//xPath of amazonSearch bar
		@FindBy(id="nav-search-submit-button")
		WebElement click_Search; //WebElement method
		public WebElement search(){
			return click_Search; //method

		}
	
	
}
