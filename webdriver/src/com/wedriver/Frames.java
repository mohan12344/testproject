package com.wedriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames {
	static WebDriver driver;
    static String key="webdriver.gecko.driver";
    static String  path="E:\\Selenium_Student_SW\\Drivers\\geckodriver.exe";
    static String url="http://127.0.0.1/orangehrm-2.6/login.php";
    static String nameofusername="txtUserName";
    static String nameofpassword="txtPassword";
    static String un="admin";
    static String pw="admin";
    static String button="Submit";
    static String link_logout="Logout";
    @Test
	public void main() throws Exception {
		// TODO Auto-generated method stub
		// open application
       System.setProperty(key, path);
       driver=new FirefoxDriver();
       System.out.println("Browser Opened");
       driver.navigate().to(url);
       System.out.println("URL Passed");
       // add any wait stmt
       Thread.sleep(4000);
       // verify title using if stmt
       if(driver.getTitle().matches("OrangeHRM-New Level of HR Management")) {
    	   System.out.println("Title Matched");
       }
       else {
    	   System.out.println("Title not Matched and Excepted is:"+driver.getTitle());
       }
       // verify username textbox label using assert statement 
     //  WebElement element=driver.findElement(By.xpath("//td[text()='Login Name : ']"));
	//    String actualResult=element.getText();
    //   System.out.println("element is :" +actualResult);
    //   assertTrue(actualResult.matches("Login Name : ")) ;
     //  System.out.println("condtion is true");
       // enter username  by calling variable
       driver.findElement(By.name(nameofusername)).sendKeys(un);
       System.out.println("username passed");
       // click on login button
       driver.findElement(By.name(button)).click();
       System.out.println("clicked on loginbutton");
       // print text from popup
       Alert a=driver.switchTo().alert();
       String popup=a.getText();
       System.out.println(popup);
       // click on ok button in popup
       a.accept();
       // click on clear button
       Thread.sleep(3000);
       driver.findElement(By.name("clear")).click();
       // type username and password by calling variable
       driver.findElement(By.name(nameofusername)).sendKeys(un);
       System.out.println("username passed");
       driver.findElement(By.name(nameofpassword)).sendKeys(pw);
       System.out.println("password passed");
       // click on login button 
       driver.findElement(By.name(button)).click();
       System.out.println("Login completed");
       // add any stmt
       Thread.sleep(4000);
       //verify title using if stmt
       if(driver.getTitle().matches("OrangeHRM")) {
    	   System.out.println("Title Matched");
       }
       else {
    	   System.out.println("Title not matched and Excepted Result is : "+driver.getTitle());
       }
       // navigate to PIM main menu
       Thread.sleep(3000);
       WebElement pimmainmenu=driver.findElement(By.linkText("PIM"));
       Actions action=new Actions(driver);
       action.moveToElement(pimmainmenu).perform();
       System.out.println("PIM is clicked");
       // click on add employee submenu
       Thread.sleep(4000);
       driver.findElement(By.linkText("Add Employee")).click();
       // type employee 1st and 2ng name
       driver.switchTo().frame("rightMenu");
       System.out.println("enter into frame");
       Thread.sleep(4000);
       String empcode=driver.findElement(By.xpath("//input[@id='txtEmployeeId']")).getAttribute("value");
       System.out.println("emp code is : "+empcode);
       driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("mohan");
       driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("selenium");
       WebElement fileinput=driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
       fileinput.sendKeys("E:\\sh\\Desert.jpg");
       // click on save button 
       driver.findElement(By.id("btnEdit")).click();
       driver.switchTo().defaultContent();
       System.out.println("Exit from frame");
       // click on logout button 
       Thread.sleep(4000);
       driver.findElement(By.linkText(link_logout)).click();
       System.out.println("application logout");
       // close application
       driver.close();
       System.out.println("close application");
       
       
       
       
	}
}


		
	


