package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.NextTech.pageobjectmodel.AboutUsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUs {

	
	WebDriver driver;
	
	@Given("^user visits Orangehrm homepage$")
	public void user_visits_Orangehrm_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to maximize the browser
		driver.manage().window().maximize();

		//how to open url  driver.get method
		driver.get("https://www.orangehrm.com/");

	    
	}

	@When("^user goes to company dropdown menu and see AboutUs option and click on it$")
	public void user_goes_to_company_dropdown_menu_and_see_AboutUs_option_and_click_on_it() throws Throwable {

		Actions act =new Actions (driver);
		AboutUsPOM  obj =new AboutUsPOM (driver);
		act.moveToElement(obj.Company()).build().perform();
		obj.AboutUs().click();

		//Hard wait
		Thread.sleep(2000);
	}

	@Then("^user can be able to redirect to AboutUs page$")
	public void user_can_be_able_to_redirect_to_AboutUs_page() throws Throwable {
	    
	}

}
