package com.cjc.mevan1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Flight {
	public WebDriver driver;
	public Flight(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@value='roundtrip']")
	WebElement roundTrip;
	
	@FindBy(name="passCount")
	WebElement passengers;
	
	@FindBy(name="fromPort")
	WebElement departing;
	
	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(xpath = "//select[@name='fromDay']")
	WebElement fromDate;
	
	@FindBy(name="toPort")
	WebElement arriving;
	
	@FindBy(xpath = "//select[@name='toMonth']")
	WebElement toMonth;
	
	@FindBy(xpath = "//select[@name='toDay']")
	WebElement toDate;
	
	@FindBy(xpath = "//input[@value='Business']")
	WebElement flightClass;
	
	@FindBy(xpath = "//select[@name='airline']")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement find;
	
	@FindBy(xpath = "//a[@href='reservation.php']")
	WebElement findFlight;
public void findFlight(String passenger, String fromcity, String frommonth, String fromday, String toCity, String tomonth, String todate, String flight) {
	findFlight.click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	boolean chk1=roundTrip.isSelected();
	if(chk1==false) {
		roundTrip.click();
	}
	Select sc0= new Select(passengers);
	sc0.selectByValue(passenger);
	
	Select sc1= new Select(departing);
	sc1.selectByValue(fromcity);
	
	Select sc2= new Select(fromMonth);
	sc2.selectByValue(frommonth);
	
	Select sc3= new Select(fromDate);
	sc3.selectByValue(fromday);
	
	Select sc4= new Select(arriving);
	sc4.selectByValue(toCity);
	
	Select sc5= new Select(toMonth);
	sc5.selectByValue(tomonth);
	
	Select sc6= new Select(toDate);
	sc6.selectByValue(todate);
	
	boolean chk2=flightClass.isSelected();
	if(chk2==false) {
		flightClass.click();
	}
	
	Select sc7= new Select(airline);
	sc7.selectByVisibleText(flight);
	
	findFlight.click();
	
}}
