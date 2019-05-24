package com.abc.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		String url="file:///C:/Users/mrpas/Desktop/Auto.html";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("fileupload")).click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("Documents\\Exec.exe");	

	}

}
