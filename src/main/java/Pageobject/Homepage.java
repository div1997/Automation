package Pageobject;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Homepage 
{
	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	
	// Verifying header element
	@FindBy(className="[class='img-responsive']" )
	WebElement titleimage;
	@FindBy(xpath="*[@id='header']/div[2]/div/div/nav/span")
	WebElement callusnow;
	@FindBy(xpath="a[contains(@title,'Contact Us')]")
	WebElement contactus;
	@FindBy(xpath="a[text='signin']")
	WebElement signin;
	@FindBy(xpath="a[contains(@value,'View my customer account']")
	WebElement loggedin_user;
	@FindBy(xpath="a[contains(@title,'Log me out')]")
	WebElement signout;
	@FindBy(xpath="img[contains(@class,'logo')]")
	WebElement logo;
	@FindBy(xpath="button[@id='submit_search']")
	WebElement search;
	@FindBy(xpath="a[@vales='View my shopping cart']")
	WebElement cart;
	@FindBy(xpath="ul[contains(@class,'sf-menu clearfix menu-content sf-js-enabled sf-arrows']")
	WebElement Menubar;
	public void verifytitleimage() 
	{
		boolean display= titleimage.isDisplayed();
		if(display==true)
		{
			Reporter.log("title image display successfully");
		}
		else
		{
			Reporter.log("title image does not display successfully" );
		}
		
	}
	public void verifyshopnumber() 
	{
		boolean display = callusnow.isDisplayed();
	if(display==true)
	{
		Reporter.log("shop number displays");
	}
	else
	{
		Reporter.log("shop number does not display successfully");
	}
	  String number = callusnow.getText();
	  
	  Assert.assertEquals(number,"0123-456-789");
	  Reporter.log("number is" +number);
	}

   public void verifycontactus() 
   {
	   boolean display =contactus.isDisplayed();
	   Assert.assertEquals(display, true);
	   Reporter.log("contact us button display");
	   Assert.assertEquals(display, false);
	   Reporter.log("contact us button does not display");
	
	
}
   
   public void verifysignin()
   {
	   boolean display =signin.isDisplayed();
	   Assert.assertEquals(display, true);
	   Reporter.log("sign button display");
	   if(display==false)
	   {
		   boolean displayusername = loggedin_user.isDisplayed();
		   String name = loggedin_user.getText();
		   Assert.assertEquals(displayusername, true);
		   Reporter.log("username is"+name);
		   boolean signout_button  = signout.isDisplayed();
		   Assert.assertEquals(signout_button, true);
		   Reporter.log("sign out button display");
		   Assert.assertEquals(signout_button, false);
		   Reporter.log("sign out button does not display");
	   }
	  
   }
   public void verifylogo() 
   {
	   boolean logo_display = logo.isDisplayed();
	   Assert.assertEquals(logo_display, true);
	   Reporter.log("logo displays");
	   Assert.assertEquals(logo_display, false);
	   Reporter.log("logo does not display");
	   String logo_name = logo.getText();
	  Reporter.log("logo name is"+logo_name);
   }
   
   public void verifymenubar() 
   {
	   List<WebElement> menulist = driver.findElements(By.xpath("ul[contains(@class,'sf-menu clearfix menu-content sf-js-enabled sf-arrows']"));
    int menulistcount = menulist.size();
    System.out.println(menulistcount);
    Iterator<WebElement> i = menulist.iterator();
    if(i.hasNext())
    {
    	String menu_name = i.toString();
    	Reporter.log(menu_name);
    }
   }
	//Verifying footer element
	
	@FindBy(xpath="input[@id='newsletter-input']")
	WebElement newsletter;
    @FindBy(xpath="section[@id='block_contact_infos']")
    WebElement siteinfo;
	
    public void verifynewsletter()
    {
    	boolean display = newsletter.isDisplayed();
    	Assert.assertEquals(display, true);
    	Reporter.log("newsletter field present in footer");
    	Assert.assertEquals(display,false);
    	Reporter.log("newsletter field not present in the footer");
    }
    
    public void verifysocailicon()
    {
    	List<WebElement> socialicon = driver.findElements(By.xpath("section[@id='social_block']"));
    	Iterator<WebElement> i = socialicon.iterator();
    	if(i.hasNext())
{
	String socialicon_name = i.toString();
	Reporter.log(socialicon_name);
}
    	
    }
	public void verifycategories()
	{
		List<WebElement> categorylist = driver.findElements(By.xpath("section[contains(@class,'blockcategories_footer footer-block col-xs-12 col-sm-2')]"));
		Iterator<WebElement> i = categorylist.iterator();
		if(i.hasNext())
		{
			String categorylistname = i.toString();
			Reporter.log(categorylistname);
			
		}
	}
	public void verifyinformation()
	{
		List<WebElement> informationlist = driver.findElements(By.xpath("section[contains(@id,'block_various_links_footer')]"));
		Iterator<WebElement> i = informationlist.iterator();
		if(i.hasNext())
		{
			String infolistname = i.toString();
			Reporter.log(infolistname);
			
		}
	}
	public void verifymyaccount() 
	{
		List<WebElement> myaccountlist = driver.findElements(By.xpath("section[contains(@class,'footer-block col-xs-12 col-sm-4')]"));
		Iterator<WebElement> i =  myaccountlist.iterator();
		if (i.hasNext())
		{
			String myaccountlistname = i.toString();
			Reporter.log(myaccountlistname);
		}
	}
	public void verifysiteinfo() 
	{
		String site_info = siteinfo.getText();
		Reporter.log(site_info);
	}
}
