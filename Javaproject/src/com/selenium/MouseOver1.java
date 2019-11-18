package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MouseOver1 {
	static WebDriver driver;
	@Test
	public void mouseoveraction() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		Reporter.log("Open AddEmployee");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		String empid=driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).getAttribute("value");
		System.out.println(empid);
		driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("suresh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("mohan");
		WebElement fileinput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("E:\\sh\\Lighthouse.jpg");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
