package com.abc.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablecount {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mrpas/Desktop/tableassigement.html");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='tab']/tbody/tr"));
		int rsize=rows.size();
		System.out.println("row is:"+rsize);
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='tab']/tbody/tr/th"));
		int csize=col.size();
		System.out.println("colum is:"+csize);
		int sum=0;
		for(int i=2;i<=rsize;i++)
		{
			WebElement element=driver.findElement(By.xpath("//table[@id='tab']/tbody/tr["+i+"]/td[5]"));
			System.out.println("------------------------------");
			String test=element.getText();
			System.out.println("------------------------------");
			System.out.println(test);
			sum=Integer.parseInt(test)+sum;
			System.out.println("subject-3:--->"+sum);
		}
		
		

	}

}
