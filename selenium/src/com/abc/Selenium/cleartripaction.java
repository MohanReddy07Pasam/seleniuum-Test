package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class cleartripaction {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("RoundTrip")).click();
		Actions action=new Actions(driver);
		WebElement from=driver.findElement(By.id("FromTag"));
		action.moveToElement(from).click().sendKeys("hyd").pause(3000).sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ENTER).build().perform();
		WebElement To=driver.findElement(By.id("ToTag"));
		action.moveToElement(To).click().sendKeys("ban").pause(3000).sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.linkText("11")).click();
		driver.findElement(By.linkText("24")).click();
		Select adults=new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		adults.selectByIndex(2);
		Select child=new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		child.selectByIndex(2);
		Select infrants=new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
		infrants.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.id("SearchBtn")).click();
	}

}
