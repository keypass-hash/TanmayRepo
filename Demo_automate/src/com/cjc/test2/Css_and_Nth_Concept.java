package com.cjc.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_and_Nth_Concept {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Ankush/Downloads/index.html");
	driver.findElement(By.cssSelector("div.container>input#uid :nth-child(2)")).sendKeys("admin");
	/*driver.findElement(By.xpath("div.container>input#uid :nth-child(2)")).sendKeys("admin");
	driver.findElement(By.xpath("div.container>input#pid :nth-child(6)")).sendKeys("admin123");
	WebElement driver1=driver.findElement(By.xpath("div.container>select#browser :nth-child(9)"));
	Select sc1=new Select(driver1);
	sc1.selectByIndex(2);
	driver.findElement(By.xpath("div.container>button#login :nth-of-type(1)")).click();
	driver.findElement(By.xpath("div.imgcontainer>button#cancel :nth-of-type(1)")).click();
*/}
}
