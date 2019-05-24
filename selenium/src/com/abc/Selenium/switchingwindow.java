package com.abc.Selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
		driver.manage().window().maximize();/*maximize chromeBrower*/
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//use a URL that delays loading elements
		driver.get("file:///C:/Users/mrpas/Desktop/page1.html");
		WebElement link1=driver.findElement(By.linkText("goto page 2"));
		Thread.sleep(1000);
		link1.click();
		/* find only one address of window  we are using string */
		System.out.println(driver.getWindowHandle());
		/* find all address of windows and storing string pattern format we can you use set<String> collection*/
		Set<String> allids=driver.getWindowHandles();
		System.out.println(allids);
		for(String s:allids)
		{
			driver.switchTo().window(s);
		}
		WebElement link2=driver.findElement(By.linkText("goto page 3"));
		Thread.sleep(1000);
		link2.click();

	}

}
