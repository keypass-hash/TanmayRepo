package com.cjc.mevan1;

import java.io.IOException;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POM_Demo {
	static	Logger log=Logger.getLogger(POM_Demo.class.getName());
    public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 log.info("WebDriver is loded");
	}
	
	@BeforeTest
	public void enterUrl()
	{
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		log.info("Redirect to site");
	}
	
	@BeforeClass
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
		log.info("maximize the window");
	}
	
	@BeforeMethod
	public void getAllCookies()
	{
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies)
		{
		}
		log.info("Collect all Cookies");
	}
	
  @Test(dataProvider = "loginData", priority = 2)
  public void loginCheck(String uname, String pass) {
	  Login lp=PageFactory.initElements(driver, Login.class);
	  lp.tologin(uname, pass);
	  
	  log.info("Log in Page Done");
  }
  
  @Test(dataProvider = "registrationData", priority = 1)
	public void registration(String ftname,String ltname, String number, String email, String addr, String city, String state,String pin,String country,
			String eid, String psd, String cpsd)
	{
	  Register rp=PageFactory.initElements(driver, Register.class);
	  rp.toregister(ftname, ltname, number, email, addr, city, state, pin, country, eid, psd, cpsd);
	  log.info("Registration page done");
	}
  
  @Test(dataProvider = "flightData", priority = 3)
  public void flightRegistration(String passenger, String fromcity, String frommonth, String fromday, String toCity, String tomonth, String todate, String flight) {
	  Flight fr=PageFactory.initElements(driver, Flight.class);
	  fr.findFlight(passenger, fromcity, frommonth, fromday, toCity, tomonth, todate, flight);
	  
	  log.info("Flight page done");
  }
  
  @AfterMethod
	public void captureScreenShot() throws IOException
	{
		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("D:\\Selenium Screenshots\\DDFramework Project\\TestCase1 with DataProvider"));
*/		
	}
  
  @AfterClass
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
		log.info("Delete All Cookie");
	}
  
  @AfterTest
	public void dbConnectionClose()
	{
	}
  
  @AfterSuite
	public void closeBroswer()
	{
	  log.info("Driver Close");
	}

  @DataProvider
  public Object[][] loginData() 
  {
	  Object[][] data=new Object[1][2];
	  data[0][0]="iamuser100@gmail.com"; data[0][1]="Test@123";
	  
	  return data;
  }
  
  @DataProvider 
  public Object[][] registrationData() { Object[][] data=new Object[1][12];
  data[0][0]="Tanmay"; data[0][1]="Kashettiwar"; data[0][2]="8888373380";
  data[0][3]="iamuser100@gmail.com"; data[0][4]="Madhuban Society"; data[0][5]="Yavatmal"; 
  data[0][6]="Maharashtra"; data[0][7]="445001"; data[0][8]="INDIA";
  data[0][9]="iamuser100@gmail.com"; data[0][10]="Trial@123"; data[0][11]="Trial@123";
  
  return data; }
  
  @DataProvider
  public Object[][] flightData() 
  {
	  Object[][] data=new Object[1][8];
	  data[0][0]="2"; data[0][1]="New York";
	  data[0][2]="12";
	  data[0][3]="24";
	  data[0][4]="Frankfurt";
	  data[0][5]="12";
	  data[0][6]="26";
	  data[0][7]="Pangea Airlines";
	  
	  return data;
  }
	 
	 
}
