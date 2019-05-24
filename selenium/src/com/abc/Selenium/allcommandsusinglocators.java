package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allcommandsusinglocators {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("mrpasam@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("login[password]")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.id("send2")).click();
		

	}

}
