package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class locatorclass {

	public static void main(String[] args) {
		
		
		String url="https://www.fb.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.className("inputtext")).sendKeys("mrpasam@gmail.com");
		driver.findElement(By.className("current time")).click();
		driver.findElement(By.className("inputtext")).sendKeys("mohan");
		driver.findElement(By.className("current time")).click();
		
	
	}

	}


