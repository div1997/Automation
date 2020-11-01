package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sun.tools.sjavac.Log;

import Pageobject.Homepage;
import Pageobject.Orderpage;
import Resource.Baseclass;

public class HomepageTestcase extends Baseclass 
{
	// public WebDriver driver;
	public Homepage hm;

	public HomepageTestcase() 
	{
		super(); // here by calling super() method we intialize the all
		// variable of baseclass
	}

	@BeforeMethod
	public void launchbrowser() throws InterruptedException 
	{
		launchBrowser("chrome");
		Reporter.log("Url access successfully");
		Thread.sleep(2000);

	}

	@Test(priority = 1, enabled = false)
	public void Veriyheader() 
	{
		hm = new Homepage(driver);
		hm.verifytitleimage();
		hm.verifyshopnumber();
		hm.verifycontactus();
		hm.verifysignin();
		hm.verifylogo();
		hm.verifymenubar();
	}

	@Test(enabled = false)
	public void search() 
	{
		hm = new Homepage(driver);
		hm.searchfield("tops for girl");
		WebElement response = driver.findElement(By.xpath("//div[@id = 'center_column']/p"));
		String searchresult = response.getText();
		System.out.println(searchresult);
		String a = searchresult.substring(0, 38);

		System.out.println(a);
		String b = searchresult.substring(39, 43);
		System.out.println(b);

		// String ncIDNumber = ncIDNumber.substring(1, ncIDNumber.length() - 1);
		// Assert.assertEquals( , "No results were found for your search"+search_data);

	}
	
	@Test(enabled=false)
	public void test_arrow()
	{
		hm =new Homepage(driver);
		
		for(int i=0;i<=10;i++)
		{
		hm.arrow().click();
		}
		Reporter.log("image marque work properlly");
	}
	
	@Test(enabled=false)
	public void click_on_popularTab()
	{
		hm = new Homepage(driver);
		hm.best_seller().click();
		hm.popular().click();
	}
	
	@Test(expectedExceptions= NoSuchElementException.class)
	public void addproductfrompopulartab() throws InterruptedException 
	{
		
		hm = new Homepage(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,800)");
		
		
		hm.product_name("Printed Dress").click();
		hm.quantity("1");
		hm.dress_size("2");
		Thread.sleep(1000);
		hm.color_choice("white");
		hm.checkproduct();
		Thread.sleep(1000);
		//hm.closeviewimage().click();
		js.executeScript("arguments[0].click();", hm.addcart());
		/*Actions move = new Actions(driver);
		move.moveToElement(hm.addcart()).click().build().perform();*/
		//hm.proceedtocheckout().sendKeys(Keys.CONTROL.SHIFT,"t");
		
		
	}
	

	@Test(priority = 2, enabled = false)
	public void verifyfooter()
	{
		hm = new Homepage(driver);
		hm.verifynewsletter();
		hm.verifysocailicon();
		hm.verifycategories();
		hm.verifyinformation();
		hm.verifymyaccount();
		hm.verifysiteinfo();
	}

	@Test (priority= 3, enabled= false)
	public void newsletter() throws InterruptedException 
	{
		hm = new Homepage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		hm.newsletterfield("dvya123@gmail.com");
		WebElement success = driver.findElement(By.xpath(""));
		
	}

	@AfterTest(enabled= false)
	public void closeWindow() 
	{
		driver.close();
	}
}
