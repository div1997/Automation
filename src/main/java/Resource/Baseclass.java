package Resource;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{

	public WebDriver driver;

	public void launchBrowser(String browser_name) 
	{
		if (browser_name.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} 
		else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("http://automationpractice.com/index.php");

		}

	}

	public String screenshot(String Testcasename, WebDriver driver) throws IOException 
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir") + "\\reports\\" + Testcasename + ".png";
		FileUtils.copyFile(source, new File(destinationfile));
		return destinationfile;
	}

	
}
