package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousekeyboard {

	public static void main(String[] args) {
	
		try {
			WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
			driver.manage().window().maximize();/*maximize chromeBrower*/
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//use a URL that delays loading elements
			driver.get("https://www.cleartrip.com");
			Actions action=new Actions(driver);/* refence use WebDriver*/
			 WebElement from=driver.findElement(By.id("FromTag"));
			action.moveToElement(from).click().build().perform();
			action.sendKeys("tri").pause(3000).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).pause(3000).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).pause(3000).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).pause(3000).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).pause(3000).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
