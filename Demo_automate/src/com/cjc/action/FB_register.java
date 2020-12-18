package com.cjc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_register {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php?locale=en_GB");
	driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Admin");
	driver.findElement(By.xpath("")).sendKeys("AdminAAAAA");
	driver.findElement(By.xpath("")).sendKeys("Admin12");

	
}
}
