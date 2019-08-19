package Resourceobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResourcingModule {
	
	WebDriver driver;
	

	 public ResourcingModule (WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	 By resourcepage = By.xpath("//a[@href='#resourcing/demand']"); 
	 
    public WebElement openPage()
    {
    	return driver.findElement(resourcepage);
    }
}
