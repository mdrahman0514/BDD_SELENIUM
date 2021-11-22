package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.NextTech.pageobjectmodel.FacebookSupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSup {

	WebDriver driver;

	@Given("^user wants to land facebook URL$")
	public void user_wants_to_land_facebook_URL() throws Throwable {
		//How to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

		//How to open URL
		driver.get("https://Facebook.com");
		driver.manage().window().maximize();
	}

	@When("^user clicks at Create New Account$")
	public void user_clicks_at_Create_New_Account() throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		obj.CreateNewAccount().click();
		//Soft wait we use between url and browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Hard wait we use between web-elements
		//Thread.sleep(5000);

	}

	@When("^user inputs First name \"([^\"]*)\", Last name \"([^\"]*)\",$")
	public void user_inputs_First_name_Last_name(String arg1, String arg2) throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		//we use sendKeys to type in a box
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
	}

	@When("^user types email\"([^\"]*)\"$")
	public void user_types_email(String arg1) throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		obj.email().sendKeys(arg1);
	}

	@When("^user enters confirm email \"([^\"]*)\", New password \"([^\"]*)\"$")
	public void user_enters_confirm_email_New_password(String arg1, String arg2) throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		obj.confirmemail().sendKeys(arg1);
		obj.NewPassword().sendKeys(arg2);
	}
	@Then("^user selects dropdown Month and dropdown Day and dropdown Year$")
	public void user_selects_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {

		FacebookSupPOM sel=new FacebookSupPOM(driver);
		
		Select dropdown =new Select (sel.Month());
		dropdown.selectByIndex(6);

		Select dropdown1 =new Select (sel.Day());
		dropdown1.selectByValue("1");

		Select dropdown2 =new Select (sel.Year());
		dropdown2.selectByVisibleText("1963");
	}

	@Then("^user clicks on  Male$")
	public void user_clicks_on_Male() throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		//We use click to click in a button
		obj.Female().click();
	}

	@Then("^user clicks on signup button and redirect to facebook page$")
	public void user_clicks_on_signup_button_and_redirect_to_facebook_page() throws Throwable {
		FacebookSupPOM obj = new FacebookSupPOM(driver);
		obj.SignUp().click();
		//Thread.sleep(5000);//Hard wait
		//driver.close();//close window
		//driver.quit();//close all windose
		
	}


}
