package com.cjc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/big-diwali-sale-store?gclid=Cj0KCQiA7qP9BRCLARIsABDaZzirg4Q38yPBhpuOhh8RXUv_98mxsO01amOM3TWrsJ76Gp5qCErYgNwaAtaFEALw_wcB&ef_id=Cj0KCQiA7qP9BRCLARIsABDaZzirg4Q38yPBhpuOhh8RXUv_98mxsO01amOM3TWrsJ76Gp5qCErYgNwaAtaFEALw_wcB:G:s&s_kwcid=AL!739!3!475968862022!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_city_nc_goog");	
    
    driver.findElement(By.xpath("//a[@class='_287FRX']")).click();
    Thread.sleep(3000);
    
    driver.navigate().back();  
    Actions a=new Actions(driver);
    WebElement e=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
    a.doubleClick(e).build().perform();
    Thread.sleep(3000);


    Actions action= new Actions(driver);
    WebElement element=driver.findElement(By.xpath("//img[@class='_1e_EAo' and @alt='Flipkart']"));
    action.contextClick(element).perform();
    
    Thread.sleep(3000);

    Actions action1= new Actions(driver);
    WebElement element1=driver.findElement(By.linkText("Flights"));
    action1.contextClick(element1).perform();
    
}
}
