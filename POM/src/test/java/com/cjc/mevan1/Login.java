package com.cjc.mevan1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Login {

	public WebDriver driver;
	
	public Login( WebDriver driver) 
	  {
		this.driver=driver;
	  }
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="submit")
	WebElement submit;
	
	@FindBy(xpath = "//a[@href='login.php']")
	WebElement signon;
	
	public void tologin(String uname,String pass) {
		signon.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
	}
	
}
