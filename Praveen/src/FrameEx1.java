import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1
{
	public static void main(String args[])
	{
		System.setProperty("Webdriver.chrome.driver", "D://Automation//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.getProperty("https://www.freecrm.com/index.html.");
		driver.findElement(By.xpath(null//[@name='username']));
		
	}

}
