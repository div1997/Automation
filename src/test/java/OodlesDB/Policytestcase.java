package OodlesDB;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.Landingpage;
import pageobjects.Policy;
import resource.Baseclass;
import pageobjects.Commonelements;

public class Policytestcase extends Baseclass
{

	private static Logger log =  LogManager.getLogger(Blogtestcase.class.getName());
		WebDriver driver;
		
		@BeforeTest
		public void initialize() throws IOException  
		{
		
		
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		
		}
	
	@Test(enabled=false)
	public void addPolicy() throws InterruptedException
	
	{
	
		Landingpage lp=new Landingpage(driver);
		lp.login();
		log.info("Login successfully");
		Thread.sleep(2000);
		
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		log.info("Click on other tab");
		js.executeScript("arguments[0].click()", pd.policy());
		log.info("Click on policy");
		pd.typeButton().click();
		log.info("Click on add policy type button");
		pd.addtype().sendKeys("HR_Leavedoc55");
		log.info("entered policytyed name");
		pd.savetype().click();
		log.info("save policy type");
		
		Thread.sleep(1000);
		pd.adddocument().click();
		log.info("Click on ad policy document");
		Select option = new Select(pd.typedropdown());
		option.selectByVisibleText("HR Manual");
		log.info("option selected");
		pd.uploadfile().sendKeys("/home/divya/Pictures/Screenshot from 2019-06-27 18-13-24.png");
		Thread.sleep(1000);
		//js.executeScript("arguments[0].click()", pd.savedoc());
		log.info("document uploaded");
		pd.savedoc().click();
		log.info("Save document");
	
	}
	
	@Test(enabled=true)
	public void editpolicydoc() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		js.executeScript("arguments[0].click()", pd.policy());
		Thread.sleep(2000);
		pd.search().sendKeys("HR");
		log.info("applied serach filter");
		pd.edit().click();
		log.info("Click on edit icon");
		pd.update().sendKeys("/home/divya/Pictures/ELK.png");
		Thread.sleep(2000);
		pd.saveupdate().click();
		log.info("update the document");
		Thread.sleep(2000);
		driver.navigate().refresh();
		pd.search().sendKeys("HR");
	}
	@Test(enabled=false)
	public void showperpagefilter() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		js.executeScript("arguments[0].click()", pd.policy());
		Select option = new Select(pd.showperpage());
		option.selectByVisibleText("Show 25 per page");
		log.info("applied filter on show per page");
	}
}
