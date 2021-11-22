package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.NextTech.pageobjectmodel.PressReleasesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PressReleases {
	
	WebDriver driver;
	
	@Given("^user goes to  Orangehrm homepage$")
	public void user_goes_to_Orangehrm_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to maximize the browser
		driver.manage().window().maximize();

		//how to open url  driver.get method
		driver.get("https://www.orangehrm.com/");

	    
	}

	@When("^user will enter company dropdown menu and view Press Releases option and click on it$")
	public void user_will_enter_company_dropdown_menu_and_view_Press_Releases_option_and_click_on_it() throws Throwable {
	    Actions act = new Actions(driver);
	    PressReleasesPOM obj = new PressReleasesPOM(driver);
	    act.moveToElement(obj.Company()).build().perform();
	    obj.PressReleases().click();
	    Thread.sleep(2000);
	}

	@Then("^user will redirect to Press Releases page$")
	public void user_will_redirect_to_Press_Releases_page() throws Throwable {
	   
	}

	
		
		
	}

