package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Demandpage
{
	
	


		public WebDriver driver;
		
		public Demandpage( WebDriver driver)
		{
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
		
	
	 public WebElement resource() 
	 { 
		 return resource; 
	 }
	 		
		public WebElement createbutton()
		{
			 return createbutton;
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
		
}
