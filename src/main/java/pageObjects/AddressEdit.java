package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressEdit 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	
	By NewAddress=By.xpath("//a[text()='New Address']");
	By Back=By.xpath("//a[text()='Back']");
	By DefaultAddress=By.xpath("//a[@href='http://uniformm1.upskills.in/index.php?route=account/address/delete&address_id=1417']");
	By NormalAddress=By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[2]/a[2]");
	By FirstName=By.id("input-firstname");
	By LastName=By.id("input-lastname");
	By Address=By.id("input-address-1");
	By City=By.id("input-city");
	By PostCode=By.id("input-postcode");
	By Country=By.id("input-country");
	By State=By.id("input-zone");
	By Continue=By.xpath("//input[@type='submit']");
	By DefaultNo=By.xpath("//input[@value='0']");
	By DefaultYes=By.xpath("//input[@value='1']");
	By SuccessMsg=By.xpath("//div[text()=' Your address has been successfully inserted']");
	By DefaultDelMsg=By.xpath("//div[text()=' Warning: You can not delete your default address!']");
	By NormalDelMsg=By.xpath("//div[text()=' Your address has been successfully deleted']");
	
	//defining the constructor 
	public AddressEdit(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	//methods to return the location of Web Elements
	public WebElement getNewAddress()
	{
		return driver.findElement(NewAddress);
	}
	public WebElement getBack()
	{
		return driver.findElement(Back);
	}
	public WebElement getDefaultAddress()
	{
		return driver.findElement(DefaultAddress);
	}
	public WebElement getNormalAddress()
	{
		return driver.findElement(NormalAddress);
	}
	public WebElement getFirstName()
	{
		return driver.findElement(FirstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement getAddress()
	{
		return driver.findElement(Address);
	}
	public WebElement getCity()
	{
		return driver.findElement(City);
	}
	public WebElement getPostCode()
	{
		return driver.findElement(PostCode);
	}
	public WebElement getCountry()
	{
		return driver.findElement(Country);
	}
	public WebElement getState()
	{
		return driver.findElement(State);
	}
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	public WebElement getDefaultNo()
	{
		return driver.findElement(DefaultNo);
	}
	public WebElement getDefaultYes()
	{
		return driver.findElement(DefaultYes);
	}
	public WebElement getSuccessMsg()
	{
		return driver.findElement(SuccessMsg);
	}
	public WebElement getDefaultDelMsg()
	{
		return driver.findElement(DefaultDelMsg);
	}
	public WebElement getNormalDelMsg()
	{
		return driver.findElement(NormalDelMsg);
	}
}
	
