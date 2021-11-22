package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordChange 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By Password=By.xpath("//*[@id='input-password']");
	By PasswordConfirm=By.id("input-confirm");
	By Continue=By.xpath("//*[@type='submit']");
	By Back=By.xpath("//*[@class='btn btn-default']");
	By SizeMsg=By.xpath("//*[text()='Password must be between 4 and 20 characters!']");
	By MatchMsg=By.xpath("//*[text()='Password confirmation does not match password!']");
	By Msg=By.xpath("//*[text()=' Success: Your password has been successfully updated.']");

	//defining the constructor
	public PasswordChange(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getPasswordConfirm()
	{
		return driver.findElement(PasswordConfirm);
	}
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	public WebElement getBack()
	{
		return driver.findElement(Back);
	}
	public WebElement getSizeMsg()
	{
		return driver.findElement(SizeMsg);
	}
	public WebElement getMatchMsg()
	{
		return driver.findElement(MatchMsg);
	}
	public WebElement getMsg()
	{
		return driver.findElement(Msg);
	}
}
