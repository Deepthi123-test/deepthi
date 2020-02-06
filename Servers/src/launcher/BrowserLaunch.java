package launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserLaunch
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
 WebDriver driver1=new FirefoxDriver();
 driver1.get("https://www.amazon.in");
 
	}

}
