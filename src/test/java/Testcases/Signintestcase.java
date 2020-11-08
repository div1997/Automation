package Testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import Pageobject.Signinpage;
import Resource.Baseclass;

public class Signintestcase extends Baseclass
{
	public Signinpage sn;
	public WebDriver driver;

	public Signintestcase() 
	{
		super();
	}

	@BeforeMethod
	public void lanuch() {
		Baseclass bs = new Baseclass();
		bs.launchBrowser("firefox");
		Reporter.log("url access successfully");
	}

	@Test (enabled = true)
	public void redirecttoRGSPage() {

		Actions hover = new Actions(driver);
		hover.click(sn.signin());

	}
	
	
	@Test (enabled = true)
	public void register_step1onempty()
	{
		sn.register_step_1("");
		sn.submit();
		String alertmessage = sn.alertonemptyemail().getText();
		Assert.assertEquals(alertmessage, "Invalid email address");
		Reporter.log("error message"+alertmessage);
		
	}
	@Test (enabled = true)
	public void registeronexistemail()
	{
		sn.register_step_1("test123@gmail.com");
		sn.submit();
		String alertonexistemail = sn.alertonemptyemail().getText();
		Assert.assertEquals(alertonexistemail, "An account using this email address has already been registered. Please enter a valid password or request a new one");
		Reporter.log("error message onexits mail"+alertonexistemail);
		
	}
	@Test (enabled = true)
	public void registeronnewemail() 
	{
		sn.register_step_1("test567@gmail.com");
		sn.submit();
		Reporter.log("redirect to authentication page");
	}
	
	@Test (dependsOnMethods = {"registeronnewemail"})
	public void verifyregisterstep2onempty()
	{
		sn.complete();
		String alertmessage = sn.emptydata().getText();
		Reporter.log(alertmessage);
		
		
		
	}
	
	@Test (enabled = true)
	public void verifytitle()
	{
		boolean displayfemaletitle = sn.getfmale().isDisplayed();
		boolean displaymaletitle = sn.getmale().isDisplayed();
	
		if(displayfemaletitle == true && displaymaletitle == true)
		{
			Reporter.log("title display");
		}
		else 
		{
			Reporter.log("title does not display");
		}
		
	}
	
	@Test (enabled = true)
	public void verifyfirstname()
	{
	 boolean display = sn.firstname().isDisplayed();
	 if(display == true )
		{
			Reporter.log("title display");
		}
		else 
		{
			Reporter.log("title does not display");
		}
		            
	}
	
	@Test (enabled = true)
	public void verifyLastname()
	{
		boolean display = sn.lastname().isDisplayed();
		 if(display == true )
			{
				Reporter.log("title display");
			}
			else 
			{
				Reporter.log("title does not display");
			}
	}
	
	@Test (enabled = true)
	public void autofillemail()
	{
		String email = sn.autofillemail().getText();
		Reporter.log("user email is"+email);
		
	}
	
	@Test (enabled = true)
	public void verifypassward()
	{
		boolean display = sn.password().isDisplayed();
		 if(display == true )
			{
				Reporter.log("title display");
			}
			else 
			{
				Reporter.log("title does not display");
			}
	}
	
	@Test
	public void verifydate()
	{
		boolean displaydate = sn.selectdate().isDisplayed();
		boolean displaymonth = sn.selectmonth().isDisplayed();
		boolean displayyear = sn.selectyear().isDisplayed();
		 if(displaydate == true && displaymonth == true && displayyear == true )
			{
				Reporter.log("days,month and year fields are displayed");
			}
			else 
			{
				Reporter.log("fields are not displayed ");
			}
	}
	
	@Test
	public void verifyautofillfirstname()
	{
	 String firstname  = sn.autofill_firstname().getText();
	 Reporter.log("in address field firstname is "+firstname);
	 
	}
	
	@Test
	public void verifyautofilllastname()
	{
		String lastname  = sn.autofill_lastname().getText();
		Reporter.log(" In address field lastname is "+lastname);
	}
	
	@Test
	
	public void verifycompanyname()
	{
		
	}
	
	@Test
	
	public void verifyaddress()
	{
		
	}
	
	@Test
	
	public void verifycity()
	{
		
	}
	
	@Test
	public void verfitstate()
	{
		
	}
	
	@Test
	public void verifypostalcode()
	{
		
	}
	
	@Test
	public void verifycountry()
	{
		
	}
	@Test 
	public void verifyaddtionalinfo()
	{
		
	}
	@Test(enabled = true)
	public void register_step2()
	{
		
		
	}

	
	 }
