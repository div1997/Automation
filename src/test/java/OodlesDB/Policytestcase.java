package OodlesDB;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Landingpage;
import pageobjects.Policy;
import resource.Baseclass;
import resource.WaitStattementLib;
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
		//Thread.sleep(2000);
		WaitStattementLib.iWaitForSecs(driver, 20);
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
		
		//Thread.sleep(1000);
		WaitStattementLib.iWaitForSecs(driver, 10);
		pd.adddocument().click();
		log.info("Click on ad policy document");
		Select option = new Select(pd.typedropdown());
		option.selectByVisibleText("HR Manual");
		log.info("option selected");
		pd.uploadfile().sendKeys("/home/divya/Pictures/Screenshot from 2019-06-27 18-13-24.png");
		//Thread.sleep(1000);
		WaitStattementLib.iWaitForSecs(driver, 10);
		//js.executeScript("arguments[0].click()", pd.savedoc());
		log.info("document uploaded");
		pd.savedoc().click();
		log.info("Save document");
	
	}
	
	@Test(enabled=false)
	public void editpolicydoc() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		//Thread.sleep(2000);
		WaitStattementLib.iWaitForSecs(driver, 20);
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		js.executeScript("arguments[0].click()", pd.policy());
		//Thread.sleep(2000);
		WaitStattementLib.iWaitForSecs(driver, 20);
		pd.search().sendKeys("HR Manual");
		Thread.sleep(2000);
		log.info("applied serach filter");
		pd.edit().click();
		log.info("Click on edit icon");
		Thread.sleep(2000);
		pd.update().sendKeys("/home/divya/Pictures/ELK_image.png");
		Thread.sleep(5000);
		//WaitStattementLib.iWaitForSecs(driver, 20);
		pd.saveupdate().click();
		log.info("update the document");
		Thread.sleep(2000);
		//WaitStattementLib.iWaitForSecs(driver, 50);
		driver.navigate().refresh();
		pd.search().sendKeys("HR Manual");
		Thread.sleep(2000);
	String filename= "ELK_image.png";
	String updatefilename= pd.filename().getText();
	Assert.assertEquals(filename,updatefilename);
	log.info("File updated successfully");
	}
	@Test(enabled=false)
	public void showperpagefilter() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		//Thread.sleep(2000);
		WaitStattementLib.iWaitForSecs(driver, 20);
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		js.executeScript("arguments[0].click()", pd.policy());
		Select option = new Select(pd.showperpage());
		option.selectByVisibleText("Show 25 per page");
		log.info("applied filter on show per page");
	}
	@Test(priority=1,enabled=false)
	public void clickOnpagination_1() throws InterruptedException
	{
		Landingpage lp =new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		log.info("login successfully");
		//WaitStattementLib.iWaitForSecs(driver, 20);
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		log.info("click on Others tab");
		js.executeScript("arguments[0].click()", pd.policy());
		log.info("click on policy tab");
		js.executeScript("window.scrollBy(0,1000)");
		pd.pagination_1();
		
	}
	@Test(priority=2,enabled=true)
	public void clickOnpagination_2() throws InterruptedException
	{
		Landingpage lp =new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		log.info("login successfully");
		//WaitStattementLib.iWaitForSecs(driver, 20);
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		log.info("click on Others tab");
		js.executeScript("arguments[0].click()", pd.policy());
		log.info("click on policy tab");
		js.executeScript("window.scrollBy(0,1000)");
		pd.pagination_2();
		
	}
	@Test(priority=3,enabled=false)
	public void clickOnpagination_3() throws InterruptedException
	{
		Landingpage lp =new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		log.info("login successfully");
//		//WaitStattementLib.iWaitForSecs(driver, 20);
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		log.info("click on Others tab");
		js.executeScript("arguments[0].click()", pd.policy());
		log.info("click on policy tab");
		js.executeScript("window.scrollBy(0,1000)");
		pd.pagination_3();
		
	}
}
