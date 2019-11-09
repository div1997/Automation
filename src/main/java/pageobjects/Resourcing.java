package pageobjects;



	import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

	public class Resourcing extends Commonelements
	{
		
		


			public WebDriver driver;
			
			public Resourcing( WebDriver driver)
			{
				super(driver);
				this.driver= driver;
				PageFactory.initElements(driver, this);
			}
			
		     @FindBy(xpath = "//*[@id=\"li\"]/a")	
		     WebElement resource;
			@FindBy (xpath= "//*[@id=\"opener\"]")
			WebElement createbutton;
			@FindBy (xpath = "(//*[@id=\"project\"])[1]")
			WebElement projectfield;
			@FindBy (xpath ="//*[@id=\"designation\"]")
			WebElement designationfield;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[1]/tags-input/div/div/input")
			WebElement primaryskill;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[1]/div[3]/textarea")
			WebElement comment;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[2]/div[1]/input")
			WebElement opening;
			@FindBy (xpath = "/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[2]/div[2]/input")
			WebElement experience;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[2]/tags-input/div/div/input")
			WebElement secondaryskill;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[3]/div[1]/select")
			WebElement billablestatus;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[3]/div[2]/select")
			WebElement priority;
			@FindBy (xpath = "/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[1]/div[3]/div[3]/input")
			WebElement grades;
			@FindBy (xpath = "/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[3]/button[1]")
			WebElement save;
			@FindBy (xpath ="/html/body/div[1]/div/div[2]/div[4]/div/div/div/div/div[1]/div[3]/div[3]/button[2]")
			WebElement cancel;
			@FindBy(id="menu1")
			WebElement Showhide;
		
		 public WebElement resource() 
		 { 
			 return resource; 
		 }
				 
			
			public WebElement projectfield()
			{
				 return projectfield;
			}
			
			public WebElement designationfield()
			{
				 return designationfield;
			}
			public WebElement primaryskill()
			{
				 return primaryskill;
			}
			public WebElement secondaryskill()
			{
				 return secondaryskill;
			}
			public WebElement billablestatus()
			{
				
				 return billablestatus;
			}
			public WebElement comment()
			{
				 return comment;
			}
			public WebElement opening()
			{
				 return opening;
			}
			public WebElement priority()
			{
				 return priority;
			}
			public WebElement save()
			{
				 return save;
			}
			public WebElement cancel()
			{
				 return cancel;
			}
			public WebElement experience()
			{
				 return grades;
			}
		
          
//	public void createDemand() {
//		// TODO Auto-generated method stub
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", createbutton);
//		
//		projectfield.sendKeys("oodles");
//		projectfield.sendKeys(Keys.ARROW_DOWN);
//		projectfield.sendKeys(Keys.ENTER);
//		designationfield.sendKeys("QA");
//		designationfield.sendKeys(Keys.ARROW_DOWN);
//		designationfield.sendKeys(Keys.ARROW_DOWN);
//		designationfield.sendKeys(Keys.ENTER);
//		primaryskill.sendKeys("QA");
//		primaryskill.sendKeys(Keys.ARROW_DOWN);
//		primaryskill.sendKeys(Keys.ENTER);
//		secondaryskill.sendKeys("QA");
//		secondaryskill.sendKeys(Keys.ARROW_DOWN);
//		secondaryskill.sendKeys(Keys.ENTER);
//		billablestatus.click();
//		Select option = new Select(billablestatus);
//		option.selectByIndex(2);
//		priority.click();
//		Select opt = new Select(priority);
//		opt.deselectByVisibleText("Normal");
//		comment.sendKeys("need after 20 days");
//		String grade = grades.getText();
//		Assert.assertEquals("E1", "E1");
//		js.executeScript("arguments[0].click()", save);
//		
	//}
	
	public void selectColumn() throws InterruptedException
	{
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click()",Showhide);
		for(int i=0; i>=17; i++)
		{
		String opt =  driver.findElement(By.xpath("//div//ul[@class='dropdown-menu carrer-from']//li[i]//input[@type='checkbox']")).getText();
		
		System.out.println(opt);
		}
		
	 
				
	}


	
	}

	

