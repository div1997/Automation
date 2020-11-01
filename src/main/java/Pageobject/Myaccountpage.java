package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage 

{
	
 public WebDriver driver;
 
 public Myaccountpage(WebDriver driver)
 {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
 }
 

	@FindBy(xpath="//button[@id='submit_search']")
	WebElement search;
	@FindBy(xpath="//a[@vales='View my shopping cart']")
	WebElement cart;
	@FindBy (xpath="//a[contains(@title,'Women')]")
	WebElement womentab;
	@FindBy(xpath="//a[contains(@title,'Dresses')]")
	WebElement dressestab;
	@FindBy(xpath="//a[contains(@title,'T-shirts')]")
	WebElement tshirtstab;
	@FindBy(xpath="//a[contains(@title, 'Orders')]")
	WebElement order_history;
	@FindBy(xpath="//a[@title='Credit slips']")
	WebElement mycreditslip;
	@FindBy (xpath="//a[@title='Addresses']")
	WebElement myaddress;
	@FindBy(xpath="//a[@title='Information']")
	WebElement mypersonalinfo;
	@FindBy (xpath="//a[@title='My wishlists']")
	WebElement mywishlist;
	
	
	public void verifymyaccountpage()
	{
		
	}
	
	
	
 
 
	
}
