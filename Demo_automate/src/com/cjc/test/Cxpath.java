package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ankush/Downloads/A.html");
		driver.findElement(By.xpath("//label[@for='email']/following-sibling::input[@name='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//label[@for='psw-repeat']/preceding-sibling::input[@id='psw']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']/preceding-sibling::*[3]")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@type='password']/following-sibling::*[5]")).click();
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter Email']")).sendKeys("admin@123");
        Thread.sleep(4000);
		driver.close();
	}
}
