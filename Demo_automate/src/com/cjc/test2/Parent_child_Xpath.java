package com.cjc.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parent_child_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Ankush/Downloads/index.html");
	
	driver.findElement(By.xpath("//div[@class='container']/child::input[@id='uid']")).sendKeys("admin");
	driver.findElement(By.xpath("//div[@class='container']/child::input[@id='pid']")).sendKeys("admin123");
	WebElement driver1=driver.findElement(By.xpath("//select[contains(@id,browser)]"));
	Select sc1=new Select(driver1);
	sc1.selectByIndex(2);
	driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
	driver.findElement(By.xpath("//div[@class='imgcontainer']/child::button[@id='cancel']")).click();

}
}
