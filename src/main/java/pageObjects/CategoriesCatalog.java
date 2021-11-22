package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CategoriesCatalog 
{
	//declaring driver variable
	public WebDriver driver;
	
	//finding the locators of WebElements and storing in variables
	By heading=By.xpath("//title[text()='Categories']");
	By catName=By.id("input-name1");
	By metaTitle=By.id("input-meta-title1");
	By save=By.xpath("//*[@data-original-title='Save']");
	By success=By.xpath("//*[text()=' Success: You have modified categories!      ']");
	By deleteCheckBox=By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[1]");
	By deleteIcon=By.xpath("//*[@data-original-title='Delete']");
	By page=By.xpath("//div[@class='col-sm-6 text-right']");
	By editCategoryName=By.xpath("//input[@placeholder='Category Name']");
	By editMetaTitle=By.xpath("//input[@placeholder='Meta Tag Title']");
	By errCategory=By.xpath("//*[text()='Category Name must be between 2 and 255 characters!']");
	By errMeta=By.xpath("//*[text()='Meta Title must be greater than 3 and less than 255 characters!']");

	//defining the constructor
	public CategoriesCatalog(WebDriver driver) 
	{
		//assigning driver to driver variable in this class
		this.driver=driver;
	}

	public WebElement getHeading() 
	{
		return driver.findElement(heading);
	}
	public WebElement getCategoryName() 
	{
		return driver.findElement(catName);
	}
	public WebElement getmetaTitle() 
	{
		return driver.findElement(metaTitle);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	public WebElement getSuccess()
	{
		return driver.findElement(success);
	}
	public WebElement getDelCheckBox()
	{
		return driver.findElement(deleteCheckBox);
	}
	public WebElement getDeleteicon()
	{
		return driver.findElement(deleteIcon);
	}
	public WebElement getPage()
	{
		return driver.findElement(page);
	}
	public WebElement getEditCategoryName()
	{
		return driver.findElement(editCategoryName);
	}
	public WebElement getEditMetaTitle()
	{
		return driver.findElement(editMetaTitle);
	}
	public WebElement getErrCategory()
	{
		return driver.findElement(errCategory);
	}
	public WebElement getErrMeta()
	{
		return driver.findElement(errMeta);
	}
}
