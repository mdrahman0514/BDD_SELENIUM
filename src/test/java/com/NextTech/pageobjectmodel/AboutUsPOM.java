package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPOM {

	WebDriver driver;

	public AboutUsPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	WebElement act_Company;
	public WebElement Company() {
		return act_Company;
	}


	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/ul/div/div/div/p[1]/a")
	WebElement click_AboutUs;
	public WebElement AboutUs() {
		return click_AboutUs;
		
	}



}
