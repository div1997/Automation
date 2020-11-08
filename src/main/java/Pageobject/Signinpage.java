package Pageobject;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signinpage

{
	public WebDriver driver;

	public Signinpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	WebElement sign;
	
	@FindBy(xpath = "//input[@id='email_create']")
	 public WebElement email;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement create_email;
	
	@FindBy(xpath = "//button[@id='create_account_error']")
	WebElement alert_on_balnk;
	
	@FindBy(xpath = "//div[@class='radio-inline']/child::label[@for='id_gender1']")
	WebElement mr;
	
	@FindBy(xpath = "//div[@class='radio-inline']/child::label[@for='id_gender2']")
	WebElement mrs;
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement First_name;
	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement Last_name;
	@FindBy(xpath = "//input[@id='email']")
	WebElement auto_fill_email;
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	@FindBy(xpath = "//select[@id='days']")
	WebElement days;
	@FindBy(xpath = "//select[@id='months']")
	WebElement month;
	@FindBy(xpath = "//select[@id='uniform-years']")
	WebElement years;
	@FindBy(xpath = "div[@id='uniform-optin']")
	WebElement specail_offer;
	@FindBy(xpath = "//div[@id='uniform-newsletter")
	WebElement news_letter;
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement autofill_firstname;
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement autofill_lastname;
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='id_state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='postcode']")
	WebElement pincode;
	@FindBy(xpath = "select[@id='id_country']")
	WebElement country;
	@FindBy(xpath = "//textarea[@id='other']")
	WebElement additionalinfo;
	@FindBy(xpath = "input[@id='phone']")
	WebElement homephone;
	@FindBy(xpath = "//input[@id='phone_mobile']")
	WebElement mobilephone;
	@FindBy(xpath = "//input[@id='alias']")
	WebElement alias;
	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement register;
	@FindBy(xpath = "//h1[@id='page-heading']")
	WebElement myaccount_lable;
	@FindBy (xpath="//div[@id='create_account_error']")
	WebElement alertmessage;
	
	@FindBy(xpath ="//div[@class='alert alert-danger']")
	WebElement alertonauth;
	public WebElement signin()
	{
		return sign;
	}
	public WebElement email()
	{
		return email;
	}
	
	public WebElement submit()
	{
		return create_email;
	}
	
	
	public WebElement getmale()
	{
		return mr;
	}
	
	public WebElement getfmale()
	{
		return mrs;
	}
	
	
	public WebElement firstname()
	{
		
		return First_name;
	}
	
	public WebElement lastname()
	{
		return Last_name;
	}
	
	public WebElement autofillemail()
	{
		
		return auto_fill_email;
	}
	
	public WebElement autofill_firstname()
	{
		return autofill_firstname;
	}
	
	public WebElement autofill_lastname()
	{
		return autofill_lastname;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement selectdate()
	{
		return days;
		
	}
	
	public WebElement selectmonth()
	{
		return month;
	}
	
	public WebElement selectyear()
	{
		return years;
	}
	
	public WebElement companyname()
	{
		return company;
	}
	
	public WebElement address1()
	{
		return address1;
		
		
	}
	
	public WebElement address2()
	{
		return address2;
	}
	
	public WebElement city()
	{
		return city;
	}
	
	public WebElement state()
	{
		return state;
		
	}
	
	public WebElement pincode()
	{
		return pincode;
	}
	
	public WebElement country()
	{
		return country;
	}
	public WebElement additionalinfo()
	{
		return additionalinfo;
	}
	
	public WebElement homenumber()
	{
		return  homephone;
	}
	
	public WebElement mobilephone()
	{
		return mobilephone;
	}
	
	public WebElement alias()
	{
		return alias;
	}
	
	public WebElement  register()
	{
		return register;
	}
	
	public String verify_register_user()
	{
		 String create_account_page = driver.findElement(By.className("page-subheading")).getText();
		 return create_account_page;
	       
	}
	
	public void clickonsignin()
	{
		signin().click();
	}
	
	public void register_step_1( String email)
	
	{
		System.out.println("enter email");
		
		email().sendKeys(email);
		submit().click();
	   
	     
	 
	}
	
	public void select_gender( String title)
	{
		if (title.equalsIgnoreCase("mr"))
		{
			mr.click();
		}
		else
		{
			mrs.click();
		}
		
	}
	
	public void entername( String firstname, String lastname)
	{
		firstname().sendKeys(firstname);
		lastname().sendKeys(lastname);
		
	}
	
	public void enterpassword(String password)
	{
		password().sendKeys(password);
	}
	
	public void enterdate(String days, String month, String year)
	{
		Select date = new Select(selectdate());
		date.selectByValue(days);
		
		Select monthvalue = new Select (selectmonth());
		monthvalue.selectByValue(month);
		
		Select yearvalue = new Select(selectyear());
		yearvalue.selectByValue(year);
		
		
	}
	
	public void entercomapnyname( String companyname)
	{
		companyname().sendKeys(companyname);
		
	}
	
	public void enterAddress( String address1, String address2, String State, String city, String postalcode, String country)
	{
		address1().sendKeys(address1);
		address2().sendKeys(address2);
		Select statevalue = new Select (state());
		statevalue.selectByValue(State);
		city().sendKeys(city);
		pincode().sendKeys(postalcode);
		Select countryvalue = new Select (country());
		countryvalue.selectByValue(country);
	
	}
	
	public void enteradditionalinfo( String additionalinfo)
	{
		additionalinfo().sendKeys(additionalinfo);
	}
	
	public void entercontactdetails (String home_number, String mobile_number)
	{
		mobilephone().sendKeys(mobile_number);
		homenumber().sendKeys(home_number);
		
	}
	
	public void alias ( String alias)
	{
		alias().sendKeys(alias);
	}
	public void complete()
	{
		register().click();
	}
	
	
	public void login( String username, String passward)
	{
		
		
	}
	public WebElement alertonemptyemail() {
		// TODO Auto-generated method stub
		return alertmessage;
	}
	public WebElement emptydata() {
		// TODO Auto-generated method stub
		return alertonauth;
	}
	
	
	
}
