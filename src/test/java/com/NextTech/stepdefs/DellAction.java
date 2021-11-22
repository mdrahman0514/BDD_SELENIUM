package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.NextTech.pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;


	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to maximize the browser
		driver.manage().window().maximize();

		//how to open url  driver.get method
		driver.get("https://www.dell.com/");

	}

	@When("^user goes to Solutions dropdown menu and see View All Solutions and click All solutions$")
	public void user_goes_to_Solutions_dropdown_menu_and_see_View_All_Solutions_and_click_All_solutions() throws Throwable {

		Actions act =new Actions (driver);
		DellActionPOM  obj =new DellActionPOM (driver);
		act.moveToElement(obj.Solutions()).build().perform();
		obj.AllSolutions().click();

		//Hard wait
		Thread.sleep(5000);

	}

	@Then("^user redirects to the solution portfolio$")
	public void user_redirects_to_the_solution_portfolio() throws Throwable {

		//how to close the window
		//driver.close();
		//driver.quit();

	}




}


