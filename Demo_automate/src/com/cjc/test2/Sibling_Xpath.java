package com.cjc.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sibling_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Ankush/Downloads/index.html");
	driver.findElement(By.xpath("//label[@for='uname']/following-sibling::input[@id='uid']")).sendKeys("admin");
	driver.findElement(By.xpath("//label[@for='password']/following-sibling::input[@id='pid']")).sendKeys("admin123");
	WebElement driver1=driver.findElement(By.xpath("//label[@for='password']/following-sibling::select[@id='browser']"));
	Select sc1=new Select(driver1);
	sc1.selectByIndex(2);
	driver.findElement(By.xpath("//select[@id='browser']/following-sibling::button[@id='login']")).click();
	driver.findElement(By.xpath("//span[@class='password']/preceding-sibling::button[@id='cancel']")).click();

}
}
