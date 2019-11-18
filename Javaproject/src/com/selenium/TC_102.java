package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TC_102 {
   static WebDriver driver;
   @Test(priority=2)
   public void robotclass() throws Exception 
   {
	   System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	   driver.findElement(By.name("txtUserName")).sendKeys("admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	   driver.findElement(By.name("Submit")).click();
	   Thread.sleep(3000);
	   driver.switchTo().frame("rightMenu");
	   Select sec=new Select(driver.findElement(By.name("loc_code")));
	   Thread.sleep(3000);
	   sec.selectByIndex(1);
	   String Empid=driver.findElement(By.xpath("//*[@id=\'standardView\']/table/tbody/tr[1]/td[2]")).getText();
		driver.findElement(By.id("loc_name")).sendKeys(Empid);
	   driver.findElement(By.xpath("//input[@type='button'][@value='Search']")).click();
	   driver.findElement(By.name("chkLocID[]")).click();
	   driver.findElement(By.xpath("//input[@type='button'][@value='Delete']")).click();
	   driver.close();
   }
   @Test(priority=1)
   public void mouseover() throws Exception 
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	   driver.findElement(By.name("txtUserName")).sendKeys("admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	   driver.findElement(By.name("Submit")).click();
	   Thread.sleep(3000);
	   WebElement element=driver.findElement(By.linkText("PIM"));
	   Actions action=new Actions(driver);
	   action.moveToElement(element).perform();
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Add Employee")).click();
	   Reporter.log("AddEmployee");
	   Thread.sleep(2000);
	   driver.switchTo().frame("rightMenu");
	   String empid=driver.findElement(By.xpath("//input[@id='txtEmployeeId']")).getAttribute("value");
	   driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("Mohan");
	   driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Selenium");
	   WebElement fileinput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	   fileinput.sendKeys("C:\\Users\\mohan123\\Documents\\images\\harley-davidson-kSNQz1lTBPQ-unsplash.jpg");
	   Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
			
		
   }
}
