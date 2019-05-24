package com.abc.magentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	@FindBy(linkText="Log Out")/*use FindBy Annotations*/
	WebElement logout;
	public Logout(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);/* POM*/
		
	}
	public void clickonlogout()
	{
		logout.click();
	}

}
