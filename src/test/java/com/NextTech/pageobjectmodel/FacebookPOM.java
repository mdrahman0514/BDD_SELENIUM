//Package
package com.NextTech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Class
public class FacebookPOM {

	//WebDriver is an interface here and helps to take to web/Internet and driver is a global variable
	WebDriver driver;
	
	/*Constructor:
	 * Constructor is not a method, but a special type of method 
	 * 1. Constructor name  must match its class name and there is no returnType,but 
	 * Method name can be any meaningful name and it does not have to match with className 
	 * and there is a returnType
	 */
	
	//Constructor
	public FacebookPOM(WebDriver driver){
		this.driver=driver;//this means this class, driver before equal is global and after is local variable
		PageFactory.initElements(driver, this);//It helps to keep all webElements
	}

	//Locator(id)
	@FindBy(name="email")//object(emailButton) found by name without using xPath
	WebElement sendKeys_email;//sendKeys is used to Type like when we have to type input
	public WebElement email(){//method
		return sendKeys_email;//return
	}

	//Locator(id)
	@FindBy(id="pass")//object(emailButton) found by name without using xPath
	WebElement sendKeys_password;//sendKeys is used to Type like when we have to type input
	public WebElement password(){//method
		return sendKeys_password;//return
	}



	//Locator(id)
	@FindBy(name="login")//object(emailButton) found by name without using xPath
	WebElement click_Login;//sendKeys is uesd to Type like when we have to type input
	public WebElement Login(){//method
		return click_Login;//return

	}




}


