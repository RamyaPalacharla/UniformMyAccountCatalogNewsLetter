package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InformationCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By heading=By.xpath("//title[text()='Categories']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By infoTitle=By.id("input-title1");
	By desc=By.xpath("//*[@class='note-editable panel-body']");
	By metaTitle=By.id("input-meta-title1");
	By errInfo=By.xpath("//*[text()='Information Title must be between 3 and 64 characters!']");
	By errDesc=By.xpath("//*[text()='Description must be more than 3 characters!']");
	By errMeta=By.xpath("//*[text()='Meta Title must be greater than 3 and less than 255 characters!']");
	By success=By.xpath("//*[text()=' Success: You have modified information!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
	public InformationCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getInfoTitle()
	{
		return driver.findElement(infoTitle);
	}
	public WebElement getDesc()
	{
		return driver.findElement(desc);
	}
	public WebElement getMetaTitle()
	{
		return driver.findElement(metaTitle);
	}
	public WebElement getErrInfo()
	{
		return driver.findElement(errInfo);
	}
	public WebElement getErrDesc()
	{
		return driver.findElement(errDesc);
	}
	public WebElement getErrMeta()
	{
		return driver.findElement(errMeta);
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