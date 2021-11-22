package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NextTech.pageobjectmodel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearch {

	WebDriver driver;

	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {


		try {
			//How to open browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MD Taybur Rahman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			//soft wait//implicit wait we use between url and browser
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			//How to open URL
			driver.get("https://amazon.com");

			//How to maximize the window and get all our web elements
			driver.manage().window().maximize();
			//Hard Wait(use anywhere)
			Thread.sleep(5000);//5000 milli-second = 5 seconds;
		}

		catch(Exception e) {

			System.out.println("The browser is not opening");
		}


	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonSearchPOM myObj = new AmazonSearchPOM(driver);
		myObj.AmazonSearch().sendKeys(arg1);
		//Explicit wait we use it between webElement
		WebDriverWait wait = new WebDriverWait(driver,20);
		//Thread.sleep(5000);
	}


	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonSearchPOM myObj = new AmazonSearchPOM(driver);
		myObj.search().click();
		//Explicit wait we use it between webElement
		WebDriverWait wait = new WebDriverWait(driver,20);//declared time 20 as seconds
	}



}
