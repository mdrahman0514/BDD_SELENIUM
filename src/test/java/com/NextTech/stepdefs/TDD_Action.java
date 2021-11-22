package com.NextTech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TDD_Action {

	public void Action() {

		//How to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//How to open the url
		driver.get("http://mrbool.com/");

		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.className("menulink"))).build().perform();

		driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/course\"]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

}



