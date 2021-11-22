package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPOM {


	WebDriver driver;

	public GmailPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}


	@FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[5]/div/div/div[2]")
	WebElement act_signin;
	public WebElement signin() {
		return act_signin;

	}
	
		//@FindBy(name="name=\"identifier")
	
	    @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
		WebElement act_email;
		public WebElement email() {
			return act_email;

		}

		@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/div[2]")
		WebElement click_next;
		public WebElement next() {
			return click_next;

		}


		@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
		WebElement act_password;
		public WebElement password() {
			return act_password;	
		}


		@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/div[2]")
		WebElement act_Next;
		public WebElement Next() {
			return act_Next;

		}



	}
