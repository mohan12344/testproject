package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.BaseClass;

public class HomePage extends BaseClass{
  
	@FindBy(id="companyLogoHeader")
	  WebElement Homepage;
	  
	  @FindBy(xpath="//*[@id=\"option-menu\"]/li[1]")
	  WebElement Webadmin;
	  
	  @FindBy(linkText="Admin")
	  WebElement link_pim;
	  
	  @FindBy(linkText="PIM")
	  WebElement link_pims;
	  
	  @FindBy(linkText="Logout")
	  WebElement link_logout;

     public HomePage() 
{
	PageFactory.initElements(driver, this);
}
public String getTitleofCurrentPage() 
{
	return driver.getTitle();
}
public boolean VerifyLogo() 
{
	return Homepage.isDisplayed();
}

public Adminpage clickonAdminPage() 
{
	link_pim.click();
	return new Adminpage();
}
public  Logoutpage clickonLogoutPage() 
{
	link_logout.click();
	return new Logoutpage();
}
public PIMpages clickonPIMPage() throws Exception 
{
	link_pims.click();
	return new PIMpages();
}
}

