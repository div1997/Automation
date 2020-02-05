package OodlesDB;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.DownloadCenter;
import pageobjects.Landingpage;
import resource.Baseclass;
import resource.Testutill;
public class Downloadcentertestcase extends Baseclass {
	
	
	
	WebDriver driver;
	DownloadCenter dc;
	String sheetname="login";
	
	@BeforeTest
	public void initialize() throws IOException  
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	
	@DataProvider
	public Object[][] logingetTestdata()
	{
	Object data1 [][]=	Testutill.getestdata(sheetname);
	return data1;
	}
	@Test(dataProvider ="logingetTestdata")
	public void login(String username, String password) throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		
		lp.login(username, password);
		
		Thread.sleep(2000);
	}
	
	@Test (dependsOnMethods={"login"})
	public void downloadpageNavigation()
	{
	     dc = new DownloadCenter(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", dc.project());
		js.executeScript("arguments[0].click();", dc.downloadcenter());
		
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=true)
	public void addDocumentype_downloadcenter() throws InterruptedException
	{
	

		dc.addTypeDc("33333", "dncdscndsndsb");  
	}
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void editDocumenttype() throws InterruptedException
	{

		dc.editTypeDc(5,"hgjhgjhg", "hgdfhgdhfgd");
		//Assert.assertEquals(expected, actual);
	}

	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void addDocumentDownloadcenter() throws InterruptedException
	{

		dc.addDocumentDc("test project", "/home/divya/Pictures/ELK.png");
	}
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void editDocument() throws InterruptedException
	{
		dc.editDocumentDc(4,"/home/divya/Pictures/ELK.png");
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyDocumentType() throws InterruptedException
	{
	dc.searchDocumentType("Test Planning");
    }
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyuploaedby() throws InterruptedException
	{
	dc.searchUploadedby("Rijul Jain");
    }
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyfilename() throws InterruptedException
	{

		dc.searchFilename("ELK.png");
	
    }
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void downloadDocument() throws InterruptedException 
	{
		dc.downlodDocument("ELK.png");
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void deleteDocument() throws InterruptedException
	{
	dc.deleteDocument("ELK.png");
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void showPerPageFilter() throws InterruptedException 
	{
		
		dc.showperpagefilter("Show 25 per page");
	
	}
	
	@Test(enabled=false)
	public void pagination()
	{
		
	}

}
