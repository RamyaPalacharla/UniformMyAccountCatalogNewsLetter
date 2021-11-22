package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMyAccount 
{
	//declaring driver variable
	public WebDriver driver;
	
	//locating the elements and storing in variables
	By Email=By.xpath("//*[@name='email']");
	By Password=By.xpath("//*[@name='password']");
	By Submit=By.xpath("//*[@type='submit']");

	//defining the constructor
	public LoginMyAccount(WebDriver driver)
	{
		//assigning driver to driver variable in this class	
		this.driver=driver;
	}
	
	//methods to return the locators
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
}
