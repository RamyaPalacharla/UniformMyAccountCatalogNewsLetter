package resources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	//declaring driver variable
	public WebDriver driver;
	//defining initializeDriver method to return chrome driver
	public WebDriver initializeDriver() throws IOException
	{
		//setting the path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PARAMYA\\\\Downloads\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe"); 
		//creating the object of ChromeDriver
		driver= new ChromeDriver();
		//implicit wait for searching any element on the page 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//returning the driver object
		return driver;
	}
}
