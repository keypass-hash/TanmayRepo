package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dxpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/register");
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined float-none']/child::input[@name='lastname']")).sendKeys("adminADMIN");

	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("admin");

	driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9999999999");

	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("admin@gmail.com");

	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin@123");

	driver.findElement(By.cssSelector("input[name='confirmpassword']")).sendKeys("admin@123");

	driver.findElement(By.cssSelector("//div[@class='form-group']/child::button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")).click();


}
}
