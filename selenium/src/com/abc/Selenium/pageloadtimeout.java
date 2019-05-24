package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageloadtimeout {

	public static void main(String[] args) {
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();

	}

}
/* pageload time outs is used to check weather the page is loaded with in specfied the required time or not*/
/*if the page is loded with in the specfied time the exction of the script will take place ,else no such exception is displayed */