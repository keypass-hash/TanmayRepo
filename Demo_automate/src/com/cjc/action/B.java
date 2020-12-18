package com.cjc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");	
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
    driver.navigate().back();  
    Actions a=new Actions(driver);
    WebElement e=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
    a.doubleClick(e).build().perform();
    driver.navigate().back();  
    
    Actions action= new Actions(driver);
    WebElement element=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']"));
    action.contextClick(element).perform();
    
    
    
}	
}
