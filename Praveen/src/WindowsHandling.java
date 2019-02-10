import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("Webdriver.chrome.driver","./Praveen/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	String parent=driver.getWindowHandle();
	System.out.println(parent); 
	Set<String> chlid=driver.getWindowHandles();
	System.out.println(chlid);
    driver.close();
	 for(String str2:chlid)
	 {
		 System.out.println(str2);
		 driver.switchTo().window(str2);
		 System.out.println(driver.getTitle());
	 }
	 driver.switchTo().window(parent);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//ul[@class='tabs']/li[5]/a")).click();
	Set<String> currentwindow= driver.getWindowHandles();
	for(String str:currentwindow)
	{
    if(!parent.equals(str))
    {
    	driver.switchTo().window(parent);
    	System.out.println(driver.getTitle());
    }
	}
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='bmsTop']/ul/li[5]/a")).click();
	Thread.sleep(4000);
	driver.close();
	}
	
	

}
