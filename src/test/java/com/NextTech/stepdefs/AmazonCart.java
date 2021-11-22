package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NextTech.pageobjectmodel.AmazonCartPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCart {
	
	WebDriver driver;
	
	@Given("^user visits amazon Homepage$")
	public void user_visits_amazon_Homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.get("https://amazon.com/");
	     
	    
	}

	@When("^user click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		AmazonCartPOM obj = new AmazonCartPOM(driver);
		obj.Cart().click();
	}

	@Then("^user will be able to see cart page$")
	public void user_will_be_able_to_see_cart_page() throws Throwable {
	    
	}



}
