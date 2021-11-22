package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAction_BigDataPOM {
	
	WebDriver driver;
	
	public   DellAction_BigDataPOM(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
		 
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
		 WebElement act_Solutions;
		 public WebElement Solutions() { 
		  return act_Solutions;
		  }
		
		
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[6]/a")
		 WebElement click_BigData;
	   public WebElement BigData() {
		return click_BigData; 
	  
	   }
		

}
