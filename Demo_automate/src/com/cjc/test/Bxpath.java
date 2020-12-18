package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bxpath {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gender']/child ::input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//div[@class='inputs']/child ::input[@id='FirstName']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//div[@class='inputs']/child ::input[@id='LastName']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//span[@class='required']/preceding-sibling ::input[@id='Email']")).sendKeys("admin@gmail.com");
		
		driver.findElement(By.xpath("//label[@for=\"Password\"]/following-sibling ::input[@id=\"Password\"]")).sendKeys("admin@123");
	
		driver.findElement(By.xpath("//label[@for='ConfirmPassword']/following-sibling ::input[@id='ConfirmPassword']")).sendKeys("admin@123");
	
		driver.findElement(By.xpath("//div[@class='buttons']/child ::input[@type='submit']")).click();
		
	   driver.close();
	
	
	
	}
	
}
