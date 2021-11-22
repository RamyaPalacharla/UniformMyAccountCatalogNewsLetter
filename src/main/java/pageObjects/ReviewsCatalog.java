
package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReviewsCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By proName=By.id("input-product");
	By status=By.id("input-status");
	By author=By.id("input-author");
	By calender=By.xpath("//i[@class='fa fa-calendar']");
	By date=By.xpath("//td[text()='16']");
	By filter=By.id("button-filter");
	By authorName=By.id("input-author");
	By product=By.id("input-product");
	By text=By.id("input-text");
	By rating=By.xpath("//*[@id='form-review']/div[4]/div/label[5]");
	By save=By.xpath("//*[@data-original-title='Save']");
	By errProduct=By.xpath("//*[text()='Product required!']");
	By errText=By.xpath("//*[text()='Review Text must be at least 1 character!']");
	By errRating=By.xpath("//*[text()='Review rating required!']");
	By success=By.xpath("//*[text()=' Success: You have modified reviews!      ']");
	By errAuthor=By.xpath("//*[text()='Product required!']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	//defining the constructor
    public ReviewsCatalog(WebDriver driver) 
	{
    	//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getProName() 
	{
		return driver.findElement(proName);
	}
	public WebElement getStatus() 
	{
		return driver.findElement(status);
	}
	public WebElement getAuthor() 
	{
		return driver.findElement(author);
	}
	public WebElement getCalender() 
	{
		return driver.findElement(calender);
	}
	public WebElement getDate() 
	{
		return driver.findElement(date);
	}
	public WebElement getFilter() 
	{
		return driver.findElement(filter);
	}
	public WebElement getAuthorName() 
	{
		return driver.findElement(authorName);
	}
	public WebElement getProduct() 
	{
		return driver.findElement(product);
	}
	public WebElement getText() 
	{
		return driver.findElement(text);
	}
	public WebElement getRating() 
	{
		return driver.findElement(rating);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getErrProduct() 
	{
		return driver.findElement(errProduct);
	}
	public WebElement getErrText() 
	{
		return driver.findElement(errText);
	}
	public WebElement getErrAuthor() 
	{
		return driver.findElement(errAuthor);
	}
	public WebElement getErrRating() 
	{
		return driver.findElement(errRating);
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