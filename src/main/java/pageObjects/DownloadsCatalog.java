package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadsCatalog
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By downloadName=By.xpath("//*[@placeholder='Download Name']");
	By save=By.xpath("//*[@data-original-title='Save']");
	By fileNameErr=By.xpath("//*[text()='File does not exist!']");
	By maskErr=By.xpath("//*[text()='Mask must be between 3 and 128 characters!']");
	By back=By.xpath("//a[@data-original-title='Cancel']");
	By success=By.xpath("//*[text()=' Success: You have modified downloads!      ']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	
	////defining the constructor
	public DownloadsCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}
	
	public WebElement getDownloadName()
	{
		return driver.findElement(downloadName);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getFileNameErr()
	{
		return driver.findElement(fileNameErr);
	}
	public WebElement getMaskErr()
	{
		return driver.findElement(maskErr);
	}
	public WebElement getBack()
	{
		return driver.findElement(back);
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