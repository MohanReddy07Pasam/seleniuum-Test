package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class gmailpractice {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();/*maximize chromeBrower*/
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//use a URL that delays loading elements
			driver.get("https://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("mohanpasam123@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[type()='password']")).sendKeys("XXXXxxxxxXX");
			driver.findElement(By.name("password")).sendKeys("Amma@1234");
			driver.findElement(By.id("passwordNext")).click();
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			driver.findElement(By.id(":ql")).sendKeys("suryadeepakp96@gmail.com");
			driver.findElement(By.id(":q3")).sendKeys("hi practice");
			driver.findElement(By.id(":r8")).sendKeys("Here are details related to using waits with Selenium WebDriver in Java. According to the Selenium documentation, at the moment, there are two different type of waits: explicit and implicit.");
			driver.findElement(By.id(":pt")).click();
			driver.findElement(By.xpath("//span[@class='gb_ya gbii']")).click();
			driver.findElement(By.linkText("Sign out")).click();
			driver.quit();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
