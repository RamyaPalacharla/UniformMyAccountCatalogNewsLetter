package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FiltersCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By filterGroupName=By.xpath("//*[@name='filter_group_description[1][name]']");
	By filterName=By.xpath("//*[@placeholder='Filter Name']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By errorMsg=By.className("text-danger");
	By addPlus=By.xpath("//a[@onclick='addFilterRow();']");
	By success=By.xpath("//*[text()=' Success: You have modified filters!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
	public FiltersCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getFilterGroupName() 
	{
		return driver.findElement(filterGroupName);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getErrorMsg()
	{
		return driver.findElement(errorMsg);
	}
	public WebElement getAddPlus()
	{
		return driver.findElement(addPlus);
	}
	public WebElement getFilterName() 
	{
		return driver.findElement(filterName);
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