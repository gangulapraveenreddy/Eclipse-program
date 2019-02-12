
package sikuli;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sikuli
  {
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
       Screen s=new Screen();
       
       Pattern p1=new Pattern("D://Automation//snipping tool images//fbe.PNG");
      
       Pattern p2=new Pattern("D://Automation//snipping tool images//pl.PNG");
       Pattern p3=new Pattern("D://Automation//snipping tool images//login.PNG");
       
       // Alert click
       Pattern p4=new Pattern("D://Automation//snipping tool images//allow.PNg");
       
       System.setProperty("Webdriver.chrome.driver", "./Praveen/chromdriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
       driver.get("https://www.facebook.com");
       
      // s.wait(5000);
       s.type(p2,"gangulapraveenreddy@gmail.com");
       
      // s.wait(5000);
       s.type(p1,"praveen414");
       
      // s.wait(5000);
       s.click(p3);
       
       s.click(p4);
       
       }

}




