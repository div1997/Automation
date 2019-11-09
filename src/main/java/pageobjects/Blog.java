package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	WebElement title;
	public WebElement blogtitle()
	{
		return title;
	}


}

