package com.abc.Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findnooflinks {

	public static void main(String[] args) {
		try {
			WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
			driver.manage().window().maximize();/*maximize chromeBrower*/
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//use a URL that delays loading elements
			driver.get("https://www.magento.com");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			int n=links.size();
			System.out.println(n);/* print all the elements in one pariticular order*/
			for(int i=0;i<n;i++)
			{
				System.out.println(links.get(i).getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
/*output:print all type of links in sequential order*/
