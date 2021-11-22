package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By menu=By.id("button-menu");
	By catalog=By.xpath("//span[text()='Catalog']");
	By categories=By.xpath("//*[@class='collapse in']/li[1]");
	By products=By.xpath("//*[@class='collapse in']/li[2]");
	By recurringProfiles=By.xpath("//*[@class='collapse in']/li[3]");
	By filter=By.xpath("//*[@class='collapse in']/li[4]");
	By attributes=By.xpath("//*[@class='collapse in']/li[5]");
	By options=By.xpath("//*[@class='collapse in']/li[6]");
	By manufacturers=By.xpath("//*[@class='collapse in']/li[7]");
	By downloads=By.xpath("//*[@class='collapse in']/li[8]");
	By reviews=By.xpath("//*[@class='collapse in']/li[9]");
	By information=By.xpath("//*[@class='collapse in']/li[10]");
	
	//defining the constructor
	public HomeCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getMenu()
	{
		return driver.findElement(menu);
	}
	public WebElement getCatalog()
	{
		return driver.findElement(catalog);
	}
	public WebElement getCategories()
	{
		return driver.findElement(categories);
	}
	public WebElement getProducts()
	{
		return driver.findElement(products);
	}
	public WebElement getRecurringProfiles()
	{
		return driver.findElement(recurringProfiles);
	}
	public WebElement getFilter()
	{
		return driver.findElement(filter);
	}
	public WebElement getAttributes()
	{
		return driver.findElement(attributes);
	}
	public WebElement getOptions()
	{
		return driver.findElement(options);
	}
	public WebElement getManufacturers()
	{
		return driver.findElement(manufacturers);
	}
	public WebElement getDownloads()
	{
		return driver.findElement(downloads);
	}
	public WebElement getReviews()
	{
		return driver.findElement(reviews);
	}
	public WebElement getInformation()
	{
		return driver.findElement(information);
	}
}