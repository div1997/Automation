package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Policy {
	
	WebDriver driver;
	
	public Policy(WebDriver driver)
	{
		this.driver= driver;
	}
	
	@FindBy(xpath="//*[@id=\"1\"]")
	WebElement policy;
	@FindBy(xpath="/html/body/app-root/div/app-policy/div/div/div/div[2]/button[1]/i")
	WebElement adddoctype;
	@FindBy(name="filetype")
	WebElement filetype;
	@FindBy(xpath="//*[@id=\"myModal\"]/div/div/div[2]/form/div[2]/button[1]")
	WebElement save;
	@FindBy(xpath="/html/body/app-root/div/app-policy/div/div/div/div[2]/button[2]")
	WebElement Adddocument;
	@FindBy(name="fileTypeData1")
	WebElement doctype;
	@FindBy(xpath="//*[@id=\"myModal1\"]/div/div/div[2]/form/div[2]/input")
	WebElement selectfile;
	
	@FindBy(xpath="//*[@id=\"myModal1\"]/div/div/div[2]/form/div[3]/button[1]")
	WebElement submit;
	
	
	
	

}
