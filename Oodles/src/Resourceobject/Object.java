package Resourceobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object {
	
	WebDriver driver;
	public Object(WebDriver driver)
	{
		this.driver = driver;
	}
	By username = By.xpath("//*[@id=\"username\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By submit = By.xpath("//*[@id=\"form\"]/button");
	
	public WebElement email()
	{
		return driver.findElement(username);
	}
	public WebElement password ()
	{
		return driver.findElement(password);
		
	}
	
	public  WebElement proceed()
	{
		return driver.findElement(submit);
	}
}
