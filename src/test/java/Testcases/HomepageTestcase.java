package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pageobject.Homepage;
import Resource.Baseclass;

public class HomepageTestcase
{

	@BeforeMethod
	public void launchbrowser()
	{
		Baseclass bs =new Baseclass();
		bs.launchBrowser("firefox");
		
	}
	
	@Test
	public void Veriyheader()
	{
		Homepage hm = new Homepage(null);
		hm.verifytitleimage();
		hm.verifyshopnumber();
		hm.verifycontactus();
		hm.verifysignin();
		hm.verifylogo();
		hm.verifymenubar();
	}
}
