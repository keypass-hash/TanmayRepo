package com.cjc.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_css {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("adminadminadmin");
	driver.findElement(By.cssSelector("input[maxlength='20']")).sendKeys("5454545454");
	driver.findElement(By.cssSelector("input#username")).sendKeys("admin@gmail.com");
	driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("Pune Maha");
	driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Pune");
	driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Mumbai");
	driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("454545");
	WebElement dr=driver.findElement(By.cssSelector("select[name='country']"));
    Select sr=new Select(dr);
    sr.selectByIndex(3);
    

	
}
}
