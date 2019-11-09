package OodlesDB;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.DownloadCenter;
import pageobjects.Landingpage;
import resource.Baseclass;
import pageobjects.Commonelements;
public class Downloadcentertestcase extends Baseclass {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException  
	{
	
	
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	@Test
	public void adddocumenttype() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		Thread.sleep(2000);
		
		DownloadCenter dc = new DownloadCenter(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", dc.project());
		js.executeScript("arguments[0].click()", dc.downloadcenter());
	
	dc.addtype_button1().click();
	Thread.sleep(1000);
	dc.add_button().click();
//	dc.doctypeName().sendKeys("Project RTM3");
//	dc.doctypedescription().sendKeys("Complete requirement tracibilty document");
//	Thread.sleep(1000);
//	dc.save().click();
//	dc.close().click();
	/*Thread.sleep(1000);
	dc.adddocument().click();
	
	Select option = new Select (dc.dropdown());
	option.deselectByVisibleText("Project RTM");
	dc.upload().sendKeys("/home/divya/Pictures");
//	dc.savedoc().click();
	*/
		
	}
	
	

}
