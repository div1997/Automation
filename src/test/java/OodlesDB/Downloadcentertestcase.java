package OodlesDB;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.DownloadCenter;
import pageobjects.Landingpage;
import resource.Baseclass;
public class Downloadcentertestcase extends Baseclass {
	
	
	
	WebDriver driver;
	
	
	DownloadCenter dc;
	@BeforeTest
	public void initialize() throws IOException  
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	
	
	@Test
	public void login() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
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
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void addDocumentype_downloadcenter() throws InterruptedException
	{
	
		//dc.add_Type_Dc();
//	dc.addtype_button1().click();
//	Thread.sleep(2000);
//	dc.add_button().click();
//	dc.doctypeName().sendKeys("Project RTM_23");
//	dc.doctypedescription().sendKeys("Complete requirement tracibilty document");
//    Thread.sleep(2000);
//	dc.save().click();
//	Thread.sleep(2000);
//	dc.close().click();
//	Thread.sleep(1000);
		dc.addTypeDc("test project", "project testcase audit");
	}
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void editDocument() throws InterruptedException
	{
		Thread.sleep(2000);
		dc.edit(6);
		Thread.sleep(2000);
		dc.updatedDoc().sendKeys("/home/divya/Pictures/ELK.png");
		dc.saveEdit().click();
	}
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void editDocumenttype() throws InterruptedException
	{
//		dc.addtype_button1().click();
//		//tbody//tr["+i+"]//td[4]//i[1][@class='fas fa-pencil-alt icon-color']
//	
//		Thread.sleep(2000);
//		//dc.editdoctypebutton().click();
//		dc.edit_doctype_row(3);
//		dc.editdoctypename().sendKeys(Keys.CONTROL + "a");
//		dc.editdoctypename().sendKeys(Keys.DELETE);
//		dc.editdoctypename().sendKeys("Edited_2 Row");
//		dc.editdoctypedescription().sendKeys(Keys.CONTROL + "a");
//		dc.editdoctypedescription().sendKeys(Keys.DELETE);
//		dc.editdoctypedescription().sendKeys("edited_2 Row");
//		dc.saveEditDocType().click();
//		Thread.sleep(2000);
//		dc.close().click();
//		Thread.sleep(1000);
//		dc.addtype_button1().click();
		dc.editTypeDc(5,"fff", "hgdfhgdhfgd");
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=true)
	public void addDocumentDownloadcenter() throws InterruptedException
	{
//	dc.adddocument().click();
//	
//	Select option = new Select (dc.dropdown());
//	option.selectByVisibleText("Project RTM_23");
//	dc.upload().sendKeys("/home/divya/Pictures/ELK.png");
//	Thread.sleep(1000);
//	dc.savedoc().click();
		dc.addDocumentDc("test project", "/home/divya/Pictures/ELK.png");
	}
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyDocumentType() throws InterruptedException
	{
	dc.searchDocumentype().sendKeys("Project RTM_23");
	Thread.sleep(2000);
	dc.searchDocumentype().sendKeys(Keys.CONTROL + "a");
	dc.searchDocumentype().sendKeys(Keys.DELETE);
//	
//	dc.searchDocumentype().clear();
//	dc.searchDocumentype().click();
//	
//	
    }
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyuploaedby() throws InterruptedException
	{
	dc.searcbyuploadedby().sendKeys("Arvind Dass");
	Thread.sleep(2000);
	dc.searcbyuploadedby().sendKeys(Keys.CONTROL + "a");
	dc.searcbyuploadedby().sendKeys(Keys.DELETE);
//	
//	dc.searchDocumentype().clear();
//	dc.searchDocumentype().click();
//	
//	
    }
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void searchbyfilename() throws InterruptedException
	{
//	dc.searchFilename().sendKeys("time.png");
//	Thread.sleep(2000);
//	dc.searchFilename().sendKeys(Keys.CONTROL + "a");
//	dc.searchFilename().sendKeys(Keys.DELETE);
////	
//	dc.searchDocumentype().clear();
//	dc.searchDocumentype().click();
		dc.searchFilename("ELK.png");
	
    }
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void downloadDocument() throws InterruptedException 
	{
		dc.searchDocumentype().sendKeys("Project Initiation");
		Thread.sleep(2000);
		dc.download().click();
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void deleteDocument() throws InterruptedException
	{
		dc.searchDocumentype().sendKeys("Project");
		Thread.sleep(2000);
		dc.delete().click();
//		 Alert alert = driver.switchTo().alert();
//		 alert.accept();
		dc.deleteyes().click();
		dc.searchDocumentype().sendKeys(Keys.CONTROL + "a");
		dc.searchDocumentype().sendKeys(Keys.DELETE);
	}
	
	
	@Test(dependsOnMethods={"downloadpageNavigation"},enabled=false)
	public void showPerPageFilter() throws InterruptedException 
	{
		
//		dc.showperpage().click();
	Select option = new Select(dc.showperpage());

	option.selectByVisibleText("Show 50 per page");
	
		}
	
	@Test(enabled=false)
	public void pagination()
	{
		
	}

}
