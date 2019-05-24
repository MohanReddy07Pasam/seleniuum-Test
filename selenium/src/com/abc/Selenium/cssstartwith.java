package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssstartwith {

	public static void main(String[] args) {
		
		String url="https://www.gmail.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	//driver.findElement(By.cssSelector("input[id^='iden']")).sendKeys("abc@gmail.com");
	//driver.findElement(By.cssSelector("input[id$='rId']")).sendKeys("abc@gmail.com");
	driver.findElement(By.cssSelector("input[id*='ent']")).sendKeys("abc@gmail.com");
	/*1. navigate  mangeto 
	 *2. website
	 *3. click my account 
	 *4.enter the  email and password 
	 *5.click on log out
	 *6.close the webrowser*/
		
		
		

	}

}
