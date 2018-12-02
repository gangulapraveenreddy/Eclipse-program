package mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail {

	WebDriver d;
	
@BeforeMethod
public void beforemet()
{
	 System.setProperty("Webdriver.gecko.driver", "‪D:\\Automation\\geckodriver.exe");
       d= new FirefoxDriver();
		 d.get("https://www.gmail.com");
}

@Test
public void testcase()
{

	System.out.println(d.getTitle());
	
	
}



@AfterMethod
public void teardown()
{
	d.quit();
}


}
