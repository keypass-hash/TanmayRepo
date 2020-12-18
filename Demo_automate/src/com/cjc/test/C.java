package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://demowebshop.tricentis.com/register");	
         driver.findElement(By.id("gender-male")).click();
    //     driver.findElement(By.className("text-box single-line")).sendKeys("AAAAA");
         
         
         WebElement element = driver.findElement(By.id("FirstName"));  
         element.sendKeys("JavaTpoint");  
         
         driver.findElement(By.name("LastName")).sendKeys("BBB");
         
         driver.findElement(By.className("Email")).sendKeys("admin@gmail.com");
         
        //driver.findElement(By.className("button-1 register-next-step-button")).click();
        //driver.findElement(By.id("register-button")).click();
         driver.findElement(By.name("register-button")).click();
	}
	
	
}
