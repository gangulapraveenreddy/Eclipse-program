import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxDriverEx1
{
 public static void main(String args[]) 
 {
	 System.setProperty("Webdriver.gecko.driver", "‪D:\\Automation\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	 driver.get("https://www.google.com");
	 String str=driver.getTitle();
	 System.out.println(str);
	 driver.close();
	 
 }
}

