package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policy {

	
		
		WebDriver driver;
		public Policy( WebDriver driver)
		{
		
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//a[contains(@class,'OthersHighlighted')]//child::span")
		WebElement Others;
		
		@FindBy(xpath="//a[contains(text(),'Policy')]")
		WebElement Policy;
		
		@FindBy(xpath="//button[contains(@class,'btn btn-primary mr-0')]")
		WebElement addpolicytypebutton;
		@FindBy(xpath="//input[@id='formGroupExampleInput2']")
		WebElement policytype;
		@FindBy(xpath="//button[@class='btn btn-primary button-color customBtnCss']//parent::div//child::button[1]")
		WebElement savetype;
		@FindBy(xpath="//button[@title='Add Doument']")
		WebElement adddocument;
		@FindBy(xpath="//select[@name='fileTypeData1']")
		WebElement typedropdown;
		@FindBy(xpath="//input[@name='fileTypeData2']")
		WebElement uploadfilebutton;
		@FindBy(css="#myModal1 > div > div > div.modal-body > form > div.modal-footer > button:nth-child(1)")
		WebElement savepolicydocument;
		//button[@class='btn btn-primary button-color customBtnCss']//parent::div//child::button[1]
		public WebElement Others()
		{
			return Others;
		}
		
		public WebElement policy()
		{
			return Policy;
		}
		
		public WebElement typeButton()
		{
			return addpolicytypebutton;
		}
	public WebElement addtype()
	{
		return policytype;
		
	}
public WebElement savetype()
{
	return savetype;
}
public WebElement adddocument()
{
	return adddocument;
}

public WebElement typedropdown()
{
	return typedropdown;
	
}

public WebElement uploadfile()
{
	return uploadfilebutton;
}

public WebElement savedoc()
{
	return savepolicydocument;
}
}
