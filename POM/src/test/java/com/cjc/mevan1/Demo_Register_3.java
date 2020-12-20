package com.cjc.mevan1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Register_3 {
    public WebDriver driver;
	Properties pro=new Properties();
	@BeforeSuite
	public void openbrower() throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\TB6\\demo1.properties");
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		  
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void waitfor()
	{
		driver.get(pro.getProperty("url"));
	}
	
	
	@BeforeClass
	public void max()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void waiting()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void m1()
	{
		driver.findElement(By.name("firstName")).sendKeys(pro.getProperty("firstname"));
		driver.findElement(By.name("lastName")).sendKeys(pro.getProperty("lastname"));
		driver.findElement(By.name("phone")).sendKeys(pro.getProperty("phone"));
		driver.findElement(By.id("userName")).sendKeys(pro.getProperty("email"));
		driver.findElement(By.name("address1")).sendKeys(pro.getProperty("adress"));
		driver.findElement(By.name("city")).sendKeys(pro.getProperty("city"));
		driver.findElement(By.name("state")).sendKeys(pro.getProperty("state"));
		driver.findElement(By.name("postalCode")).sendKeys(pro.getProperty("code"));
		
		driver.findElement(By.name("email")).sendKeys(pro.getProperty("email"));
		driver.findElement(By.name("password")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(pro.getProperty("confirmPassword"));

		
		
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
}
