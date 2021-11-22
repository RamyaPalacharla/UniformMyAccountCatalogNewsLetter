package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewsLetter 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By newsLetter=By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']");
	By subYes=By.xpath("//input[@type='radio' and @value='1']");
	By subNo=By.xpath("//input[@type='radio' and @value='0']");
	By submit=By.xpath("//*[@value='Continue']");
	By back=By.xpath("//*[text()='Back']");
	By success=By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']");
	
	//defining the constructor
	public NewsLetter(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getNewsLetter() 
	{
		return driver.findElement(newsLetter);
	}
	public WebElement getSubYes() 
	{
		return driver.findElement(subYes);
	}
	public WebElement getSubNo() 
	{
		return driver.findElement(subNo);
	}
	public WebElement getSubmit() 
	{
		return driver.findElement(submit);
	}
	public WebElement getBack() 
	{
		return driver.findElement(back);
	}
	public WebElement getSuccess() 
	{
		return driver.findElement(success);
	}
}