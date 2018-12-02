import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer
{
public static void main(String args[])
{
	System.setProperty("Webdriver.ie.driver", "‪D:\\Automation\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.gmail.com");
	String str=driver.getTitle();
	System.out.println(str);
	driver.close();

}
}