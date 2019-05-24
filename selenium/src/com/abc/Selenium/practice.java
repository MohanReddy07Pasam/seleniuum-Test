package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("mohan reddy");
		driver.findElement(By.id("lastname")).sendKeys("pasam");
		//driver.findElement(By.className("input-text validate-email required-entry")).sendKeys("mrpasam@gmail.com");
		driver.findElement(By.id("email_address")).sendKeys("mrpasam@gmail.com");
		WebElement country=driver.findElement(By.id("country"));
		Select s=new Select(country);
		s.selectByVisibleText("India");
		WebElement mycompany=driver.findElement(By.id("customer_company_type"));
		Select s1=new Select(mycompany);
		s1.selectByIndex(2);
		WebElement myrole=driver.findElement(By.id("customer_individual_role"));
		Select s2=new Select(myrole);
		s2.selectByIndex(2);
		driver.findElement(By.id("password")).sendKeys("Qwerty@1234");
		driver.findElement(By.id("confirmation")).sendKeys("Qwerty@1234");
		Thread.sleep(5000);
		driver.findElement(By.id("agree_terms")).click();
	

		
		
		
		
	}
	

}
