package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_101 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
   driver.findElement(By.name("txtUserName")).sendKeys("admin");
   driver.findElement(By.name("txtPassword")).sendKeys("admin");
   driver.findElement(By.name("Submit")).click();
   Thread.sleep(4000);
   System.out.println("login completed");
   driver.findElement(By.linkText("Logout")).click();
   System.out.println("Logout completed");
   driver.quit();
	}

}
