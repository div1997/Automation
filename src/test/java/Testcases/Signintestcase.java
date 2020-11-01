package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pageobject.Signinpage;
import Resource.Baseclass;

public class Signintestcase extends Baseclass {
	public Signinpage sn;
	public WebDriver driver;

	public Signintestcase() {
		super();
	}

	@BeforeMethod
	public void lanuch() {
		Baseclass bs = new Baseclass();
		bs.launchBrowser("firefox");
		Reporter.log("url access successfully");
	}

	@Test
	public void redirecttoRGSPage() {

		Actions hover = new Actions(driver);
		hover.click(sn.signin());

	}

	/*
	 * @Test(dataProvider= "getdata") public void signin(String email, String title,
	 * String firstname, String lastname,String pawword, String days, String
	 * month,String year, String company, String checkbox,String address1, String
	 * address2, String city,String pincode, String state, String country, String
	 * additionalinfo, String phone_number, String mobile_number,String alias) {
	 * Signinpage sn = new Signinpage(driver);
	 * 
	 * 
	 * } // data value must be equals to method arguments.
	 * 
	 * @DataProvider public void getdata() { Object [][] data = new Object [0][20];
	 * data[0][0]= "diya12345@gmail.com"; data[0][1]="jiya"; data[0][2]="khan";
	 * data[0][3]=
	 * 
	 * }
	 */}
