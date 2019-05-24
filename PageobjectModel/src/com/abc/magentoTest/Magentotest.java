package com.abc.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObjects.Login;
import com.abc.magentoObjects.Logout;
import com.abc.magentoObjects.Welcome;

public class Magentotest {

	public static void main(String[] args) {
		
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("http://www.magento.com");
		Welcome w=new Welcome(Driver);
		w.ClickOnMyAccount();
		Login l=new Login(Driver);
		l.email();
		l.pass();
		l.login();
		Logout ll=new Logout(Driver);
		ll.clickonlogout();
		
		

	}

}
