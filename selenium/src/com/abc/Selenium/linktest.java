package com.abc.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
		String url="https://www.fb.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement link=driver.findElement(By.linkText("Forgotten account?"));
		/*WebElement plink=driver.findElement(By.partialLinkText("acc"));*/
		link.click();
		/*plink.click();*/
	}

}
/* such elements whose keeps on chaning is called dynamic elements To handle elements  we make use elements partialLinkedText method */