package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishList 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By WishList=By.xpath("//*[@class='table-responsive']");
	By Remove=By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[6]/a");
	By Cart=By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[6]/button");
	By RemoveMsg=By.xpath("//*[text()=' Success: You have modified your wish list!    ']");
	By CartMsg=By.xpath("//*[text()=' Success: You have added ']");
	By Continue=By.xpath("//*[text()='Continue']");
	
	//defining the constructor
	public MyWishList(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getWishList()
	{
		return driver.findElement(WishList);
	}
	public WebElement getRemove()
	{
		return driver.findElement(Remove);
	}
	public WebElement getCart()
	{
		return driver.findElement(Cart);
	}
	public WebElement getRemoveMsg()
	{
		return driver.findElement(RemoveMsg);
	}
	public WebElement getCartMsg()
	{
		return driver.findElement(CartMsg);
	}
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	
}
