package com.wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static String un="admin";
	public static String pw="admin";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
   driver.manage().window().maximize();
   Thread.sleep(3000);
   driver.findElement(By.name("txtUserName")).sendKeys(un);
   driver.findElement(By.name("txtPassword")).sendKeys(pw);
   driver.findElement(By.name("Submit")).click();
   Thread.sleep(3000);
   // mouse over on pim main menu
   WebElement element=driver.findElement(By.linkText("PIM"));
   Actions action=new Actions(driver);
   action.moveToElement(element).perform();
   Thread.sleep(3000);
   // clicking on add employee  submenu link
   driver.findElement(By.linkText("Add Employee")).click();
   //driver.findElement(By.xpath());
   Thread.sleep(3000);
   System.out.println("clicked on submenu");
   driver.close();
   
   
   
	}

}
