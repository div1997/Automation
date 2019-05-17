package Dashboard.Resource;


import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Demandpage;
import PageObject.Loginpage;
import ResourceDetails.Baseclass;

public class Demandtestcase  extends Baseclass 

{
	
	@BeforeTest
	public void getintializer() throws IOException
	{
		
		driver = intializer();
		Reporter.log("browser intialize",true);
		driver.get(prop.getProperty("url"));
		Reporter.log("login successfully",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}


	@Test  void createDemand() throws IOException, InterruptedException
	{
	
		
		Loginpage log = new Loginpage(driver);
		log.email().sendKeys("rijul.jain@oodlestechnologies.com");
		log.password().sendKeys("manish@159");
		log.proceed().click();
		Reporter.log("login successfully", true);
	
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Demandpage demand = new Demandpage(driver);
		 //JavascriptExecutor js = (JavascriptExecutor)driver;
		 //js.executeAsyncScript("document.querySelector(\"#li > a\")");
		demand.resource().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		demand.createbutton().click();
		Thread.sleep(2000);
		demand.billablestatus().click();
		 Select value = new Select(demand.billablestatus());
		value.selectByValue("No");
		demand.priority().click();
		Select value2 = new Select(demand.priority());
		 value2.selectByValue("Normal");
		 demand.comment().sendKeys("need after 15 days");
		 demand.opening().sendKeys("2");
		 demand.experience().sendKeys("0-1");
		 demand.projectfield().sendKeys("Oodles-Dashboard");
		 demand.designationfield().sendKeys("Associate Consultant - QA");
		 demand.designationfield().sendKeys(Keys.ARROW_DOWN);
		 demand.designationfield().click();
		 demand.primaryskill().sendKeys("CSS");
		 demand.primaryskill().sendKeys(Keys.ARROW_DOWN);
		 demand.primaryskill().click();
		 demand.secondaryskill().sendKeys("Bootstrap");
		 demand.secondaryskill().sendKeys(Keys.ARROW_DOWN);
		 demand.secondaryskill().click();
		 demand.experience().sendKeys("0-1");
		 demand.save().click();
		 
		 
		
		/*
		 * 
		 * Actions option = new Actions(driver);
		 * option.keyDown(Keys.ARROW_DOWN).click(); option.build(); option.perform();
		 */
	}
	
	
	/*
	 * @AfterTest public void teardown()
	 * 
	 * { driver.close(); }
	 */
}



	

