import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StudentTable {

	public static void main(String[] args)
	{
   System.setProperty("Webdriver.chrome.driver", "D://Automation//chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("file:///C:/Users/adisesu/Desktop/Student2.html");
   String str1=driver.findElement(By.xpath("html/body/table/tbody/tr[5]/td[2]")).getText();
   System.out.println(str1);
   String str2=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[1]")).getText();
   System.out.println(str2);
   int i=9;
   for(int j=1;j<=4;j++)
   {
   String str3=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
   System.out.println(str3);
   }
   String str3=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[1]")).getText();
    System.out.println(str2);
  /* String str2=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[1]")).getText();
  System.out.println(str2);
  
  */

	}

}
 