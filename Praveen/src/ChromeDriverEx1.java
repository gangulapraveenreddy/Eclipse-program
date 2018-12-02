import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDriverEx1
{
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver", "D.//Automation//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	String str=driver.getTitle();
	
	driver.manage().window().maximize();
	
	Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
	
	day.selectByIndex(10);
	
	Thread.sleep(3000);
	
Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));

 System.out.println(month.isMultiple());
 
 
 
  driver.findElement(By.id("u_0_j")).sendKeys("Rushi");
  driver.findElement(By.id("u_0_j")).clear();
  
  driver.findElement(By.id("u_0_j")).sendKeys("Rishi");

  
  
  
  driver.findElement(By.id("u_0_a")).click();
  
  Thread.sleep(5000);
  
  
  List<WebElement> alloptions= month.getOptions();
  
  
  
  
  for(WebElement e:alloptions)
  {
	  System.out.println(e.getText());
  }
	
month.selectByValue("4");

Thread.sleep(3000);

Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));

year.selectByVisibleText("2014");


	
	
	System.out.println(str);
	
	Thread.sleep(3000);
    driver.close();
}
}
