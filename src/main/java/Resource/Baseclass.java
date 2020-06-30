package Resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public WebDriver driver;
	
	
	 public void launchBrowser(String browser_name)
	 {
		if ( browser_name.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new  FirefoxDriver();
			driver.get("http://automationpractice.com/index.php");
		}
		
			
	 }
	 
	 public void screenshot() 
	 {
		 
		 
	 }
	
	

}
