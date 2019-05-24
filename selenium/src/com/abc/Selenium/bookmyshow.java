package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class bookmyshow {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/bengaluru");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("wzrk-cancel")).click();
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.linkText("Movies"));	
		action.moveToElement(search).click().pause(2000).build().perform();
		WebElement maharshi=driver.findElement(By.xpath("//div[@class='cards']"));
		action.moveToElement(maharshi).click().pause(3000).build().perform();
		driver.findElement(By.xpath("//a[@class='showtimes btn _cuatro']")).click();
		driver.findElement(By.xpath("//a[@href='/buytickets/maharshi-bengaluru/movie-bang-ET00081372-MT/tomorrow']/div/span")).click();
		driver.findElement(By.xpath("//a[@href='/booktickets/PVEG/33986']")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.id("pop_3")).click();
		driver.findElement(By.className("action-btn")).click();
		driver.findElement(By.id("B_3_04")).click();
		driver.findElement(By.id("btmcntbook")).click();
		
		
		
		
	}

}
