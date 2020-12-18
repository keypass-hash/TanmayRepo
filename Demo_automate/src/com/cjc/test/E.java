package com.cjc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.findElement(By.name("firstName")).sendKeys("Username");
        driver.findElement(By.name("lastName")).sendKeys("Lastname");
        driver.findElement(By.name("phone")).sendKeys("9999999999");
        driver.findElement(By.id("userName")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("Karve nagar pune");
        driver.findElement(By.name("city")).sendKeys("pune");
        driver.findElement(By.name("state")).sendKeys("Pune");
        driver.findElement(By.name("postalCode")).sendKeys("44444");

        WebElement country=driver.findElement(By.name("country"));
        Select sc=new Select(country);
        //sc.selectByIndex(6);
       sc.selectByValue("INDIA");
        //sc.selectByVisibleText("INDIA");
       
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("confirmPassword")).sendKeys("admin");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.name("submit")).click();
		// driver.close();

	}
	
	
}
