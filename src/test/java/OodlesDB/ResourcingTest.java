package OodlesDB;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Resourcing;
import resource.Baseclass;

public class ResourcingTest extends Baseclass
{

	
		
		public WebDriver driver;


		
		
		@BeforeMethod
		public void initialize() throws IOException

		{
			driver = initializedriver();
			

			driver.get(prop.getProperty("url"));
			

		}
		
		
@Test
public void createDemand() throws InterruptedException {
	
	Landingpage lp = new Landingpage(driver);
	lp.login();
	//log.info("Login successful");
	Thread.sleep(3000);
	Resourcing RT = new  Resourcing(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()",RT.clickonresourcing());
//	//Thread.sleep(2000);
//	RT.createDemand();		
	RT.selectColumn();
	
	
	
}


}

