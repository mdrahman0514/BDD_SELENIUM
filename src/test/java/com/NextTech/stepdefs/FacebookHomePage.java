package com.NextTech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookHomePage {
	
	WebDriver driver;
	
	@Given("^User visits Facebook Home page$")
	public void user_visits_Facebook_Home_page() throws Throwable {
		
		//how to open browser
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	 
	    
	    //how to open url
	    driver.get("https://facebook.com");
	}

	@Then("^User sholud see Facebook News Feed$")
	public void user_sholud_see_Facebook_News_Feed() throws Throwable {
		
	}

}
