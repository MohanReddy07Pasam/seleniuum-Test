package com.abc.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class lunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.gmail.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println("getting url:");
		String purl=driver.getCurrentUrl();
		System.out.println(purl);
		System.out.println("getting title:");
		String t=driver.getTitle();
		System.out.println(t);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.close();
	}

}
