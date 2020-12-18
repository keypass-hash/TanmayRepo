package com.cjc.listener2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_main {

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
		driver.get("https://www.spicejet.com/");
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
		System.out.println("Before method execute successfully");
	}
	@Test
	public void gettest1()
	{
		/*driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		  
		  while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2'][class='ui-datepicker-month']")).getText().contains("June 2021")) {
			  {
			  driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", next);
		  
		  }
		  
		  List<WebElement> day=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td//a"));
		  System.out.println(day);
		  for(WebElement ele: day) {
			  String day_chk=ele.getText();
			  System.out.println(day_chk);
			  if(day_chk.equals("27")) 
			  
			  {
				  JavascriptExecutor js=(JavascriptExecutor)driver;
				  js.executeScript("arguments[0].click();", ele);
				  break;
			  }
		  }
		  }*/
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		  
		  while(!driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left'] [class='ui-datepicker-title']")).getText().contains("June 2021")) {
			  {
			  driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right'] [class='ui-datepicker-next ui-corner-all']"));
			 
			  for(int i=1;i<8;i++)
			  {
		      driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			  }

		  }
		  
		  List<WebElement> day=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td//a"));
		  System.out.println(day);
		  for(WebElement ele: day) {
			  String day_chk=ele.getText();
			
			  if(day_chk.equals("27")) 
			  
			  {
				  JavascriptExecutor js=(JavascriptExecutor)driver;
				  js.executeScript("arguments[0].click();", ele);
				  break;
			  }
		  }
		
		  }
		
		
		
		
	}
		

	@AfterMethod
	public void ss()  
	{	
    System.out.println("after method ");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	
	
}
