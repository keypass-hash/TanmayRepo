package com.cjc.mevan1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {

	 public   WebDriver driver;  
		
		@BeforeSuite
		public void openBrowser()
		{
			
			System.setProperty("webdriver.ie.driver", "D:\\chrome_driver\\IEDriverServer.exe");
					  
			driver = new InternetExplorerDriver();
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
		@Test(dataProvider="getinfo")
		public void m1(String fname,String lname, String phone,String email,String addr, 
				String city,String state,String pin,String username,String pass,String conpass)
		{
		
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(addr);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pin);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(conpass);
		}
		
			
			
		@DataProvider
		public Object[][] getinfo()
		{
		Object[][] data=new Object[2][11];
		
		data[0][0]="admin";
		data[0][1]="admin";
		data[0][2]="admin";
		data[0][3]="admin";
		data[0][4]="admin";
		data[0][5]="admin";
		data[0][6]="admin";
		data[0][7]="admin";
		data[0][8]="admin";
		data[0][9]="admin";
		data[0][10]="admin";

		data[1][0]="admin";
		data[1][1]="admin";
		data[1][2]="admin";
		data[1][3]="admin";
		data[1][4]="admin";
		data[1][5]="admin";
		data[1][6]="admin";
		data[1][7]="admin";
		data[1][8]="admin";
		data[1][9]="admin";
		data[1][10]="admin";

			return data;	
		}
			
		
	   
		
	    }

		
	

