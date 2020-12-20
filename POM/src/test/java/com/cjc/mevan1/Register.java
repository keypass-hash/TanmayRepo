package com.cjc.mevan1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register {
public WebDriver driver;
	
	public Register( WebDriver driver) 
	  {
		this.driver=driver;
	  }
	
	@FindBy(name="firstName")
	WebElement firsttname;
	
	@FindBy(name="lastName")
	WebElement lasttname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(id ="userName")
	WebElement uname;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement place;
	
	@FindBy(name="state")
	WebElement division;
	
	@FindBy(name="postalCode")
	WebElement pcode;
	
	@FindBy(name="country")
	WebElement nation;
	
	@FindBy(name="email")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement cpassword;
	
	@FindBy(name="submit")
	WebElement submitbtn;
	
	@FindBy(linkText = "REGISTER")
	WebElement regLink;
	
	public void toregister(String ftname,String ltname, String number, String email, String addr, String city, String state,String pin,String country,
			String eid, String psd, String cpsd) {
		regLink.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		firsttname.sendKeys(ftname);
		lasttname.sendKeys(ltname);
		phone.sendKeys(number);
		uname.sendKeys(email);
		address.sendKeys(addr);
		place.sendKeys(city);
		division.sendKeys(state);
		pcode.sendKeys(pin);
		Select sc1= new Select(nation);
		sc1.selectByVisibleText(country);
		emailid.sendKeys(eid);
		password.sendKeys(psd);
		cpassword.sendKeys(cpsd);
		submitbtn.click();
	}
	
	
}
