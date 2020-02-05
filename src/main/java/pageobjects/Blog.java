package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blog {
	
	
	
public WebDriver driver;
	
	public Blog(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='blog']")
	WebElement Blog;
	@FindBy(xpath="//a[contains(text(),'View Blogs')]")
	WebElement viewblogs;
	@FindBy(xpath="//select[@class='form-control angularSelect ng-pristine ng-valid']//child::option[text()='All']//parent::select")
	WebElement BlogStatus;
	public WebElement blog()
	{
		return Blog;
	}
	public WebElement viewblog()
	{
		return viewblogs;
	}
	public WebElement getstatusfilter()
	{
		return BlogStatus;
	}
// Write blog objects
	@FindBy(xpath="//a[@class='btn btn-primary crte-leads']")
	WebElement writeblog;
	public WebElement writeblog()
	{
		return writeblog;
	}
	
	@FindBy(xpath="//input[@class='form-control ng-pristine ng-invalid ng-touched']")	
		WebElement blogtitle;
	
//		WebDriverWait wt = new WebDriverWait(driver,30);
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched'")));
//		return blogtitle;
		
		
	public WebElement blogtitle()
	{
		return blogtitle;
	}
	
		
	
		     
	


}

