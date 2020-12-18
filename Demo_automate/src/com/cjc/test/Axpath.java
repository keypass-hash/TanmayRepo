package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axpath {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/register");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@type='text']")).sendKeys("Admin");
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@name='lastname']")).sendKeys("AAAA");
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@name='phone']")).sendKeys("9999999999");
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@name='email']")).sendKeys("admin@gmail.com");
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@name='password']")).sendKeys("admin");
    driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child ::input[@name='confirmpassword']")).sendKeys("admin");
    driver.findElement(By.xpath("//div[@class='form-group']/child ::button[@type='submit']")).click();
    driver.close();
}
}
