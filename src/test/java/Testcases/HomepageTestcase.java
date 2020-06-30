package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Homepage;
import Resource.Baseclass;

public class HomepageTestcase
{
	public WebDriver driver;

	@BeforeTest
	public void launchbrowser()
	{
		Baseclass bs =new Baseclass();
		bs.launchBrowser("firefox");
		Reporter.log("Url access successfully");
		
	}
	
	@Test
	public void Veriyheader()
	{
		Homepage hm = new Homepage(driver);
		hm.verifytitleimage();
		hm.verifyshopnumber();
		hm.verifycontactus();
		hm.verifysignin();
		hm.verifylogo();
		hm.verifymenubar();
	}
	
	@Test 
	public void verifyfooter() 
	{
		Homepage hm = new Homepage(driver);
		hm.verifynewsletter();
		hm.verifysocailicon();
		hm.verifycategories();
		hm.verifyinformation();
		hm.verifymyaccount();
		hm.verifysiteinfo();
	}
	
	@AfterTest
	public void closeWindow()
	{
		Baseclass bs = new Baseclass();
		bs.closewindow();
	}
}
