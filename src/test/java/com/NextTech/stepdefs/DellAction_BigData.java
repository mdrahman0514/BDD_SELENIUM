package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.NextTech.pageobjectmodel.DellActionPOM;
import com.NextTech.pageobjectmodel.DellAction_BigDataPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction_BigData {
	WebDriver driver;
	
	@Given("^user goes to Dell homepage$")
	public void user_goes_to_Dell_homepage() throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to open url  driver.get method
		driver.get("https://www.dell.com");
		
		//how to maximize the browser
		driver.manage().window().maximize();
	}

	@When("^user lands on Solutions menu and see Big Data and click on Big Data$")
	public void user_lands_on_Solutions_menu_and_see_Big_Data_and_click_on_Big_Data() throws Throwable {
		Actions act =new Actions (driver);
		DellAction_BigDataPOM  obj =new DellAction_BigDataPOM (driver);
		act.moveToElement(obj.Solutions()).build().perform();
		obj.BigData().click();

		//Hard wait
		//Thread.sleep(2000);

	}

	@Then("^user redirects to Big Data page$")
	public void user_redirects_to_Big_Data_page() throws Throwable {
	    
	}


}
