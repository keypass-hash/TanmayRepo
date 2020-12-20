package com.cjc.mevan1;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Register_4 {

	
	 public   WebDriver driver;  
		
		@BeforeSuite
		public void openBrowser()
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\ChromeDriver.exe");
					  
			driver = new ChromeDriver();
		}

		@BeforeTest
		public void enterUrl()
		{
			
			driver.get("http://demo.guru99.com/test/newtours/register.php");
		}
		
		@BeforeClass
		public void maximizeBrowser()
		{
			driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void getAllCookies()
		{
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		@Test
		public void m1() throws Exception
		{
		FileInputStream fis=new FileInputStream("‪D:\\TB6\\demo1.properties");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Demo1");
		
		XSSFRow row=sheet.getRow(3);
		
		XSSFCell col=row.getCell(0);
		
		String val=col.getStringCellValue();
		
		System.out.println(val);
		
		
			
		}
		
			
			
		
	
}
