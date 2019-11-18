package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_101 {
 WebDriver driver;
  @Test
 public void openFF() throws Exception 
 {
	 driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	 Reporter.log("open application");
	 Thread.sleep(3000); 
 }
  @Parameters({"browser"})
  @BeforeMethod
  public void setUp(String browser) 
  {
	  if(browser.equals("Firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	  else if(browser.equals("IE")) 
	  {
		  System.setProperty("webdriver.ie.driver", "E:\\Selenium_Student_SW\\Drivers\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  else if(browser.equals("Chrome")) 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }
}
