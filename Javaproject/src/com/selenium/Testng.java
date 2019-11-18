package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
    
	static WebDriver driver;
	

	
	@Test(priority=2)
	public void opentestng() throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("testng install");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
	@Test(priority=1)
	public void setup() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
	    driver.close();
		System.out.println("to setup ");
		Reporter.log("to setup");
}
	@Test(priority=3)
	public void teardown() throws Exception 
	{
		System.setProperty("webdriver.ie.driver", "E:\\Selenium_Student_SW\\Drivers\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
	    driver.close();
		System.out.println("to setup ");
		Reporter.log("to setup");
		System.out.println("testng install");
	}
}
