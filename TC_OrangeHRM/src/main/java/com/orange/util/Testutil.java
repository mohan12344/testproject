package com.orange.util;

import java.util.concurrent.TimeUnit;

import com.orange.base.BaseClass;

public class Testutil extends BaseClass{
   
	public Testutil() 
	{
		super();
	}
	
	public void pageload() 
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	public void implicityload()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	public void switchToframe() 
	{
		driver.switchTo().frame(0);
	}
	public void switchTodefalutcontent() 
	{
		driver.switchTo().defaultContent();
	}
}

