//Package
package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Class
public class TDD_FacebookLogin {
	
	//Method
	public void FacebookLogin() {
		
	//Declare variables	
	String email = "SAkter1963@gmail.com";
	String password = "Abc123";
	
	//How to open the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Use implicit wait between browser and url
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//How to open the url
	driver.get("www.Facebook.com");
	//How to maximize the window
	driver.manage().window().maximize();
	
	//Locators of webElement
	driver.findElement(By.name("name=\"email\"")).sendKeys(email);
	driver.findElement(By.name("name=\"pass\"")).sendKeys(password);
	driver.findElement(By.name("name=\"login\"")).click();
	
	}

}
