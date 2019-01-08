
package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browser
{
	WebDriver d;
	@BeforeMethod
	public void setup()
	{
	 System.setProperty("Webd.chrome.d","Praveen/chromed.exe");
	 d=new ChromeDriver();
	 d.get("https://apsrtconline.in/oprs-web/");
	 }
	@Test
	public void apsrtc() throws InterruptedException 
	{
		d.findElement(By.xpath("//input[@name='source']")).sendKeys("hyd");
		d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("kurnool");
		d.findElement(By.xpath("//input[@value='Check Availability']")).click();
		d.switchTo().alert().accept();
		Thread.sleep(4000);
     }
   @AfterMethod
   public void teardown()
   {
    d.close();
}
}
 // In Apsrtc Ticket booking process by TestNg framework using @BeforeMethod @Test @AfterTest.....