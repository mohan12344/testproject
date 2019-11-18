package com.orange.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orange.util.Testutil;

public class BaseClass {
  
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() 
	{
		try 
		{
		prop=new Properties();
		String location="F:\\cc\\TC_OrangeHRM\\src\\main\\java\\com\\orange\\config\\config.properties";
		FileInputStream fis=new FileInputStream(location);
		prop.load(fis);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void openapplication() 
	{
		Testutil util=new Testutil();
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("Firefox")) 
		{
	  System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe")	;
	  driver=new FirefoxDriver();
	}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		util.pageload();
		util.implicityload();
		
		driver.navigate().to(prop.getProperty("url"));
	}
	}
       public static void closebrowser() 
       {
    	   driver.close();
       }
	
	
}
