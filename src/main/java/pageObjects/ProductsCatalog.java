package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsCatalog
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By name=By.id("input-name");
	By price=By.id("input-price");
	By status=By.id("input-status");
	By model=By.id("input-model");
	By quantity=By.id("input-quantity");
	By filter=By.id("button-filter");
	By noResult=By.xpath("//*[text()='No results!']");
	By productName=By.id("input-name1");
	By metaTitle=By.id("input-meta-title1");
	By save=By.xpath("//*[@data-original-title='Save']");
	By data=By.xpath("//a[text()='Data']");
	By createModel=By.xpath("//*[@name='model']");
	By success=By.xpath("//*[text()=' Success: You have modified products!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	By errProduct=By.xpath("//*[text()='Product Name must be greater than 3 and less than 255 characters!']");
	By errMeta=By.xpath("//*[text()='Meta Title must be greater than 3 and less than 255 characters!']");

	//defining the constructor
	public ProductsCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getPrice()
	{
		return driver.findElement(price);
	}
	public WebElement getStatus()
	{
		return driver.findElement(status);
	}
	public WebElement getModel()
	{
		return driver.findElement(model);
	}
	public WebElement getQuantity()
	{
		return driver.findElement(quantity);
	}
	public WebElement getFilter()
	{
		return driver.findElement(filter);
	}
	public WebElement getNoResult()
	{
		return driver.findElement(noResult);
	}
	public WebElement getProductName() 
	{
		return driver.findElement(productName);
	}
	public WebElement getmetaTitle() 
	{
		return driver.findElement(metaTitle);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getCreateModel()
	{
		return driver.findElement(createModel);
	}
	public WebElement getData()
	{
		return driver.findElement(data);
	}
	public WebElement getSuccess()
	{
		return driver.findElement(success);
	}
	public WebElement getPage()
	{
		return driver.findElement(page);
	}
	public WebElement getErrProduct()
	{
		return driver.findElement(errProduct);
	}
	public WebElement getErrMeta()
	{
		return driver.findElement(errMeta);
	}
}