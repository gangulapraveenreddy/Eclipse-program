
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cookies
{
public static void main(String args[])
{
	System.setProperty("Webdriver.gecko.driver", "D://Automation//geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  System.getProperty("https://www.google.com");
  Set<Cookie> cookiees = driver.manage().getCookies();
  for( Cookie c:cookiees) {
  System.out.println(c);
  }
}
}