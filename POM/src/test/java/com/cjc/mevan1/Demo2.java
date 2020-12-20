package com.cjc.mevan1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demo2 {

	Properties pro=new Properties();
	public WebDriver driver;
	@BeforeSuite
	public void set_browser() throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\TB6\\demo.properties");
		pro.load(fis);
		System.out.println("Url of"+pro.getProperty("url"));
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void waitfortime()
	{
		System.out.println("Enter Url : ");
		driver.get(pro.getProperty("url"));
	}
	
	@BeforeClass
	public void maxbrowser()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void m1()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("After mtd");
	}
	
}
