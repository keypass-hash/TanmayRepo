package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\indexhtml_filr\\index.html");	
        driver.findElement(By.id("uid")).sendKeys("Username");
        driver.findElement(By.name("pass")).sendKeys("Password");
        WebElement dropdown=driver.findElement(By.tagName("select"));
        Select sc=new Select(dropdown);
        
        sc.selectByIndex(2);
        
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Password?")).click();

    
}}
