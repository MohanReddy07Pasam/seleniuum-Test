package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleassement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
		driver.manage().window().maximize();/*maximize chromeBrower*/
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//use a URL that delays loading elements
		driver.get("https://www.google.com");
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.name("q"));
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("abc technology ").sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}

}
