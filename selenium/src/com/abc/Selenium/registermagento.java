package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registermagento {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.getPageSource();
		driver.manage().window().maximize();
		

}
}
