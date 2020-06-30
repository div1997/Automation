package Testcases;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pageobject.Signinpage;
import Resource.Baseclass;

public class Signintestcase extends Baseclass
{


		@BeforeMethod
		public void lanuch()
		{
			Baseclass bs = new Baseclass();
			bs.launchBrowser("firefox");
			Reporter.log("url access successfully");
		}
		
		@Test
		public void signin()
		{
		Signinpage sn = new Signinpage(driver);
	
					
		}
		
}
