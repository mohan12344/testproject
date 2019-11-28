package com.wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// test cases steps
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		// using javascriptExecutor to click on login  btn
		WebElement element=driver.findElement(By.name("Submit"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		System.out.println("Login Completed");
		// using javascriptexecutor to click on logout
		WebElement logout=driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", logout);
		System.out.println("Logout Completed");
		driver.close();

	}

}
