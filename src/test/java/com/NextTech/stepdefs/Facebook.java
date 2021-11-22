//Package
package com.NextTech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NextTech.pageobjectmodel.FacebookPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Class
public class Facebook {

	//WebDriver is an interface here and helps to take to web/Internet and driver is a global variable`
	WebDriver driver;


	//1st Step of automation structure which we got from feature file Facebook.feature under Feature folder
	@Given("^user visits facebook home page$")
	public void user_visits_facebook_home_page() throws Throwable {

		//How to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		//How to open URL
		driver.get("https://Facebook.com");
	}

	//2nd Step
	@When("^user enters email address \"([^\"]*)\"$")
	public void user_enters_email_address(String arg1) throws Throwable {//method
		FacebookPOM obj = new FacebookPOM(driver);//Create an object of FacebookPOM Class
		obj.email().sendKeys(arg1);//call method by object name

	}

	//3rd Step
	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg2) throws Throwable {//method
		FacebookPOM obj = new FacebookPOM(driver);//Create an object of FacebookPOM Class
		obj.password().sendKeys(arg2);//call method by object name

	}

	//4th Step
	@Then("^user will be able to login to facebook$")
	public void user_will_be_able_to_login_to_facebook() throws Throwable {//method
		FacebookPOM obj = new FacebookPOM(driver);//Create an object of FacebookPOM Class
		obj.Login().click();//call method by object name

	}

}
