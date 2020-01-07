package launcher;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BrowserLaunch {
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		//WebDriver driver;
		//System.setProperty("webdriver.gecko.driver","D:\\New folder\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driverFiles\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//driver.close();
		//System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFiles\\chromedriver.exe");
	 WebDriver driver1=new ChromeDriver();
      driver1.get("https://www.bestbuy.com/");
 }

}
