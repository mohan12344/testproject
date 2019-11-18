package com.orange.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.base.BaseClass;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.Loginpage;
import com.orangeHRM.pages.Logoutpage;
import com.orangeHRM.pages.PIMpages;

public class PIMpageTest extends BaseClass{
  
	Loginpage loginpage;
	HomePage homepage;
	PIMpages pimpages;
	Logoutpage logoutpage;
	
	public PIMpageTest() 
	{
		super();
	}
	@BeforeClass
	public void setUp() 
	{
		openapplication();
		loginpage=new Loginpage();
		pimpages=new PIMpages();
		logoutpage=new Logoutpage();
		homepage=loginpage.logintoApp(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void addemploye()
	{
		 pimpages.addemployee();
	}
	@Test(priority=2)
	public void verifyTitle() 
	{
		String title=homepage.getTitleofCurrentPage();
		System.out.println(title);
	}
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		System.out.println("close browser");
	}
	}
	

