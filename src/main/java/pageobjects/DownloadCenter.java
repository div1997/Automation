package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadCenter {

	
	public WebDriver driver;
	
	public DownloadCenter(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a/span[@class='project_icon']")
			WebElement project;
	
	
	@FindBy(xpath="//a[contains(text(),'Download Center')]")
	WebElement downloadcenter;
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-0']")
	WebElement addtype;
	@FindBy(xpath="//button[@class='btn btn-primary button-color customBtnCss']//parent::div//child::button[1]")
	WebElement addtype2;
	@FindBy(xpath="//input[@id='formGroupExampleInput1']")
	WebElement typename;
	@FindBy(xpath="//input[@id='formGroupExampleInput2']")
	WebElement typedescription;
	@FindBy(xpath="//*[@id=\"myModal\"]/div/div/div[2]/form/div[2]/div[2]/button[1]")
	WebElement save;
	@FindBy(css="#myModal > div > div > div.modal-body > form > div.modal-footer.addTypeFooter > button")
	WebElement close;
	@FindBy(xpath="//button[@class='btn btn-primary mr-3']")
	WebElement adddoc;
    @FindBy(xpath="//select[@id='exampleFormControlSelect1']")
    WebElement dropdown_download;
    
    @FindBy(xpath="//input[@name='fileTypeData2']")
    WebElement uploadfile;
    @FindBy(xpath="//button[@class='btn btn-primary button-color customBtnCss']//parent::div//child::button[1]")
    WebElement savedoc;
	public WebElement project()
	{
		return project;
	}
	
	public WebElement downloadcenter()
	{
		return downloadcenter;
	}
	
	public WebElement addtype_button1()
	{
		return addtype;
	}
	public WebElement add_button()
	{
		return addtype2;
	}

	public WebElement doctypeName()
	{
		return typename;
	}
	public WebElement doctypedescription()
	{
		return typedescription;
		
	}
	public WebElement save()
	{
		return save;
	}
	public WebElement close()
	{
		return close;
	}
	
	public WebElement adddocument()
	{
		return adddoc;
	}
	public WebElement dropdown()
	{
		return dropdown_download;
	}
	public WebElement upload()
	{
		return uploadfile;
	}
	public WebElement savedoc()
	{
		return savedoc;
	}
	
}
