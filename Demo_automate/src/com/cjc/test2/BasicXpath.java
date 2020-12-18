package com.cjc.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ankush/Downloads/index.html");

		driver.findElement(By.xpath("/html/body/form/div/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/form/div/input[2]")).sendKeys("admin123");
		WebElement driver1=driver.findElement(By.xpath("//select[@id='browser']"));
		Select sc1=new Select(driver1);
		sc1.selectByIndex(2);
		driver.findElement(By.xpath("//button[@type='submit' and @id='login']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @id='cancel']")).click();

		
	}
}
