package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UniformStore 
{
	//declaring driver variable
	public WebDriver driver;

	//finding the locators of WebElements and storing in variables
	By MyAccount=By.xpath("//*[@id=\"footer\"]/div[1]/div[3]/ul/li[1]/a");
	By DropDown=By.xpath("//li[@class='dropdown myaccount']");
	By MyAccount2=By.xpath("//*[@id='top-links1']/ul/li[3]/ul/li[1]/a");
	By Edit=By.xpath("//*[text()='Edit your account information']");
	By EditPassword=By.xpath("//a[text()='Change your password']");
	By Address=By.xpath("//*[text()='Modify your address book entries']");
	By WishList=By.xpath("//*[text()='Modify your wish list']");
	
	//defining the constructor
	public UniformStore(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getMyAccount()
	{
		return driver.findElement(MyAccount);
	}
	public WebElement getDropDown()
	{
		return driver.findElement(DropDown);
	}
	public WebElement getMyAccount2()
	{
		return driver.findElement(MyAccount2);
	}
	public WebElement getEdit()
	{
		return driver.findElement(Edit);
	}
	public WebElement getEditPassword()
	{
		return driver.findElement(EditPassword);
	}
	public WebElement getAddress()
	{
		return driver.findElement(Address);
	}
	public WebElement getWishList()
	{
		return driver.findElement(WishList);
	}
}
