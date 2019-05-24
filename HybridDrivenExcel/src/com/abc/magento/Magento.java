package com.abc.magento;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {
	
	
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static int numofrow;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String data;
	public static String action;
	
	
	
	public static WebDriver driver;
	
	public static String getValue(int rownum,int cellnum)
	{
		row=sheet.getRow(rownum);
		//System.out.println(row);
		cell=row.getCell(cellnum);
		//System.out.println(cell);
		data=cell.getStringCellValue();
		System.out.println(data);
	 
		
		return data;
		
	}
	
 

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException{
		
		fis=new FileInputStream("C:\\Users\\mrpas\\feb\\HybridDrivenExcel\\src\\com\\abc\\utilites\\Book1.xlsx");
		book=new XSSFWorkbook(fis);
		//System.out.println(book);
		sheet=book.getSheetAt(0);
		//System.out.println(sheet);
		numofrow=sheet.getPhysicalNumberOfRows();
		System.out.println(numofrow);
		
		
		
		for(int i=1;i<numofrow;i++)
		{
			action=getValue(i,2);
			System.out.println(action);
			switch(action)
			{
			case "Open":
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			case "Navigate":
				driver.get(getValue(i,4));
				//System.out.println(getValue(i,4));
				break;
			case "Click":
				driver.findElement(By.xpath(getValue(i,3))).click();
				//System.out.println(getValue(i,3));
				break;
			case "Type":
				driver.findElement(By.xpath(getValue(i,3))).sendKeys(getValue(i,4));
				//System.out.println(getValue(i,3));
				//System.out.println(getValue(i,4));
				break;
			case "close":
				driver.close();
				
			}
		}
		
	
	}

}
