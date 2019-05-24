package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatecommands {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	String url="https://www.magento.com";
	driver.manage().window().maximize();
	driver.navigate().to(url);
	driver.findElement(By.linkText("My Account")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	
	

	}

}
