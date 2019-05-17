package Dashboard.Resource;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import PageObject.Loginpage;
import ResourceDetails.Baseclass;

public class Testcases extends Baseclass {
	
	//private static Logger log = LogManager.getLogger(Testcases.class.getName());
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	@BeforeTest
	public void getintializer() throws IOException
	{
		driver = intializer();
		Reporter.log("browser intialize",true);
		driver.get(prop.getProperty("url"));
		Reporter.log("login successfully",true);
		
	}

	@Test
	
	public void loginPageNavigation() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	Loginpage log = new Loginpage(driver);
	log.email().sendKeys("rijul.jain@oodlestechnologies.com");
	log.password().sendKeys("manish@159");
	log.proceed().click();
	Reporter.log("login successfully", true);
	}
	
	@AfterTest
	public void teardown()
	
	{
	
	driver.close();
	
}
}
