package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NextTech.pageobjectmodel.GmailPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Gmail {


	WebDriver driver;

	@Given("^user  visits Gmail homepage$")
	public void user_visits_Gmail_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");

		driver.manage().window().maximize();
		//Thread.sleep(5000);

	}

	@Then("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		GmailPOM obj = new GmailPOM(driver);
		obj.signin().click();
		Thread.sleep(5000);
	}

	@Then("^user will type email \"([^\"]*)\" and click on next button$")
	public void user_will_type_email_and_click_on_next_button(String arg1) throws Throwable {
		GmailPOM obj = new GmailPOM(driver);
		
		obj.email().sendKeys(arg1);
		obj.next().click();
		Thread.sleep(5000);

	}

	@Then("^user will  type password \"([^\"]*)\" and click on next button$")
	public void user_will_type_password_and_click_on_next_button(String arg1) throws Throwable {
		GmailPOM obj = new GmailPOM(driver);
		obj.password().sendKeys(arg1);
		obj.Next().click();

	}

	@Then("^user will signin successfully$")
	public void user_will_signin_successfully() throws Throwable {

	}


}

