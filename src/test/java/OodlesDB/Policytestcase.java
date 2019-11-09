package OodlesDB;
import java.io.IOException;

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

	
		
		
		
		WebDriver driver;
		
		@BeforeTest
		public void initialize() throws IOException  
		{
		
		
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
		
		}
	
	@Test
	public void addPolicy() throws InterruptedException
	
	{
	
		Landingpage lp=new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		
		Policy pd = new Policy(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pd.Others());
		js.executeScript("arguments[0].click()", pd.policy());
		pd.typeButton().click();
		pd.addtype().sendKeys("HR_Leavedoc55");
		pd.savetype().click();
		
		Thread.sleep(1000);
		pd.adddocument().click();;
		Select option = new Select(pd.typedropdown());
		option.selectByVisibleText("HR Manual");
		pd.uploadfile().sendKeys("/home/divya/Pictures/Screenshot from 2019-06-27 18-13-24.png");
		Thread.sleep(1000);
		//js.executeScript("arguments[0].click()", pd.savedoc());
		
		pd.savedoc().click();
	
		
		
	
	}
	
}
