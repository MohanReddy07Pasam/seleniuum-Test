package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
		driver.manage().window().maximize();/*maximize chromeBrower*/
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//use a URL that delays loading elements
		driver.get("https://www.cleartrip.com");
		WebElement s1=driver.findElement(By.id("SearchBtn"));
		System.out.println(s1.isEnabled());
		if(s1.isEnabled())
		{
			s1.click();
		}
		else
		{
			System.out.println("search fight button is not enabled");
		}

	}

}
