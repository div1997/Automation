package OodlesDB;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageobjects.Blog;
import pageobjects.Landingpage;
import resource.Baseclass;

public class Blogtestcase extends Baseclass {
	
	private static Logger log =  LogManager.getLogger(Blogtestcase.class.getName());
	
	WebDriver driver;
	
	@BeforeTest
	 public void initialize() throws IOException, InterruptedException 
	 {
		driver = initializedriver();
		log.info("driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");
		Landingpage lp=new Landingpage(driver);
		lp.login();
		log.info("Login successful");
		Thread.sleep(2000);
	 }
	
	@Test(priority=1,enabled = false)
	public void blogfilter() throws InterruptedException
	{
		
		Blog bp = new Blog(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", bp.blog());
		log.info("Click on blog tab");
		js.executeScript("arguments[0].click()", bp.viewblog());
		log.info("Click on view blogs");
		Thread.sleep(2000);
		//bp.getstatusfilter().click();
		Select sc = new Select(bp.getstatusfilter());
		sc.selectByVisibleText(prop.getProperty("Status"));
		log.info("applied filter on"+prop.getProperty("Status"));
	}

	@Test
	public void writeblog() throws InterruptedException
	{
		
	Blog bp = new Blog(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", bp.blog());
	log.info("Click on blog tab");
	js.executeScript("arguments[0].click()", bp.viewblog());
	log.info("Click on view blogs");
	bp.writeblog().click();
	Thread.sleep(2000);
	bp.blogtitle().sendKeys("sjxakjsdhcs");
	
		
	}
}