package com.cjc.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) 
    {
         System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://demo.guru99.com/test/ajax.html");
       /*  List<WebElement> elements = driver.findElements(By.name("name"));
         System.out.println("Number of elements:" +elements.size());

         for (int i=0; i<elements.size();i++){
           System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
         }*/

     /*   String title=driver.getTitle();
         System.out.println(title);
         String curl=driver.getCurrentUrl();
         System.out.println(curl);
         String pgs=driver.getPageSource();
         System.out.println(pgs);
         driver.navigate().to("https://classroom.google.com/h");
         driver.navigate().back();*/
         
         
         driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("password");
         driver.findElement(By.className("_sv4")).click();
         driver.switchTo().window("https://classroom.google.com/h");
  
         
         
         
    }
	
	
}
