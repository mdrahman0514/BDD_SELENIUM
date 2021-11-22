package com.NextTech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NextTech.pageobjectmodel.BestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestSeller {
	
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		//how to open browser
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  //how to open url
		   driver.get("https://amazon.com");
		   
		   //create an object
   
	}

	@When("^user clicks on Bestseller Option$")
	public void user_clicks_on_Bestseller_Option() throws Throwable {
		//Create an object of BestSellerPOM Class
		BestSellerPOM obj = new BestSellerPOM(driver);
		//call bestseller method and then dot click method
		obj.bestseller().click();
	    
	}

	@Then("^user should be able to redirect the Bestseller Page$")
	public void user_should_be_able_to_redirect_the_Bestseller_Page() throws Throwable {
	 
	}


}
