package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class manengto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("mrpasam@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pass")).sendKeys("Qwerty@1234");
		driver.findElement(By.id("Send2")).click();
	
		

	}

}
