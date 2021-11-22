package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RecurringProfilesCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By name=By.xpath("//*[@name='recurring_description[1][name]']");
	By success=By.xpath("//*[text()=' Success: You have modified recurring profiles!      ']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By errorMsg=By.xpath("//div[@class='text-danger']");
	By copyIcon=By.xpath("//*[@data-original-title='Copy']");
	By page=By.xpath("//*[@class='col-sm-6 text-right']");
	By editName=By.xpath("//input[@placeholder='Name']");
	
	//defining the constructor
	public RecurringProfilesCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getSuccess()
	{
		return driver.findElement(success);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getErrorMsg()
	{
		return driver.findElement(errorMsg);
	}
	public WebElement getCopyIcon()
	{
		return driver.findElement(copyIcon);
	}
	public WebElement getPage()
	{
		return driver.findElement(page);
	}
	public WebElement getEditName()
	{
		return driver.findElement(editName);
	}
}