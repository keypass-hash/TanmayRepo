package com.cjc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504238004%7Ce%7Cfacebook%20login%7C&placement=&creative=318504238004&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066388443%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA-f78BRBbEiwATKRRBFz5EKMem2x8WLyVocdfDaZTBidsNRQHKF6X5DJWpBUg3xxI19D68xoCZ0YQAvD_BwE");
		driver.manage().window().maximize();
        driver.findElement(By.id("u_0_j")).sendKeys("yourusername@gmail.com");
        driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Surname");
		driver.findElement(By.name("reg_email__")).sendKeys("6565656565");
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("admin123");
		
		WebElement day=driver.findElement(By.id("day"));
		Select sc1=new Select(day);
		sc1.selectByIndex(2);
		
		WebElement month=driver.findElement(By.className("_9407 _5dba _8esg"));
		Select sc2=new Select(month);
	    sc2.selectByValue("5");
	    
	    WebElement year=driver.findElement(By.id("year"));
	    Select sc3=new Select(year);
	    sc3.selectByVisibleText("2019");
		
	    driver.findElement(By.className("_58mt")).click();
	    
	    
	    driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v"));
	    
	    driver.close();
		
	}
}
