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
		@FindBy(xpath="//input[contains(@placeholder,'Search')]")
		WebElement search;
		@FindBy(xpath="//span[@class='fas fa-pencil-alt icon-color']")
		WebElement editdoc;
		@FindBy(xpath="//input[@id='exampleFormControlFile1']")
		WebElement updatedoc;
		@FindBy(xpath="//button[@class='btn btn-primary btn-section']")
		WebElement saveupdate;
		@FindBy(xpath="//option[@value='10']//parent::select")
		WebElement showperpagefilter;
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
public WebElement search()
{
	return search;
}
public WebElement edit()
{
	return editdoc;
}
public WebElement update()
{
	return updatedoc;
}
public WebElement saveupdate()
{
	return saveupdate;
}
public WebElement showperpage()
{
	return showperpagefilter;
}
}
