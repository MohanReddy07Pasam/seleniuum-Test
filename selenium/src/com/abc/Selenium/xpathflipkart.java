package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathflipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		
		WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("iphone 7 rose gold");
			Thread.sleep(1000);
			driver.findElement(By.className("vh79eN")).click();
			//driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Rose Gold, 32 GB)']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[(text()='Apple iPhone 7 (Rose Gold, 32 GB)')]/../../div[2]/div[1]/div[1]/div[1]")).click();
	}

}
