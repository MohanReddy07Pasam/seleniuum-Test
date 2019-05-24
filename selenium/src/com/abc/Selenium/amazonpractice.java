package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonpractice {
	WebDriver driver;
	public void drivercommands()
	 {
		try
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		getcommands();
		}
			catch(Exception e)
			{
				
			}
		
	 }
	public void getcommands() {
		try {
			
		
	driver.navigate().to("https://www.amazon.com");
	driver.findElement(By.linkText("Orders")).click();
	driver.findElement(By.id("ap_email")).sendKeys("mrpasam@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("ap_password")).sendKeys("Amma@7892");
	Thread.sleep(1000);
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(1000);
	WebElement d1=driver.findElement(By.linkText("Account & Lists"));
	Actions action=new Actions(driver);//you can use Actions class
	action.moveToElement(d1).perform();
	//Select s1=new Select(driver.findElement(By.xpath("//span[@class='nav-line-3']"));



	}
	catch(Exception e)
	{	
	}	
	}
	public static void main(String[] args) {
		amazonpractice test1=new amazonpractice();
		test1.drivercommands();
		

	}

}
