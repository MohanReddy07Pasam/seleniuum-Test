package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandclass {

	public static void main(String[] args) {
		String url="https://www.fb.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
		element.sendKeys("mrpasam@gmail.com");

	}

}
