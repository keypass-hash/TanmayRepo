package com.cjc.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
  // driver.get("http://demo.guru99.com/test/simple_context_menu.html");
  //  driver.get("https://www.citybluetechnologies.com/");
    driver.get("https://www.phptravels.net/home");

    
 /*  Actions a=new Actions(driver);
    WebElement e=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
    a.doubleClick(e).build().perform();*/
    
  /*  List<WebElement> e1=driver.findElements(By.tagName("a"));
    int count=e1.size();
    System.out.println(count);*/
 
 /*  Actions action= new Actions(driver);
    WebElement element=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    action.contextClick(element).perform();*/
    
    Actions action=new Actions(driver);
    WebElement ele=driver.findElement(By.xpath("//a[@id='dropdownCurrency' and @aria-expanded='false']"));
    action.moveToElement(ele).perform();
    
    
}
}
