package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keysucess {
  static WebDriver driver;
  @Test
  public void method() throws Exception 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.co.in");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys("selenium raghu");
	  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(3000);
	  Reporter.log("Firsttime down arrow pressed");
	  driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(3000);
	  Reporter.log("Secondtime down arrow pressed");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  Reporter.log("click on Enter btn");
	  driver.close();
  }
} 
