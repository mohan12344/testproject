package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Robotclass {
   
	static WebDriver driver;
	@Test
	public void Method() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("shrm");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("saru");
		WebElement filepath=driver.findElement(By.name("photofile"));
		Thread.sleep(3000);
		filepath.sendKeys("C:\\Users\\mohan123\\Documents\\images\\casey-horner-UvVtEnaZGfw-unsplash.jpg");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout"));
		driver.close();
		
	}
}
