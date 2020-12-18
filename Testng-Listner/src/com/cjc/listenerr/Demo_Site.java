package com.cjc.listenerr;

import java.io.File;
import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners(com.cjc.listenerr.Demo_Itest_Listner.class)
public class Demo_Site {

public   WebDriver driver;  
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Before Suite");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
				  
		 driver=new ChromeDriver();
	}
	@BeforeTest
	public void enterUrl()
	{
		
		System.out.println("Before Test");
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	}
	
	@BeforeClass
	public void maximizeBrowser()
	{
		System.out.println("Before Class");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void getAllCookies()
	{
		System.out.println("Before Method");
		
	/*	Set<Cookie> cookies=driver.manage().getCookies();
		
		for (Cookie cookie : cookies)
		{
		System.out.println(cookie.getName());	
		}*/
	}
	@Test
	public void gettest1()
	{
		/*	String expectedTitle = "Register: Mercury Tours";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);*/
		
		System.out.println("First test pass");
	}
		

	@AfterMethod
	public void ss() throws IOException
	{	
     /*   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src,new File("D:\\IE_jar\\fb.png"));*/
		
		System.out.println("successfully take screenshot");
				
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
	
	
	

