package Pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	@FindBy(xpath="//img[@class='img-responsive']" )
	WebElement titleimage;
	@FindBy(xpath="//span[@class='shop-phone']")
	WebElement callusnow;
	@FindBy(xpath="//div[@id='contact-link']")
	WebElement contactus;
	@FindBy(xpath="//div[@class='header_user_info']")
	WebElement signin;
	/*@FindBy(xpath="a[contains(@value,'View my customer account']")
	WebElement loggedin_user;
	@FindBy(xpath="a[contains(@title,'Log me out')]")
	WebElement signout;*/
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement logo;
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement search;
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement submitsearch;
	@FindBy(xpath="//div[@class='shopping_cart']")
	WebElement cart;
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")
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
	
	public void searchfield(String search_data)
	{
		search.sendKeys(search_data);
		submitsearch.click();
		
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
	  
	  Assert.assertEquals(number,"Call us now: 0123-456-789");
	  Reporter.log("number is" +number);
	}

   public void verifycontactus() 
   {
	   boolean display =contactus.isDisplayed();
	   Assert.assertEquals(display, true);
	   Reporter.log("contact us button display");
	   /*Assert.assertEquals(display, false);
	   Reporter.log("contact us button does not display");*/
	
	
}
   
   public void verifysignin()
   {
	   boolean display =signin.isDisplayed();
	   Assert.assertEquals(display, true);
	   Reporter.log("sign button display");
	   /*if(display==false)
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
	   }*/
	  
   }
   public void verifylogo() 
   {
	   boolean logo_display = logo.isDisplayed();
	   Assert.assertEquals(logo_display, true);
	   Reporter.log("logo displays");
	   //Assert.assertEquals(logo_display, false);
	   //Reporter.log("logo does not display");
	   String logo_name = logo.getText();
	  Reporter.log("logo name is"+logo_name);
   }
   
   public void verifymenubar() 
   {
	   List<WebElement> menulist = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']"));
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
	
	@FindBy(xpath="//div[@id='newsletter_block_left']")
	WebElement newsletter;
    @FindBy(xpath="//section[@id='block_contact_infos']")
    WebElement siteinfo;
	@FindBy(xpath="//input[@id='newsletter-input']")
	WebElement newsletter_input;
	@FindBy(xpath="//button[@name='submitNewsletter']")
	WebElement submit_newsletter;
	
	
    public void verifynewsletter()
    {
    	boolean display = newsletter.isDisplayed();
    	Assert.assertEquals(display, true);
    	Reporter.log("newsletter field present in footer");
    	//Assert.assertEquals(display,false);
    	//Reporter.log("newsletter field not present in the footer");
    }
    
    public void newsletterfield(String data)
    {
    	newsletter_input.sendKeys(data);
    	submit_newsletter.click();
    }
    
    public void verifysocailicon()
    {
    	List<WebElement> socialicon = driver.findElements(By.xpath("//section[@id='social_block']"));
    	Iterator<WebElement> i = socialicon.iterator();
    	if(i.hasNext())
{
	String socialicon_name = i.toString();
	Reporter.log(socialicon_name);
}
    	
    }
	public void verifycategories()
	{
		List<WebElement> categorylist = driver.findElements(By.xpath("//section[@class='blockcategories_footer footer-block col-xs-12 col-sm-2']"));
		Iterator<WebElement> i = categorylist.iterator();
		if(i.hasNext())
		{
			String categorylistname = i.toString();
			Reporter.log(categorylistname);
			
		}
	}
	public void verifyinformation()
	{
		List<WebElement> informationlist = driver.findElements(By.xpath("//section[contains(@id,'block_various_links_footer')]"));
		Iterator<WebElement> i = informationlist.iterator();
		if(i.hasNext())
		{
			String infolistname = i.toString();
			Reporter.log(infolistname);
			
		}
	}
	public void verifymyaccount() 
	{
		List<WebElement> myaccountlist = driver.findElements(By.xpath("//section[contains(@class,'footer-block col-xs-12 col-sm-4')]"));
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

// Picture mrque arrow
	
	@FindBy(xpath="//a[@class='bx-next']")
	WebElement arrow;
	
	public WebElement arrow()
	{
		return arrow;
	}
// product add in cart from home page
	
	@FindBy(xpath="//a[@class='bx-next']")
	WebElement popular;
	
	public WebElement popular()
	{
		return popular;
	}
	
	@FindBy(xpath="//a[@class='blockbestsellers']")
	WebElement bestseller;
	
	public WebElement best_seller() 
	{
		return bestseller;
	}
	
	@FindBy(xpath="//ul[@id='homefeatured']")
	WebElement productlist;
	
	public WebElement product() 
	{
	return productlist;	
	}
	public WebElement product_name(String productname)
	{
		WebElement product_name=driver.findElement(By.xpath("//img[@title='"+productname+"']"));
		return product_name;
	}

	public void color_choice(String color)
	{
		if(color.equalsIgnoreCase("White"))
		{
			WebElement white = driver.findElement(By.xpath("//a[@id='color_8']"));
			white.click();
		}
		else
		{
			WebElement black= driver.findElement(By.xpath("//a[@id='color_11']"));
			black.click();
		}
	
	
	}

public void dress_size(String d_size) 
{
	WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
	Select size_option= new Select(size);
	size_option.selectByValue(d_size);
}

public void quantity(String count)
{
	WebElement quantiy = driver.findElement(By.xpath("//input[@id='quantity_wanted']//parent::p"));
	quantiy.sendKeys(Keys.CONTROL,"a");
	quantiy.sendKeys(Keys.BACK_SPACE);
	
	quantiy.sendKeys(count);
	//increase count xpath: //a[@class='btn btn-default button-plus product_quantity_up']
}

public void checkproduct()
{
	WebElement view_product = driver.findElement(By.xpath("//img[@id='bigpic']"));
	view_product.click();
	
	
}

@FindBy (xpath="//*[@id=\"product\"]/div[2]/div/a")
WebElement closeimage;

public WebElement closeviewimage()
{
	return closeimage;
}


@FindBy(className= "exclusive")

WebElement addcart;

public WebElement addcart() 
{
	return addcart;
}



@FindBy (xpath="//a[@herf='http://automationpractice.com/index.php?controller=order']")

WebElement proceedtocheckout;

public WebElement proceedtocheckout()
{
	return proceedtocheckout;
}



}


