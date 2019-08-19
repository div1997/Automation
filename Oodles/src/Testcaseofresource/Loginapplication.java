package Testcaseofresource;
import Resourceobject.Object;
import Resourceobject.ResourcingModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
	
//	System.setProperty("webdriver.chrome.driver","/home/divya/Desktop/data/chromedriver (8)");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://ms.oodleslab.com");
//	//Object ob = new Object(driver);

	@Test
	public void login()
	{
		
	System.setProperty("webdriver.chrome.driver","/home/divya/Desktop/data/chromedriver (8)");
	WebDriver driver = new ChromeDriver();
	driver.get("https://ms.oodleslab.com");
     Object ob = new Object(driver);
	ob.email().sendKeys("rijul.jain@oodlestechnologies.com");
	ob.password().sendKeys("manish@159");
	ob.proceed().click();
	ResourcingModule page = new ResourcingModule(driver);
	page.openPage().click();
	
	}
	
	
}
