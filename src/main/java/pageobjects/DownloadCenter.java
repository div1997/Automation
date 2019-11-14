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
    @FindBy(xpath="//form//div[3]//button[1][contains(text(),'Save')]")
    WebElement savedoc;
    @FindBy(xpath="//thead//tr[2]//th[5]//input[@type='text']")
    WebElement searchDocumentype;
    @FindBy(xpath="//tbody//tr[1]//td[6]//span[2]//a[1]//span[@class='fas fa-pencil-alt icon-color']")
    WebElement Edit;
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
	
	@FindBy(xpath="//tbody//tr[2]//td[4]//i[1][@class='fas fa-pencil-alt icon-color']")
	WebElement editdoctypebutton;
	public WebElement editdoctypebutton()
	{
		return editdoctypebutton;
	}
	@FindBy(xpath="//form//div//div//div[@class='row']//div//div//input[@id='formGroupExampleInput1']")
	WebElement editdoctypename;
	public WebElement editdoctypename()
		{
			return editdoctypename;
		}
	@FindBy(xpath="//form//div//div//div[@class='row']//div//div[2]//input[@id='formGroupExampleInput2']")
	WebElement editdoctypedescription;
	public WebElement editdoctypedescription()
	{
		return editdoctypedescription;
	}
	@FindBy(xpath="//form//div[2]//button[2][@class='btn btn-primary btn-section']")
	WebElement saveeditdoctype;
	public WebElement saveEditDocType()
	{
		return saveeditdoctype;
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
	
	public WebElement searchDocumentype ()
	{
		return searchDocumentype;
	}
	public WebElement edit() 
	{
		return Edit;
	}
	@FindBy(xpath="//form//div[1]//div//div//div[2]//div[2]//input[@id='exampleFormControlFile1']")
	WebElement updatedDoc;
	public WebElement updatedDoc() {
		return updatedDoc;
	}
	@FindBy(xpath="//form//div[2]//button[2][@class='btn btn-primary btn-section']")
	WebElement saveEdit;
	public WebElement saveEdit()
	{
		return saveEdit;
	}
	@FindBy(xpath="//tbody//tr[1]//td[6]//span[2]//a[2]//span[@class='fas fa-download icon-color']")
	WebElement download;
	public WebElement download()
	{
		return download;
	}
	@FindBy(xpath="//tbody//tr[1]//td[6]//span[2]//a[3]//span[@class='fas fa-trash-alt icon-color']")
	WebElement delete;
	public WebElement delete(){
		{
			return delete;
		}
	}
	@FindBy(xpath="//div//form//div//div//div//button[1][@class='btn btn-primary']")
	WebElement deleteyes;
	public WebElement deleteyes()
	{
		return deleteyes;
	}
@FindBy(xpath="//select[@class='form-control customSelectCss ng-pristine ng-valid ng-touched']")
WebElement showperpage;
public WebElement showperpage() 
{
	return showperpage;
}
}
