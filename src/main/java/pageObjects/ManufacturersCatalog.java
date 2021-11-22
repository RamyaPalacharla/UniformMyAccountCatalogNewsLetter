package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ManufacturersCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By save=By.xpath("//*[@data-original-title='Save']");
	By errMsg=By.xpath("//*[text()='Manufacturer Name must be between 2 and 64 characters!']");
	By manName=By.id("input-name");
	By success=By.xpath("//*[text()=' Success: You have modified manufacturers!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
	public ManufacturersCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getErrMsg()
	{
		return driver.findElement(errMsg);
	}
	public WebElement getManName()
	{
		return driver.findElement(manName);
	}
	public WebElement getSuccess()
	{
		return driver.findElement(success);
	}
	public WebElement getPage()
	{
		return driver.findElement(page);
	}
}