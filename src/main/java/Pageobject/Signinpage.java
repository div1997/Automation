package Pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage 

{
	public WebDriver driver;
	public Signinpage( WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "a[cotians((text(),'Sign in')]")                 
	WebElement sign;
	@FindBy(id="email_create")
	WebElement email;
	@FindBy(id="SubmitCreate")
	WebElement create_email;
	@FindBy(id="create_account_error")
	WebElement alert_on_balnk;
	@FindBy(xpath="div[@id='uniform-id_gender1']")
	WebElement mr;
	@FindBy (xpath="div[@id='uniform-id_gender2']")
	WebElement mrs;
	@FindBy(xpath="input[@id='customer_firstname']")
	WebElement First_name;
	@FindBy(xpath="input[@id='customer_lastname']")
	WebElement Last_name;
	@FindBy(xpath="input[@value='diya123@yahoo.com']")
	WebElement auto_fill_email;
	@FindBy(xpath="input[@id='passwd']")
	WebElement password;
	@FindBy(xpath="select[@id='days']")
	WebElement days;
	@FindBy(xpath="select[@id='months']")
	WebElement month;
	@FindBy(xpath="select[@id='uniform-years']")
	WebElement years;
	@FindBy(xpath="div[@id='uniform-optin']")
	WebElement specail_offer;
	@FindBy(xpath="div[@id='uniform-newsletter")
	WebElement news_letter;
	@FindBy(xpath="input[@id='firstname']")
	WebElement autofill_fistname;
	@FindBy(xpath="@input=@id='lastname']")
	WebElement autofill_lastname;
	@FindBy(xpath="input[@id='company']")
	WebElement company;
	@FindBy(xpath="input[@id='address1']")
	WebElement address1;
	@FindBy(xpath="input[@id='address2']")
	WebElement address2;
	@FindBy(xpath="input[@id='city']")
			WebElement city;
	@FindBy(xpath="select[@id='id_state']")
	WebElement state;
	@FindBy(xpath="input[@id='postcode']")
	WebElement pincode;
	@FindBy (xpath="select[@id='id_country']")
	WebElement country;
	@FindBy(xpath="textarea[@id='other']")
	WebElement additionalinfo;
	@FindBy(xpath="input[@id='phone']")
	WebElement phone;
	@FindBy(xpath="input[@id='phone_mobile']")
	WebElement mobile_phone;
	@FindBy(xpath="input[@id='alias']")
	WebElement alias;
	@FindBy (xpath="button[@id='submitAccount']")
	WebElement ragister;
	@FindBy (xpath="h1[@id='page-heading']")
	WebElement myaccount_lable;
	public WebElement signin() 
	{
		return sign;
	}
	// create email page
	public void signin_negative()
	{
		sign.click();
		create_email.click();
		Alert al = driver.switchTo().alert();
		al.getText();
		al.dismiss();
		
	}
	
	// redirect to sign in page and register user
	
	public void signin_positive(String email, String title, String firstname, 
	String lastname,String pawword, String days, String month, String year, String company,
	String checkbox, String address1, String address2, String city, String pincode, String state,
	String  country, String additionalinfo, String phone_number, String mobile_number,String alias )
	{
		
		
		
		
	}
	
	
	
	
	

}

