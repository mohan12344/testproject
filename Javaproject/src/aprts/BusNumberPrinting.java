package aprts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BusNumberPrinting 
{
 static WebDriver driver;
  @Test
 public void busnumbers() throws Exception 
 {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 Reporter.log("Browser Opened");
	 driver.navigate().to("https://ksrtc.in/oprs-web/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("fromPlaceName")).sendKeys("BENGALURU");
	 Thread.sleep(3000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 driver.findElement(By.id("toPlaceName")).sendKeys("HYDERABAD");
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"txtReturnJourneyDate\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div[2]/div[3]/button")).click();
	 Thread.sleep(2000);
	// List<WebElement> all_links=driver.findElements(By.xpath("//div[@id='ForwardResults']/div/div/div/div/div/h3//a\""));
	 
	// int count=all_links.size();
	//	System.out.println("Total Links are : "+count);
		
	
	//for (int i = 0; i < count; i++) 
	//{
	//	String service_numbers=all_links.get(i).getText();
		//	System.out.println("service number is : "+service_numbers); 
	//}//
	
	driver.close();	
 }
}
