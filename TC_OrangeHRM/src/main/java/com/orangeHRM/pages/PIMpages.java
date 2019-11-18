package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.BaseClass;
import com.orange.util.Testutil;

public class PIMpages extends BaseClass
{
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Add Employee")
	WebElement addemployee;
	
	@FindBy(id="txtEmployeeId")
	WebElement txtemployeeid;
	
	@FindBy(name="txtEmpFirstName")
	WebElement txtemployeename;
	
	@FindBy(name="txtEmpLastName")
	WebElement txtemployeeLast;
	
	@FindBy(xpath="//input[@name='photofile']")
	WebElement fileupload;
	
	@FindBy(id="btnEdit")
	WebElement button;
	
	public PIMpages()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public  void addemployee()
	{
		Testutil util=new Testutil();
		Actions action=new Actions(driver);
		action.moveToElement(pim).build().perform();
		util.pageload();
		util.implicityload();
		addemployee.click();
		util.switchToframe();
		txtemployeename.sendKeys(prop.getProperty("firstname"));
		txtemployeeLast.sendKeys(prop.getProperty("lastname"));
		fileupload.sendKeys("E:\\sh\\Desert.jpg");
		button.click();
		util.switchTodefalutcontent();
	
	}
}
