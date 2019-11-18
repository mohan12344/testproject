package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.BaseClass;

public class Loginpage extends BaseClass{
  
	@FindBy(name="txtUserName")
	WebElement txtusername;
	
	@FindBy(name="txtPassword")
	WebElement txtpassword;
	
	@FindBy(name="Submit")
	WebElement btn_login;
	
	@FindBy(xpath="//img[@src='themes/orange/pictures/orange_new_02.gif']")
	WebElement hrmsLogo;
	
	public Loginpage() 
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLogo() 
	{
		return hrmsLogo.isDisplayed();
	}
	
	public String getTitlePage() 
	{
		return driver.getTitle();
	}
	public HomePage logintoApp(String username,String password) 
	{
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btn_login.click();
		
		//LoginPage landing page is PIMPage
		return new HomePage();
	}	
}
