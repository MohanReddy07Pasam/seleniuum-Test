package com.abc.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/mrpas/Desktop/frames.html");
		driver.manage().window().maximize();

	}

}
