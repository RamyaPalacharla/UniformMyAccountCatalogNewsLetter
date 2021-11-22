package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AttributesCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By attributes=By.xpath("//ul[@class='collapse in']/li[5]/ul/li[1]");
	By attributeGroups=By.xpath("//ul[@class='collapse in']/li[5]/ul/li[2]");
	By attName=By.xpath("//*[@name='attribute_description[1][name]']");
	By attGrpName=By.xpath("//*[@placeholder='Attribute Group Name']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By attErrMsg=By.className("text-danger");
	By attGrpErrMsg=By.className("text-danger");
	By success=By.xpath("//*[text()=' Success: You have modified attributes!      ']");
	By successGrp=By.xpath("//*[text()=' Success: You have modified attribute groups!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
	public AttributesCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getAttributes()
	{
		return driver.findElement(attributes);
	}
	public WebElement getAttributeGroups()
	{
		return driver.findElement(attributeGroups);
	}
	public WebElement getAttName()
	{
		return driver.findElement(attName);
	}
	public WebElement getAttGrpName()
	{
		return driver.findElement(attGrpName);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getAttErrMsg()
	{
		return driver.findElement(attErrMsg);
	}
	public WebElement getAttGrpErrMsg()
	{
		return driver.findElement(attGrpErrMsg);
	}
	public WebElement getSuccess()
	{
		return driver.findElement(success);
	}
	public WebElement getSuccessGrp()
	{
		return driver.findElement(successGrp);
	}
	public WebElement getPage()
	{
		return driver.findElement(page);
	}
}