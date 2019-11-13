package pageobjects;

import org.openqa.selenium.By;
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
		@FindBy(xpath="/html/body/modal-container/div/div/div[2]/form/div[2]/button[2]")
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

@FindBy(xpath="//datatable-body//datatable-row-wrapper[1]//datatable-body-cell[3]//div[@class='datatable-body-cell-label']//span")
WebElement filename;
public WebElement filename()
{
	return filename;
}
//@FindBy(xpath="//ul[@class='pagination pull-right']//child::li//a[contains(text(),'2')]")
//WebElement pagination;
//public WebElement pagination()
//{
//	
//	return pagination;
//}
public  void pagination_3()
{
//	for(int i=1; i<=2;i++)
//	{
//		
//		WebElement pagination =driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'i')]"));
//		pagination.click();
//	}
	
//	try catch
	boolean p=true;
	try
	{
		Boolean pagination =driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'First')]//parent::li[@class='pagination-first page-item']")).isEnabled();
	
	}
	catch(Exception e)
	{
		p=false;
		
	}
	System.out.print(p);
	if(p==true)
	{
		driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'First')]")).click();
		System.out.print("Click on frist page");
	}
	else
	{
		driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Last')]")).click();
		System.out.print("Click on last page");
	}
}
public void pagination_2()
{
	boolean p=true;
	try
	{
		Boolean pagination =driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Previous')]//parent::li[@class='pagination-first page-item']")).isEnabled();
	
	}
	catch(Exception e)
	{
		p=false;
		
	}
//	Boolean pagination =driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Previous')]")).isEnabled();
//	System.out.print(pagination);
	if(p==true)
	{
		driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Previous')]")).click();
		System.out.print("Click on frist page");
	}
	else
	{
		driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Next')]")).click();
		System.out.print("Click on last page");
	}
}
public void pagination_1()
{
	String totalpage= driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),'Last')]//parent::li//preceding-sibling::li[2]")).getText();
	int i=Integer.parseInt(totalpage);  
	for(int j=1;j<=i;j++)
	{
		String s =String.valueOf(j);  
		WebElement pagevalue = driver.findElement(By.xpath("//ul[@class='pagination pull-right']//child::li//a[contains(text(),"+s+")]"));
		pagevalue.click();
		System.out.println(pagevalue);
	}
	
	
}
}
