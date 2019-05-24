package com.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://account.magento.com/customer/account/create/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("customer_company_type"));
		drop.click();
		/*we are using dropdown and combobox*/
		Select s=new Select(drop);
		//s.selectByValue("selling");
		//s.selectByIndex(5);
		s.selectByVisibleText("Tech Partner");
		Thread.sleep(1000);
		

	}

}
