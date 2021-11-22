package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.NextTech.pageobjectmodel.ExecutiveProfilePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExecutiveProfile {

	WebDriver driver;
	@Given("^user lands on  Orangehrm home page$")
	public void user_lands_on_Orangehrm_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to maximize the browser
		driver.manage().window().maximize();

		//how to open url  driver.get method
		driver.get("https://www.orangehrm.com/");


	}

	@When("^user visits company dropdown menu and see ExecutiveProfile option and click on it$")
	public void user_visits_company_dropdown_menu_and_see_ExecutiveProfile_option_and_click_on_it() throws Throwable {
		Actions act =new Actions (driver);
		ExecutiveProfilePOM obj =new ExecutiveProfilePOM (driver);
		act.moveToElement(obj.Company()).build().perform();
		obj.ExecutiveProfile().click();

		//Hard wait
		Thread.sleep(2000);
	}

	

	@Then("^user can redirect to ExecutiveProfile page$")
	public void user_can_redirect_to_ExecutiveProfile_page() throws Throwable {

	}


}



