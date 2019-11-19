package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DownloadCenter
{

	
	public WebDriver driver;
	
	
	public DownloadCenter(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // all variables are initialized with driver
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
	public void edit_doctype_row(int i)
	{
		
		driver.findElement(By.xpath("//tbody//tr["+i+"]//td[4]//i[1][@class='fas fa-pencil-alt icon-color']")).click();
	

		//	@FindBy(xpath="//tbody//tr["+i+"]//td[4]//i[1][@class='fas fa-pencil-alt icon-color']")
//	WebElement editdoctypebutton;
//	public WebElement editdoctypebutton()
//	{
//		return editdoctypebutton;
//	}
	}
	@FindBy(xpath="//form//div//div//div[@class='row']//div//div//input[@id='formGroupExampleInput1']")
	WebElement editdoctypename;
	@FindBy(xpath="//form//div//div//div[@class='row']//div//div[2]//input[@id='formGroupExampleInput2']")
	WebElement editdoctypedescription;
	@FindBy(xpath="//form//div[2]//button[2][@class='btn btn-primary btn-section']")
	WebElement saveeditdoctype;
	@FindBy(xpath="//button[@class='btn btn-primary mr-3']")
	WebElement adddoc;
    @FindBy(xpath="//select[@id='exampleFormControlSelect1']")
    WebElement dropdown_download;
    
    @FindBy(xpath="//input[@name='fileTypeData2']")
    WebElement uploadfile;
    @FindBy(xpath="//form//div[3]//button[1][contains(text(),'Save')]")
    WebElement savedoc;
    public void edit(int i) 
	{
		 driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]//span[2]//a[1]//span[@class='fas fa-pencil-alt icon-color']")).click();
		    	
	}
    @FindBy(xpath="//form//div[1]//div//div//div[2]//div[2]//input[@id='exampleFormControlFile1']")
	WebElement updatedDoc;
    @FindBy(xpath="//form//div[2]//button[2][@class='btn btn-primary btn-section']")
	WebElement saveEdit;
    @FindBy(xpath="//tbody//tr[1]//td[6]//span[2]//a[2]//span[@class='fas fa-download icon-color']")
	WebElement download;
    @FindBy(xpath="//tbody//tr[1]//td[6]//span[2]//a[3]//span[@class='fas fa-trash-alt icon-color']")
	WebElement delete;
    @FindBy(xpath="//div//form//div//div//div//button[1][@class='btn btn-primary']")
	WebElement deleteyes;
    @FindBy(xpath="//thead//tr[2]//th[5]//input[@type='text']")
    WebElement searchDocumentype;
    @FindBy(xpath="//thead//tr[2]//th[4]//input[@type='text']")
    WebElement searcbyuploadedby;
    @FindBy(xpath="//thead//tr[2]//th[2]//input[@type='text']")
    WebElement searchFilename;
    @FindBy(xpath="//select[@class='form-control customSelectCss ng-untouched ng-pristine ng-valid']")
    WebElement showperpage;
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

	public WebElement editdoctypename()
		{
			return editdoctypename;
		}
	
	public WebElement editdoctypedescription()
	{
		return editdoctypedescription;
	}
	
	
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
	
	public WebElement searcbyuploadedby ()
	{
		return searcbyuploadedby;
	}
	
	public WebElement searchFilename ()
	{
		return searchFilename;
	}
	
	
	public WebElement updatedDoc() {
		return updatedDoc;
	}
	
	public WebElement saveEdit()
	{
		return saveEdit;
	}
	
	public WebElement download()
	{
		return download;
	}
	
	public WebElement delete(){
		{
			return delete;
		}
	}
	
	public WebElement deleteyes()
	{
		return deleteyes;
	}

		public WebElement showperpage() 
		{
			return showperpage;
		}
		public void addTypeDc(String type, String description) throws InterruptedException 
		{
			addtype_button1().click();
			Thread.sleep(2000);
			add_button().click();
			doctypeName().sendKeys(type);
			doctypedescription().sendKeys(description);
		    Thread.sleep(2000);
			save().click();
			Thread.sleep(2000);
			close().click();
			Thread.sleep(1000);	
		}
		public void editTypeDc(int i,String type, String description) throws InterruptedException
		{
			addtype_button1().click();
			//tbody//tr["+i+"]//td[4]//i[1][@class='fas fa-pencil-alt icon-color']
		
			Thread.sleep(2000);
			//dc.editdoctypebutton().click();
			edit_doctype_row(i);
			editdoctypename().sendKeys(Keys.CONTROL + "a");
			editdoctypename().sendKeys(Keys.DELETE);
			editdoctypename().sendKeys(type);
			editdoctypedescription().sendKeys(Keys.CONTROL + "a");
			editdoctypedescription().sendKeys(Keys.DELETE);
			editdoctypedescription().sendKeys(description);
			saveEditDocType().click();
			Thread.sleep(2000);
			close().click();
			Thread.sleep(1000);
			addtype_button1().click();
		}
		public void addDocumentDc(String type,String filepath) throws InterruptedException 
		{
			adddocument().click();
			
			Select option = new Select (dropdown());
			option.selectByVisibleText(type);
			upload().sendKeys(filepath);
			Thread.sleep(1000);
			savedoc().click();
		}
		
		public void editDocumentDc(int i ,String filepath) throws InterruptedException
		{
			Thread.sleep(2000);
			edit(i);
			Thread.sleep(2000);
			updatedDoc().sendKeys(filepath);
			saveEdit().click();
		}
		public void searchFilename(String filename) throws InterruptedException
		{
			searchFilename().sendKeys(filename);
			Thread.sleep(2000);
			searchFilename().sendKeys(Keys.CONTROL + "a");
			searchFilename().sendKeys(Keys.DELETE);
		}
		public void searchUploadedby(String uploadedby) throws InterruptedException
		{
			searcbyuploadedby().sendKeys(uploadedby);
			Thread.sleep(2000);
			searcbyuploadedby().sendKeys(Keys.CONTROL + "a");
			searcbyuploadedby().sendKeys(Keys.DELETE);
		}
		public void searchDocumentType(String type) throws InterruptedException
		{
			searchDocumentype().sendKeys(type);
			Thread.sleep(2000);
			searchDocumentype().sendKeys(Keys.CONTROL + "a");
			searchDocumentype().sendKeys(Keys.DELETE);
		//	
		//	dc.searchDocumentype().clear();
		//	dc.searchDocumentype().click();
		}
		public void showperpagefilter(String pagecount)
		{
			Select option = new Select(showperpage());
		
			option.selectByVisibleText(pagecount);
		}
		public void deleteDocument(String filename) throws InterruptedException
		{
			searchDocumentype().sendKeys(filename);
			Thread.sleep(2000);
			delete().click();
		//	 Alert alert = driver.switchTo().alert();
		//	 alert.accept();
			deleteyes().click();
			searchDocumentype().sendKeys(Keys.CONTROL + "a");
			searchDocumentype().sendKeys(Keys.DELETE);	
		}
		public void downlodDocument(String filename) throws InterruptedException
		{
			searchDocumentype().sendKeys(filename);
			Thread.sleep(2000);
			download().click();
		}
		public void pagination (String value)
		{
		}
		public void pagination_2(int i)
		{
		}
		
		
}