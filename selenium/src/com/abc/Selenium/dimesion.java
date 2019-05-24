package com.abc.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimesion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d1 = new Dimension(1000000,0);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d1);

	}

}
