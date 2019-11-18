
package com.javaproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class redbus {
	 @Test
	  public void incrementamount()throws Exception {
	 
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.redbus.in/search?");
	  Thread.sleep(3000);
	  WebElement element= driver.findElement(By.linkText("BUS TICKETS"));
	  element.click();
	  
	  driver.findElement(By.id("txtSource")).sendKeys("bangalore");
	  Thread.sleep(2000);
	  driver.findElement(By.id("txtDestination")).sendKeys(" Kukuatpally hyderabad");
	 Thread.sleep(2000);
	  driver.findElement(By.id("txtOnwardCalendar")).sendKeys("16-Oct-2019");
	  Thread.sleep(2000);
	  driver.findElement(By.id("txtReturnCalendar")).sendKeys("17-Oct-2019");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/button")).click();
      Thread.sleep(3000);


}

}
