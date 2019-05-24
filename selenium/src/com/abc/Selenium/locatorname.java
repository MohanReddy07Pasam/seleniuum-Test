package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://www.fb.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement email=driver.findElement(By.name("email"));/* use locator name and findelement(by.name()); */
		email.sendKeys("mrpasam@gmail.com");/* use enter the gmail you use the sendkeys method*/
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("mohanreddy");
	}

}

