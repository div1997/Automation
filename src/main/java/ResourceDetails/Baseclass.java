package ResourceDetails;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

     public WebDriver driver;
     public Properties prop;

	public WebDriver intializer() throws IOException
	
	{
		String path= "//home//divya//Documents//workspace-sts-3.9.7.RELEASE//Resource//src//main//java//ResourceDetails//Properties";
		 prop = new Properties();
		FileInputStream file = new FileInputStream(path);
	     prop.load(file);
	     String browser = prop.getProperty("browser");
	     System.out.println(browser);
	     if(browser.equals("chrome")) 
	     {
	    	 System.setProperty("webdriver.chrome.driver","//home//divya//Desktop//data//chromedriver (8)");
	    	 driver = new ChromeDriver();
	     }
	
	     else if(browser.equals("Firefox"))
	     {
	    	 System.setProperty("webdriver.gekodriver","/home/divya/Desktop/data/geckodriver");
	    	 driver = new FirefoxDriver();
	     }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
    }
	

}
