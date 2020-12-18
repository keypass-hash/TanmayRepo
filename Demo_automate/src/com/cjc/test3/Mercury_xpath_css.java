package com.cjc.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_xpath_css {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9999999999");
	driver.findElement(By.xpath("//input[@name='userName' and @id='userName']")).sendKeys("admin@gmail.com");
	driver.findElement(By.xpath("//input[@name='address1' and @size='40']")).sendKeys("Pune");
	driver.findElement(By.xpath("//input[@name='city' and @size='15']")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//input[@name='state' and @maxlength='40']")).sendKeys("Thane");
	driver.findElement(By.xpath("//input[@name='postalCode' and @size='15']")).sendKeys("444444");
	WebElement dr=driver.findElement(By.xpath("//select[@name='country' and @size='1']"));
     Select sr=new Select(dr);
     sr.selectByIndex(3);
 	driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
 	driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin");


}
}
