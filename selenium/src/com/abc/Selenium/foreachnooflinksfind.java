package com.abc.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreachnooflinksfind {

	public static void main(String[] args) {
		try {
			WebDriver driver= new ChromeDriver();/* start the chromeBrower using parent object WebDriver using (polymorphim)*/
			driver.manage().window().maximize();/*maximize chromeBrower*/
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//use a URL that delays loading elements
			driver.get("https://www.magento.com");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			for(WebElement e:links)
			{
				System.out.println(e.getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
