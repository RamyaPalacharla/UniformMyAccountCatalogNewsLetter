package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OptionsCatalog
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By optionName=By.xpath("//*[@placeholder='Option Name']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By errMsg=By.xpath("//*[text()=' Warning: Option Values required!      ']");
	By addPlus=By.xpath("//*[@data-original-title='Add Option Value']");
	By optionValue=By.xpath("//*[@placeholder='Option Value Name']");
	By success=By.xpath("//*[text()=' Success: You have modified options!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
	public OptionsCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getOptionName() 
	{
		return driver.findElement(optionName);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getErrMsg()
	{
		return driver.findElement(errMsg);
	}
	public WebElement getAddPlus()
	{
		return driver.findElement(addPlus);
	}
	public WebElement getOptionValue() 
	{
		return driver.findElement(optionValue);
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