package com.orange.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.base.BaseClass;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.Loginpage;

public class LoginpageTest extends BaseClass{
   Loginpage loginpage;
   HomePage homepage;
	public LoginpageTest() 
	{
		super();
	}
	@BeforeClass
	public void setUp() 
	{
		openapplication();
		loginpage=new Loginpage();
		System.out.println("open browser");
		Reporter.log("open browser");
	}
	@Test(priority=1)
	public void loginPageTitle() 
	{
		String title=loginpage.getTitlePage();
		Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
		System.out.println("OrangeHRM - New Level of HR Management");
		Reporter.log(title);
	}
	
	@Test(priority=2)
	public void verifyLogo() 
	{
		boolean flag=loginpage.verifyLogo();
		Assert.assertTrue(flag);
		System.out.println("verifyLogo");
		Reporter.log("verifylogo");
	}
	
	@Test(priority=3)
	public void loginTest() 
	{
		homepage=loginpage.logintoApp(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		System.out.println("close browser");
		Reporter.log("close browser");
	}
	
}
