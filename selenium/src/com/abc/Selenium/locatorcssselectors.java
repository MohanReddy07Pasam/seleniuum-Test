package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorcssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="https://www.fb.com";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			WebElement element = driver.findElement(By.cssSelector("input#email"));
			element.sendKeys("mrpasam@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
