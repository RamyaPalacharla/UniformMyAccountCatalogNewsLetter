package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MyAccountInformation 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By FirstName=By.xpath("//*[@name='firstname']");
	By LastName=By.xpath("//*[@name='lastname']");
	By Email=By.xpath("//*[@name='email']");
	By Submit=By.xpath("//*[@type='submit']");
	By Back=By.xpath("//a[text()='Back']");
	By Msg=By.xpath("//div[text()=' Success: Your account has been successfully updated.']");
	By telephone=By.id("input-telephone");
	
	//defining the constructor
	public MyAccountInformation(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getFirstName() 
	{
		return driver.findElement(FirstName);
	}

	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
	public WebElement getBack()
	{
		return driver.findElement(Back);
	}
	public WebElement getMsg()
	{
		return driver.findElement(Msg);
	}
	public WebElement getTelephone()
	{
		return driver.findElement(telephone);
	}
}
