package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExecutiveProfilePOM {

	WebDriver driver;

	public ExecutiveProfilePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	WebElement act_Company;
	public WebElement Company() {
		return act_Company;
	}


	@FindBy(xpath="//a[@href=\"company/about-us/executive-profiles/\"]")
	WebElement click_ExecutiveProfile;
	public WebElement ExecutiveProfile() {
		return click_ExecutiveProfile;

	}
}
