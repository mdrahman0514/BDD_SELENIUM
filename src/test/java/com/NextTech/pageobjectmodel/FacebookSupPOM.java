package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSupPOM {

	WebDriver driver;
	
	public FacebookSupPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Make sure to click on the button before taking xpath using any locator of 8 
	//Full xpath
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a") 
	WebElement click_CreateNewAccount;
	public WebElement CreateNewAccount(){
		return click_CreateNewAccount;
	}
	
	//Using name Locator
	@FindBy(name="firstname") 
	WebElement sendKeys_firstname;
	public WebElement firstname(){
		return sendKeys_firstname;
	}
	
	//Using name Locator
	@FindBy(name="lastname")
	WebElement sendKeys_lastname;
	public WebElement lastname(){
		return sendKeys_lastname;
		
		//return sendKeys_lastname;
	}
	
	@FindBy(name="reg_email__") //Using name Locator
	WebElement sendKeys_email;
	public WebElement email(){
		return sendKeys_email;	
	}
	
	@FindBy(name="reg_email_confirmation__") //Using name Locator
	WebElement sendKeys_confirmemail;
	public WebElement confirmemail(){
		return sendKeys_confirmemail;
			
	}
	
	//Using name Locator
	@FindBy(name="reg_passwd__") 
	WebElement sendKeys_NewPassword;
	public WebElement NewPassword(){
		return sendKeys_NewPassword;
		
			
	}
	//Using name Locator(Use select method in stepdefs)
	@FindBy(name="birthday_month") 
	WebElement select_month;
	public WebElement Month() {
		return select_month;
	}
	//Using name Locator(Use select method in stepdefs)
	@FindBy(name="birthday_day") 
	WebElement select_day;
	public WebElement Day() {
		return select_day;
	}
	//Using name Locator(Use select method in stepdefs)
	@FindBy(name="birthday_year") 
	WebElement select_year;
	public WebElement Year() {
		return select_year;
	}
	//Full xpath
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")
	WebElement click_Sex;
	public WebElement Female() {
		return click_Sex;
		
			
	}
	//Full xpath
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button")
	WebElement click_SignUp;
	public WebElement SignUp() {
		return click_SignUp;
	}
	
	
}
