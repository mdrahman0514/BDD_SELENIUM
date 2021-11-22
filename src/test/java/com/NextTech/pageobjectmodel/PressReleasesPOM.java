package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PressReleasesPOM {

	WebDriver driver;

	public PressReleasesPOM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath=" //*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	WebElement act_Company;
	public WebElement Company() {
		return act_Company;
	}


	@FindBy(xpath="//a[@href=\"resources/news/press-releases/\"]")
	WebElement click_PressReleases;
	public WebElement PressReleases() {
		return click_PressReleases;

	}
}
