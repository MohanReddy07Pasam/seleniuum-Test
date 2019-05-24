package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://www.fb.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement email=driver.findElement(By.id("email"));/* use locator id and findelement */
		email.sendKeys("mrpasam@gmail.com");/* use enter the gmail you usee the sendkey method*/
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("mohanreddy");
		System.out.println(pass.isEnabled());
		System.out.println(pass.isDisplayed());
		
	}

}
