package stepDefinitions;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.AddressEdit;
import pageObjects.AttributesCatalog;
import pageObjects.CategoriesCatalog;
import pageObjects.DownloadsCatalog;
import pageObjects.FiltersCatalog;
import pageObjects.HomeCatalog;
import pageObjects.InformationCatalog;
import pageObjects.LoginMyAccount;
import pageObjects.LoginCatalog;
import pageObjects.ManufacturersCatalog;
import pageObjects.MyAccountInformation;
import pageObjects.MyWishList;
import pageObjects.NewsLetter;
import pageObjects.OptionsCatalog;
import pageObjects.PasswordChange;
import pageObjects.ProductsCatalog;
import pageObjects.RecurringProfilesCatalog;
import pageObjects.ReviewsCatalog;
import pageObjects.UniformStore;
import resources.Base;

public class StepDefinitions extends Base
{
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////    My Account       ////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("Login with user credentials")
	public void login_with_user_credentials() throws IOException, InterruptedException 
	{
		//initializing the browser
		driver =initializeDriver();
		
		//getting "http://uniformm1.upskills.in/"
		String arg1="http://uniformm1.upskills.in/";
		driver.get(arg1);
		
		//clicking my account drop down and then click on login
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//creating object for Login class
		LoginMyAccount l=new LoginMyAccount(driver);
		
		//sending valid mail and password 
		l.getEmail().sendKeys("palacharlaramya000@gmail.com");
		l.getPassword().sendKeys("Ramya@557");
		
		//clicking on submit
		l.getSubmit().click();
	}

	////////////////////////////My Account///////////////////////
	
	@When("Click on MyAccount in footer")
	public void click_on_my_account_in_footer() 
	{
		//creating object for UniformStore
		UniformStore u=new UniformStore(driver);
		
		//Clicking on MyAccount in footer
		u.getMyAccount().click();
	}
	
	@Then("Navigate to MyAccount page")
	public void navigate_to_my_account_page() 
	{
		//Getting present page title and comparing with expected title My Account
		String s=driver.getTitle();
		Assert.assertEquals("My Account",s);
		//printing a message
		System.out.println("Navigated to My Account Page"); 
	}
	
	@And("Close driver")
	public void close_driver()
	{
		//close driver
		driver.close();
	}

	@When("Click on MyAccount in dropdown")
	public void click_on_myaccount_in_dropdown()
	{
		//creating object for UniformStore
		UniformStore u=new UniformStore(driver);
		//clicking on MyAccount drop down
		u.getDropDown().click();
		//selecting My Account from dropdown
		u.getMyAccount2().click();
	}
	
	///////////////////////////Edit your account information////////////////////////////////

	@When("^Click on Edit your account information$")
	public void click_on_edit_your_account_information() throws Throwable 
	{
		//creating object for UniformStore
		UniformStore u=new UniformStore(driver);
		//clicking on Edit your account information
		u.getEdit().click();
	}
	
	@Then("^Navigate to MY ACCOUNT INFORMATION$")
	public void navigate_to_my_account_information() throws Throwable 
	{
		//Getting present page title and comparing with expected title My Account Information
		String s=driver.getTitle();
		Assert.assertEquals("My Account Information",s);
		//printing a message 
		System.out.println("Navigated to My Account Information"); 
	}

	@When("^Edit details and click on CONTINUE$")
	public void edit_details_and_click_on_continue() throws Throwable 
	{
		//creating object for MyAccountInformation class
		MyAccountInformation m=new MyAccountInformation(driver);
		//clearing the FirstName text field and entering ramya3
		m.getFirstName().clear();
		m.getFirstName().sendKeys("ramya3");
		//clearing the LastName text field and entering palacharla3
		m.getLastName().clear();
		m.getLastName().sendKeys("palacharla3");
		//clicking on continue
		m.getSubmit().click();
	}
	
	@Then("^Get success message$")
	public void get_success_message() throws Throwable 
	{
		//checking if success message is displayed or not 
		MyAccountInformation m=new MyAccountInformation(driver);
		Assert.assertTrue(m.getMsg().isDisplayed());
		//printing the success message
		System.out.println(m.getMsg().getText());
	}

	@When("^Edit details and click on Back$")
	public void edit_details_and_click_on_back() throws Throwable 
	{
		UniformStore u=new UniformStore(driver);
		//clicking on Edit your account information
		u.getEdit().click();
		MyAccountInformation m=new MyAccountInformation(driver);
		//clearing first name and giving ramya4 as input
		m.getFirstName().clear();
		m.getFirstName().sendKeys("ramya4");
		//clearing last name and giving palacharla4 as input
		m.getLastName().clear();
		m.getLastName().sendKeys("palacharla4");
		//clicking on back
		m.getBack().click();
		//again click on Edit your account information
		u.getEdit().click();
	}  
	
	@Then("^Details not updated$")
	public void details_not_updated() throws Throwable 
	{
		MyAccountInformation m=new MyAccountInformation(driver);
		//comparing the first name and last name are same as before
		Assert.assertEquals("ramya3", m.getFirstName().getAttribute("value"));
		Assert.assertEquals("palacharla3", m.getLastName().getAttribute("value"));
		//printing a message
		System.out.println("Details are not updated");
	}
	
	@When("^Giving text for Telephone field and click on continue$")
    public void giving_text_for_telephone_field_and_click_on_continue() throws Throwable 
	{
		MyAccountInformation m=new MyAccountInformation(driver);
		//clearing and giving xyz inside telephone field and click on continue
		m.getTelephone().clear();
		m.getTelephone().sendKeys("xyz");
		//clicking on submit icon
		m.getSubmit().click();
    }
	
	@Then("^Show Error$")
    public void show_error() throws Throwable 
    {
		MyAccountInformation m=new MyAccountInformation(driver);
    	//checking if success message is displayed if displayed printing error messsage
        if(m.getMsg().isDisplayed())
        {
        	System.out.println("!!!!!!!!!!ERROR:ACCEPTING TEXT IN TELEPHONE FIELD!!!!!!!!!!");
        }
    }

	///////////////////////////////////////Change your password///////////////////////////////////////////
	
	@When("^Click on Change your password$")
	public void click_on_change_your_password() throws Throwable 
	{
		//clicking on Change your password
		UniformStore u=new UniformStore(driver);
		u.getEditPassword().click();
	}
	
	@Then("^Navigate to CHANGE PASSWORD$")
	public void navigate_to_change_password() throws Throwable 
	{
		//Getting present page title and comparing with expected title Change Password
		String name=driver.getTitle();
		Assert.assertEquals("Change Password", name);
		//printing a message
		System.out.println("Navigated to Change Password"); 
	}
	
	@When("^Edit password with different input for password and confirm password and click on CONTINUE$")
	public void edit_password_with_different_input_for_password_and_confirm_password_and_click_on_continue() throws Throwable
	{
		//creating object for PasswordChange class
		PasswordChange p=new PasswordChange(driver);
		//sending different input for password and confirm password fields
		p.getPassword().sendKeys("Ramya");
		p.getPasswordConfirm().sendKeys("Ramy");
		//clicking on continue
		p.getContinue().click();
	}
	
	@Then("^Get missmatch message$")
	public void get_missmatch_message() throws Throwable 
	{
		//checking if error message is displayed 
		PasswordChange p=new PasswordChange(driver);
		Assert.assertTrue(p.getMatchMsg().isDisplayed());
		//printing the error message
		System.out.println(p.getMatchMsg().getText());
	}
	
	@When("^Edit password with size lessthan 3 and click on CONTINUE$")
	public void edit_password_with_size_lessthan_3_and_click_on_continue() throws Throwable 
	{
		//clearing the fields and giving the same inputs with size less than 3
		PasswordChange p=new PasswordChange(driver);
		p.getPassword().clear();
		p.getPassword().sendKeys("Ra");
		p.getPasswordConfirm().clear();
		p.getPasswordConfirm().sendKeys("Ra");
		//clicking on continue
		p.getContinue().click();
	}
	
	@Then("^Get Sizemissmatch message$")
	public void get_sizemissmatch_message() throws Throwable 
	{
		PasswordChange p=new PasswordChange(driver);
		//checking if the error message is displayed or not
		Assert.assertTrue(p.getSizeMsg().isDisplayed());
		//printing the error message
		System.out.println(p.getSizeMsg().getText());
	}
	
	@When("^Edit password with same input for password and confirm password and click on CONTINUE$")
	public void edit_password_with_same_input_for_password_and_confirm_password_and_click_on_continue() throws Throwable 
	{
		//creating object for PasswordChange class
		PasswordChange p=new PasswordChange(driver);
		//clearing the fields and giving the valid and same password in the fields
		p.getPassword().clear();
		p.getPassword().sendKeys("Ramya@557");
		p.getPasswordConfirm().clear();
		p.getPasswordConfirm().sendKeys("Ramya@557");
		//click on continue
		p.getContinue().click();
	}
	
	@Then("^Get updated message$")
	public void get_updated_message() throws Throwable 
	{
		//checking the success message is displayed or not
		PasswordChange p=new PasswordChange(driver);
		Assert.assertTrue(p.getMsg().isDisplayed());
		//printing the success message
		System.out.println(p.getMsg().getText());
	}
	
	@When("^Clicking on Change your password and clicking on Back$")
	public void clicking_on_change_your_password_and_clicking_on_back() throws Throwable 
	{
		//clicking on change your password
		UniformStore u=new UniformStore(driver);
		u.getEditPassword().click();
		//printing a message
		System.out.println("Navigated to Change your password");
		//clicking on back 
		PasswordChange p=new PasswordChange(driver);
		p.getBack().click();
	}
	
	//////////////////////////////Modify your address book entries///////////////////////////
	
	@When("^Click on Modify your address book entries$")
    public void click_on_modify_your_address_book_entries() throws Throwable 
	{
		UniformStore u=new UniformStore(driver);
		//clicking on modify your address book entries
		u.getAddress().click();
    }
	@Then("^Navigate to Address book entries$")
    public void navigate_to_address_book_entries() throws Throwable 
	{
		//Getting present page title and comparing with expected title address book
		String name=driver.getTitle();
		Assert.assertEquals("Address Book", name);
		//printing navigated message 
		System.out.println("Navigated to Address Book Entries"); 
    }

    @When("^Clicking on New Address$")
    public void clicking_on_new_address() throws Throwable 
    {
    	//creating object for AddressEdit class
    	AddressEdit a=new AddressEdit(driver);
    	//clicking on new address
    	a.getNewAddress().click();
    }
    
    @And("^Creating a new Addrees by giving valid details and click on continue$")
    public void creating_a_new_addrees_by_giving_valid_details_and_click_on_continue() throws Throwable 
	{
    	//giving input for first name,last name,address,city,post code
		AddressEdit a=new AddressEdit(driver);
    	a.getFirstName().sendKeys("ramya");
    	a.getLastName().sendKeys("palacharla");
    	a.getAddress().sendKeys("4-99");
    	a.getCity().sendKeys("valluru");
    	a.getPostCode().sendKeys("533308");
    	
    	//clicking on country drop down
    	a.getCountry().click();
    	//storing the country web element inside country variable
    	WebElement country = a.getCountry();
    	//creating object for Select class and passing country as parameter to Select constructor
		Select dropdown = new Select(country);  
		//from the drop down selecting the value which is having the text as India
		dropdown.selectByVisibleText("India");
		
		//clicking on state drop down
		a.getState().click();
		//storing the state web element inside state variable
		WebElement state = a.getState();
		//creating object for Select class and passing state as parameter to Select constructor
		Select dropdown1 = new Select(state); 
		//from the drop down selecting the value which is having the text as AndhraPradesh
		dropdown1.selectByVisibleText("Andhra Pradesh");
		
		//clicking on default address "No" radio button 
		a.getDefaultNo().click();
		//checking if radio button "Yes" is not selected
		Assert.assertFalse(a.getDefaultYes().isSelected());
		//click on continue
		a.getContinue().click();
    }
    
	@Then("^Address is created$")
    public void address_is_created() throws Throwable 
	{
		AddressEdit a=new AddressEdit(driver);
		//checking if success message is displayed or not
		Assert.assertTrue(a.getSuccessMsg().isDisplayed());
		//printing success message
		System.out.println(a.getSuccessMsg().getText());
    }
	
	@When("^Deleting Default address$")
    public void deleting_default_address() throws Throwable 
	{
		AddressEdit a=new AddressEdit(driver);
		//clicking delete icon for the default address
		a.getDefaultAddress().click();
    }
	
	@Then("^Display error Message$")
    public void display_error_message() throws Throwable 
	{
    	AddressEdit a=new AddressEdit(driver);
    	//checking if error message is displayed or not
    	Assert.assertTrue(a.getDefaultDelMsg().isDisplayed());
    	//printing the error message
    	System.out.println(a.getDefaultDelMsg().getText());
    }
	
	@When("^Deleting Normal address$")
    public void deleting_normal_address() throws Throwable 
	{
		AddressEdit a=new AddressEdit(driver);
		//clicking delete icon for the normal address
		a.getNormalAddress().click();
    }
	
	@Then("^Delete that address$")
    public void delete_that_address() throws Throwable {
    	AddressEdit a=new AddressEdit(driver);
    	//checking if success message is displayed or not
    	Assert.assertTrue(a.getNormalDelMsg().isDisplayed());
    	//printing the success message
        System.out.println(a.getNormalDelMsg().getText());
    }
    
    @When("^Clicking on Back")
    public void clicking_on_back() throws Throwable
    {
    	//clicking on back icon
    	AddressEdit a=new AddressEdit(driver);
    	a.getBack().click();
    }
    
    ///////////////////////////////Modify your wish list//////////////////////////
    
    @When("^Click on Modify your wishlist$")
    public void click_on_modify_your_wishlist() throws Throwable 
    {
    	UniformStore u=new UniformStore(driver);
    	//clicking on Modify your wish list
		u.getWishList().click();
    }
    
    @Then("^Navigate to Modify your wishlist$")
    public void navigate_to_modify_your_wishlist() throws Throwable 
    {
    	//Getting present page title and comparing with expected title Modify your wish list
        String name=driver.getTitle();
        Assert.assertEquals("My Wish List",name);
        //printing a message
        System.out.println("Navigated to My Wish List");
    }
    
    @When("^Click on into icon$")
    public void click_on_into_icon() throws Throwable 
    {
    	//Storing the list of rows in rows variable
    	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
    	//getting the count of rows and storing in count
    	int count = rows.size();
    	//printing the row count
    	System.out.println("ROW COUNT : "+count);
        MyWishList m=new MyWishList(driver);
        //clicking on into icon for first row
        m.getRemove().click();
    }
    
    @Then("^Delete that product from MyWishList$")
    public void delete_that_product_from_mywishlist() throws Throwable 
    {
    	MyWishList m=new MyWishList(driver);
    	//checking if success message is displayed or not
    	Assert.assertTrue(m.getRemoveMsg().isDisplayed());
    	//Storing the list of rows in rows variable
    	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
    	//getting the count of rows and storing in count
    	int count = rows.size();
    	//printing the row count
    	System.out.println("ROW COUNT : "+count);
    	//printing the success message
    	System.out.println(m.getRemoveMsg().getText());
    }
    
    @When("^Click on Cart icon$")
    public void click_on_cart_icon() throws Throwable 
    {
    	MyWishList m=new MyWishList(driver);
    	//clicking on cart icon in the first row
        m.getCart().click();
    }
    
    @Then("^Product Should be added to cart$")
    public void product_should_be_added_to_cart() throws Throwable 
    {
    	MyWishList m=new MyWishList(driver);
    	//checking if success message is displayed or not
    	Assert.assertTrue(m.getCartMsg().isDisplayed());
    	//printing the success message
    	System.out.println(m.getCartMsg().getText());
    }
    
    @When("^Click on Continue$")
    public void click_on_continue() throws Throwable 
    {
    	MyWishList m=new MyWishList(driver);
    	//clicking on Continue button 
    	m.getContinue().click();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////   Catalog     /////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Given("^Login with admin creditials$")
    public void login_with_admin_creditials() throws Throwable 
    {
    	//opening browser
    	driver =initializeDriver();
    	//navigating to "http://uniformm1.upskills.in/admin/"
		String arg2="http://uniformm1.upskills.in/admin/";
		driver.get(arg2);
		//creating object for LoginCatalog
		LoginCatalog l=new LoginCatalog(driver);
		//sending admin name and password and clicking on submit
		l.getAdmin().sendKeys("admin");
		l.getPassword().sendKeys("admin@123");
		l.getSubmit().click();
    }
    
    @And("^Click on menu button and then Catalog$")
    public void click_on_menu_button_and_then_catalog() throws Throwable 
    {
    	//creating object for HomeCatalog
    	HomeCatalog h=new HomeCatalog(driver);
    	//clicking on menu button and then Catalog
    	h.getMenu().click();
    	h.getCatalog().click();
    }
    
    ////////////////////////////////categories/////////////////////////////////
    
    @When("^Click on Categories$")
    public void click_on_categories() throws Throwable 
    {
    	//clicking on Categories
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getCategories().click();
    }
    
    @Then("^Navigate to Categories page$")
    public void navigate_to_categories_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Categories
    	String s=driver.getTitle();
    	Assert.assertEquals("Categories",s);
    	//checking if pageSource contains Categories if yes printing a message
    	if(driver.getPageSource().contains("Categories"))
    	{
    		System.out.println("Navigated to Categories page");
    	}
    }
    
    @When("^Clicking on plus icon$")
    public void clicking_on_plus_icon() throws Throwable {
    	//printing the page number and no of elements
    	System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText());
    	//clicking on plus icon
    	driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
    }
    
    @And("^Not giving input for required fields for category and clicking on save icon$")
    public void not_giving_input_for_required_fileds_for_category_and_clicking_on_save_icon() throws Throwable 
    {
    	//clicking on save button
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	c.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required category details$")
    public void should_dispaly_error_message_to_fill_required_category_details() throws Throwable 
    {
    	//checking if error message is displayed to fill required fields or not
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	Assert.assertTrue(c.getErrCategory().isDisplayed());
    	Assert.assertTrue(c.getErrMeta().isDisplayed());
    	
    	//printing the error messages
    	System.out.println(c.getErrCategory().isDisplayed());
    	System.out.println(c.getErrMeta().isDisplayed());
    }

    @When("^Giving input for required fields for category and clicking on save icon$")
    public void giving_input_for_required_fields_for_category_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving the input for required fields
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	c.getCategoryName().sendKeys("uniform");
    	c.getmetaTitle().sendKeys("auniform1");
    	
    	//clicking on save icon
    	c.getSave().click();
    }
    
    @Then("^Create that category$")
    public void create_that_category() throws Throwable 
    {
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	//checking if success message is displayed
    	Assert.assertTrue(c.getSuccess().isDisplayed());
    	
    	//printing the success message and printing the page number
    	System.out.println(c.getSuccess().getText());
    	System.out.println(c.getPage().getText());
    }
    
    @When("^Selecting checkboxes$")
    public void selecting_checkboxes() throws Throwable 
    {
    	//printing page number and clicking the first check box
    	System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText());
    	driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[1]")).click();
    }
    
    @And("^Clicking on delete icon$")
    public void clicking_on_delete_icon() throws Throwable 
    {
    	//clicking on delete icon and clicking on ok in alert box
    	driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
    	driver.switchTo().alert().accept();
    }
    
    @Then("^Delete that categories$")
    public void delete_that_categories() throws Throwable 
    {
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	//checking if success message is displayed 
    	Assert.assertTrue(c.getSuccess().isDisplayed());
    	System.out.println(c.getSuccess().getText());
    	//printing the success message
    	System.out.println(c.getPage().getText());
    }
    
    @When("^Clicking on edit icon$")
    public void clicking_on_edit_icon() throws Throwable 
    {
    	//clicking on edit icon of first row
        driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[4]/a")).click();
    }
    
    @And("^Editing category and meta title$")
    public void editing_category_and_meta_title() throws Throwable 
    {
    	//clearing the fields and editing details
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	c.getEditCategoryName().clear();
    	c.getEditCategoryName().sendKeys("dress");
    	c.getEditMetaTitle().clear();
    	c.getEditMetaTitle().sendKeys("outfit");
    	//clicking on save icon
    	c.getSave().click();
    }
    
    @Then("^Category should be edited$")
    public void category_should_be_edited() throws Throwable 
    {
    	//checking if success message is displayed 
    	CategoriesCatalog c =new CategoriesCatalog(driver);
    	Assert.assertTrue(c.getSuccess().isDisplayed());
    	//printing success message
    	System.out.println(c.getSuccess().getText());
    }
    
    ///////////////////////////////////products////////////////////////////////////////
    
    @When("^Click on Products$")
    public void click_on_products() throws Throwable 
    {
    	//clicking on products
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getProducts().click();
    }
    
    @Then("^Navigate to Products page$")
    public void navigate_to_products_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Products
    	String s=driver.getTitle();
    	Assert.assertEquals("Products",s);
    	//checking if page source contains products if yes then and printing a message
    	if(driver.getPageSource().contains("Products"))
    	{
    		System.out.println("Navigated to Products page");
    	}
    }
    
    @And("^Not giving input for required fields for products and clicking on save icon$")
    public void not_giving_input_for_required_fields_for_products_and_clicking_on_save_icon() throws Throwable 
    {
    	//clicking on save
    	ProductsCatalog p =new ProductsCatalog(driver);
    	p.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required products details$")
    public void should_dispaly_error_message_to_fill_required_products_details() throws Throwable 
    {
    	//checking if error message is displayed or nor 
    	ProductsCatalog p =new ProductsCatalog(driver);
    	Assert.assertTrue(p.getErrProduct().isDisplayed());
    	Assert.assertTrue(p.getErrMeta().isDisplayed());
    	//printing the error message
    	System.out.println(p.getErrProduct().getText());
    	System.out.println(p.getErrMeta().getText());
    }

    @When("^Giving input for required fields for products and clicking on save icon$")
    public void giving_input_for_required_fields_for_products_and_clicking_on_save_icon() throws Throwable 
    {
    	//creating object for ProductsCatalog
    	ProductsCatalog p =new ProductsCatalog(driver);
    	//giving input for required fields
    	p.getProductName().sendKeys("White_shirt");
    	p.getmetaTitle().sendKeys("Shirts");
    	//clicking on data and giving input for required fields
    	p.getData().click();
    	p.getModel().sendKeys("half_hands");
    	//clicking on save
    	p.getSave().click();
    }
    
    @Then("^Create that product$")
    public void create_that_product() throws Throwable 
    {
    	ProductsCatalog p =new ProductsCatalog(driver);
    	//checking if success message is displayed or not 
    	Assert.assertTrue(p.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(p.getSuccess().getText());
    	System.out.println(p.getPage().getText());
    }
      
    @Then("^Delete that product$")
    public void delete_that_product() throws Throwable 
    {
    	ProductsCatalog p =new ProductsCatalog(driver);
    	//checking if success message is displayed or not 
    	Assert.assertTrue(p.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(p.getSuccess().getText());
    	System.out.println(p.getPage().getText());
    }
    
    @When("^Clicking on Edit icon$")
    public void clicking_on_Edit_icon() throws Throwable 
    {
    	//clicking on edit icon of first row
    	driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[8]/a")).click();
    }
    
    @And("^Editing Product details$")
    public void editing_product_details() throws Throwable 
    {
    	//clearing the fields and modifying the details 
    	ProductsCatalog p =new ProductsCatalog(driver);
    	p.getProductName().clear();
    	p.getProductName().sendKeys("black_shirt");
    	p.getmetaTitle().clear();
    	p.getmetaTitle().sendKeys("shirts");
    	//clicking on save
    	p.getSave().click();
    }
    
    @Then("^Product details should be edited$")
    public void product_details_should_be_edited() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	ProductsCatalog p =new ProductsCatalog(driver);
    	Assert.assertTrue(p.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(p.getSuccess().getText());
    }
    
    @When("^Giving valid product details$")
    public void giving_valid_product_details() throws Throwable 
    {
    	//giving valid input details
    	ProductsCatalog p=new ProductsCatalog(driver);
    	p.getName().sendKeys("jacket");
    	p.getPrice().sendKeys("0.0000");
    	p.getStatus().click();
    	
    	//storing status dropdown location in status
    	WebElement status=p.getStatus();
    	//creating object for Select class and passing status as argument to constructor
    	Select dropdown=new Select(status);
    	//selecting Enabled from dropown
    	dropdown.selectByVisibleText("Enabled");
    	
    	p.getModel().sendKeys("jack12");
    	p.getQuantity().sendKeys("1");
    }
    
    @And("^Click on filter$")
    public void click_on_filter() throws Throwable 
    {
    	//clicking on filter button
    	ProductsCatalog p=new ProductsCatalog(driver);
    	p.getFilter().click();
    }

    @Then("^Display the products which are having selected details$")
    public void display_the_products_which_are_having_selected_details() throws Throwable 
    {
    	//Checking if list is displayed or not
    	WebElement list=driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']/tbody"));
    	Assert.assertTrue(list.isDisplayed());
    	//printing a message
    	System.out.println("Displayed");
    }
    
    @When("^Giving invalid product details$")
    public void giving_invalid_product_details() throws Throwable 
    {
    	//giving invalid details 
    	ProductsCatalog p=new ProductsCatalog(driver);
    	p.getName().sendKeys("xxxx");
    	p.getPrice().sendKeys("100");
    	p.getStatus().click();
    	//storing status dropdown location in status
    	WebElement status=p.getStatus();
    	//creating object for Select class and passing status as argument to constructor
    	Select dropdown=new Select(status);
    	//selecting enabled from dropdown
    	dropdown.selectByVisibleText("Enabled");
    	p.getModel().sendKeys("jack");
    	p.getQuantity().sendKeys("1");
    }
    
    @Then("^Display No Results$")
    public void display_no_results() throws Throwable 
    {
    	//checking if no results is displayed or not 
    	ProductsCatalog p=new ProductsCatalog(driver);
    	Assert.assertTrue(p.getNoResult().isDisplayed());
    	//printing that message
    	System.out.println(p.getNoResult().getText());
    }
    
    ////////////////////////////////recurring profiles////////////////////////////////////
    
    @When("^Click on Recurring Profiles$")
    public void click_on_recurring_profiles() throws Throwable 
    {
    	//creating object for HomeCatalog and clicking on Recurring Profiles 
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getRecurringProfiles().click();
    }
    
    @Then("^Navigate to Recurring Profiles page$")
    public void navigate_to_recurring_profiles_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Recurring Profiles
    	String s=driver.getTitle();
    	Assert.assertEquals("Recurring Profiles",s);
    	//checking if page source contains Recurring Profiles and printing a message
    	if(driver.getPageSource().contains("Recurring Profiles"))
    	{
    		System.out.println("Navigated to Recurring Profiles page");
    	}
    }
    
    @And("^Not giving input for required fields for recurring profiles and clicking on save icon$")
    public void not_giving_required_fields_for_recurring_profiles__and_clicking_on_save_icon() throws Throwable 
    {
    	//clicking on save 
    	RecurringProfilesCatalog r=new RecurringProfilesCatalog(driver);
    	r.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required Recurring Profile details$")
    public void should_display_error_message_to_fill_required_recurring_profile_details() throws Throwable 
    {
    	//checking if error message is displayed or not 
    	RecurringProfilesCatalog r=new RecurringProfilesCatalog(driver);
    	Assert.assertTrue(r.getErrorMsg().isDisplayed());
    	//printing error message
    	System.out.println(r.getErrorMsg().getText());
    }
    
    @When("^Giving input for required fields for recurring profiles and clicking on save icon$")
    public void giving_input_for_required_fields_for_recurring_profiles_and_clicking_on_icon() throws Throwable 
    {
    	//giving input for required field 
    	RecurringProfilesCatalog r=new RecurringProfilesCatalog(driver);
    	r.getName().sendKeys("profile");
    	//clicking on save icon
    	r.getSave().click();
    }
    
    @Then("^Create that Recurring Profile$")
    public void create_that_recurring_profile() throws Throwable 
    {
    	//checking if error message is displayed or not 
    	RecurringProfilesCatalog r=new RecurringProfilesCatalog(driver);
    	Assert.assertTrue(r.getSuccess().isDisplayed());
    	//printing the message
    	System.out.println(r.getSuccess().getText());
    }
    
    @And("^Clicking on copy icon$")
    public void clicking_on_copy_icon() throws Throwable 
    {
    	//clicking on copy icon
    	RecurringProfilesCatalog r=new RecurringProfilesCatalog(driver);
    	r.getCopyIcon().click();
    }
    
    @Then("^Copy that RecurringProfile$")
    public void copy_that_recurringprofile() throws Throwable 
    {
    	//displaying the page number and count of elements
        System.out.println(driver.findElement(By.xpath("//*[@class='col-sm-6 text-right']")).getText());
    }

    @Then("^Delete that Recurring profile$")
    public void delete_that_recurring_profile() throws Throwable 
    {
    	//checking if success message is displayed or not 
	    RecurringProfilesCatalog p =new RecurringProfilesCatalog(driver);
	    Assert.assertTrue(p.getSuccess().isDisplayed());
	    //printing the success message and page number
		System.out.println(p.getSuccess().getText());
		System.out.println(p.getPage().getText());
    }
    
    @And("^Editing Recurring Profiles details$")
    public void editing_recurring_profiles_details() throws Throwable 
    {
    	//clearing the fields and again giving the inputs
    	RecurringProfilesCatalog p =new RecurringProfilesCatalog(driver);
    	p.getEditName().clear();
    	p.getEditName().sendKeys("xxxx");
    	//clicking on save icon
    	p.getSave().click();
    }
    
    @Then("^Recurring Profiles should be edited$")
    public void recurring_profiles_should_be_edited() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	RecurringProfilesCatalog p =new RecurringProfilesCatalog(driver);
    	Assert.assertTrue(p.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(p.getSuccess().getText());
    }
    
    ////////////////////////////////////filters/////////////////////////////////////
    
    @When("^Click on Filters$")
    public void click_on_filters() throws Throwable 
    {
    	//creating object for HomeCatalog and clicking on Filter
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getFilter().click();
    }
    
    @Then("^Navigate to Filters page$")
    public void navigate_to_filters_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Filters
    	String s=driver.getTitle();
    	Assert.assertEquals("Filters",s);
    	//checking if page source contains Filters and printing a message
    	if(driver.getPageSource().contains("Filters"))
    	{
    		System.out.println("Navigated to Filters page");
    	}
    } 
    
    @And("^Not giving input for required fields for Filter and clicking on save icon$")
    public void not_giving_input_for_requiredfileds_for_filter_and_clicking_on_save_icon() throws Throwable 
    {
    	//clicking on save icon
    	FiltersCatalog f=new FiltersCatalog(driver);
    	f.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required Filter details$")
    public void should_display_warning_message_to_fill_required_filter_details() throws Throwable 
    {
    	//checking if error message is displayed or not 
    	FiltersCatalog f=new FiltersCatalog(driver);
    	Assert.assertTrue(f.getErrorMsg().isDisplayed());
    	//printing the error message
    	System.out.println(f.getErrorMsg().getText());
    }
    
    @When("^Giving input for required fields for Filter and clicking on save$")
    public void giving_input_for_required_fields_and_clicking_on_save() throws Throwable
    {
    	//giving input 
    	FiltersCatalog f=new FiltersCatalog(driver);
    	f.getFilterGroupName().sendKeys("ramya");
    	f.getAddPlus().click();
    	f.getFilterName().sendKeys("ramya11");
    	//clicking on save icon
    	f.getSave().click();
    }

    @Then("^Create Filter$")
    public void create_filter() throws Throwable 
    {
    	//Checking if success message is displayed or not 
    	FiltersCatalog f=new FiltersCatalog(driver);
    	Assert.assertTrue(f.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(f.getSuccess().getText());
    }
    
    @Then("^Delete that Filter$")
    public void delete_that_filter() throws Throwable 
    {
    	//checking if success message is displayed or not
    	FiltersCatalog f=new FiltersCatalog(driver);
    	Assert.assertTrue(f.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(f.getSuccess().getText());
    	System.out.println(f.getPage().getText());
    }
    
    @And("^Editing filter details$")
    public void editing_filter_details() throws Throwable 
    {
    	//clearing the fields and editing them
    	FiltersCatalog f=new FiltersCatalog(driver);
    	f.getFilterGroupName().clear();
    	f.getFilterGroupName().sendKeys("123");
    	f.getFilterName().clear();
    	f.getFilterName().sendKeys("xyz");
    	//clicking on save
    	f.getSave().click();
    }
    
    @Then("^Filter details should be edited$")
    public void filter_details_should_be_edited() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	FiltersCatalog f=new FiltersCatalog(driver);
    	Assert.assertTrue(f.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(f.getSuccess().getText());
    }
    
    ///////////////////////////////////attributes/////////////////////////////////////
    
    @When("^Click on Attributes$")
    public void click_on_attributes() throws Throwable 
    {
    	//creating object for HomeCatalog class
    	HomeCatalog h=new HomeCatalog(driver);
    	//Clicking on Attributes
    	h.getAttributes().click();
    }

    @Then("^Should display drop down$")
    public void should_display_drop_down() throws Throwable 
    {
    	//finding the drop down web element and storing it in list variable
    	WebElement list=driver.findElement(By.xpath("//ul[@id='menu']/li[2]/ul/li[5]/ul"));
    	//checking if drop down is displayed
    	Assert.assertTrue(list.isDisplayed());
    	System.out.println("Drop down is displayed");
    }
    
    @When("^Click on Attributes in Attributes List$")
    public void click_on_attributes_in_attributes_list() throws Throwable 
    {
    	//Clicking on attributes
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttributes().click();
    }

    @Then("^Navigate to Attributes Page$")
    public void navigate_to_attributes_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Attributes
    	String s=driver.getTitle();
    	Assert.assertEquals("Attributes",s);
    	//checking if page source contains Attributes and printing a message
    	if(driver.getPageSource().contains("Attributes"))
    	{
    		System.out.println("Navigated to Attributes page");
    	}
    }
    
    @And("^Not giving attributes details for required fields$")
    public void not_giving_attributes_details_for_required_fields() throws Throwable 
    {
    	//clicking on save icon
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required attribute details$")
    public void should_dispaly_error_message_to_fill_required_attribute_details() throws Throwable 
    {
    	//checking if error message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getAttErrMsg().isDisplayed());
    	//printing the error message
    	System.out.println(a.getAttErrMsg().getText());
    }
    
    @When("^Giving attribute details for requiredfileds and clicking on save icon$")
    public void giving_attribute_details_for_requiredfileds_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving the attribute details
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttName().sendKeys("cccc");
    	//clicking on save icon
    	a.getSave().click();
    }

    @Then("^Create attribute$")
    public void create_attribute() throws Throwable 
    {
    	//Checking if success message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getSuccess().isDisplayed());
    	//printing the success message and page number
    	System.out.println(a.getSuccess().getText());
    	System.out.println(a.getPage().getText());
    }

    @When("^Click on edit icon$")
    public void click_on_edit_icon() throws Throwable 
    {
    	//clicking on edit icon
        driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[5]/a")).click();
    }
    
    @And("^Editing attribute details$")
    public void editing_attribute_details() throws Throwable 
    {
    	//clearing the input fields and sending again
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttName().clear();
    	a.getAttName().sendKeys("pqr");
    	//clicking on save icon
    	a.getSave().click();
    }
    
    @Then("^Attribute details should be edited$")
    public void attribute_details_should_be_edited() throws Throwable
    {
    	//checking if success message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(a.getSuccess().getText());
    }
    
    @When("^Clicking on Attribute Groups$")
    public void clicking_on_attribute_groups() throws Throwable
    {
    	//clicking on Attribute Groups
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttributeGroups().click();
    }

    @Then("^Navigate to Attribute Groups Page$")
    public void navigate_to_attribute_groups_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Attribute Groups
    	String s=driver.getTitle();
    	Assert.assertEquals("Attribute Groups",s);
    	//checking if page source contains Attribute Groups and printing a message
    	if(driver.getPageSource().contains("Attribute Groups"))
    	{
    		System.out.println("Navigated to Attribute Groups page");
    	}
    }
    
    @And("^Not giving attribute group details for required fields and clicking on save icon$")
    public void not_giving_attribute_group_details_for_required_fields_and_clicking_on_save_icon() throws Throwable
    {
    	//Clicking on save icon
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required attribute group details$")
    public void should_dispaly_error_message_to_fill_required_attribute_group_details() throws Throwable 
    {
    	//checking if error message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getAttGrpErrMsg().isDisplayed());
    	//printing the error message
    	System.out.println(a.getAttGrpErrMsg().getText());
    }
    
    @When("^Giving attribute group details for required fields and clicking on save icon$")
    public void giving_attribute_group_details_for_required_fields_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving input for required fields
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttGrpName().sendKeys("zzz");
    	//clicking on save icon
    	a.getSave().click();
    }
    
    @Then("^Create Attribute Group$")
    public void create_attribute_group() throws Throwable 
    {
    	//Checking if success message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getSuccessGrp().isDisplayed());
    	//printing the success message
    	System.out.println(a.getSuccessGrp().getText());
    	System.out.println(a.getPage().getText());
    }
    
    @And("^Editing attribute group details$")
    public void editing_attribute_group_details() throws Throwable 
    {
    	//clearing the fields and sending input again
    	AttributesCatalog a=new AttributesCatalog(driver);
    	a.getAttGrpName().clear();
    	a.getAttGrpName().sendKeys("sizes");
    	//clicking on save icon
    	a.getSave().click();
    }
    
    @Then("^Attribute group details should be edited$")
    public void attribute_group_details_should_be_edited() throws Throwable 
    {
    	//Checking if success message is displayed or not
    	AttributesCatalog a=new AttributesCatalog(driver);
    	Assert.assertTrue(a.getSuccessGrp().isDisplayed());
    	//printing the success message
    	System.out.println(a.getSuccessGrp().getText());
    }
    
    ///////////////////////////options///////////////////////////////
    
    @When("^Click on Options$")
    public void click_on_options() throws Throwable
    {
    	//clicking on Options
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getOptions().click();
    }
    
    @Then("^Navigate to Options Page$")
    public void navigate_to_options_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Options
    	String s=driver.getTitle();
    	Assert.assertEquals("Options",s);
    	//checking if page source contains Options and printing a message
    	if(driver.getPageSource().contains("Options"))
    	{
    		System.out.println("Navigated to Options page");
    	}
    }
    
    @And("^Not giving option details for required fields$")
    public void not_giving_option_details_for_required_fields() throws Throwable 
    {
    	//clicking on save
        OptionsCatalog o=new OptionsCatalog(driver);
        o.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required option details$")
    public void should_dispaly_error_message_to_fill_required_option_details() throws Throwable 
    {
    	//checking if error message is displayed or not
    	OptionsCatalog o=new OptionsCatalog(driver);
    	Assert.assertTrue(o.getErrMsg().isDisplayed());
    	//printing the message
    	System.out.println(o.getErrMsg().getText());
    }
    
    @When("^Giving option details for required fields and clicking on save icon$")
    public void giving_option_details_for_requiredfileds_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving  input for required fields
    	OptionsCatalog o=new OptionsCatalog(driver);
    	o.getOptionName().sendKeys("option");
        o.getAddPlus().click();
        o.getOptionValue().sendKeys("option1");
        //clicking on save icon
        o.getSave().click();
    }

    @Then("^Create option$")
    public void create_option() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	OptionsCatalog o=new OptionsCatalog(driver);
    	Assert.assertTrue(o.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(o.getSuccess().getText());
    	System.out.println(o.getPage().getText());
    }
    
    @Then("^Delete that option$")
    public void delete_that_option() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	OptionsCatalog o=new OptionsCatalog(driver);
    	Assert.assertTrue(o.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(o.getSuccess().getText());
    	System.out.println(o.getPage().getText());
    }
    
    ///////////////////////////manufacturers///////////////////////////////////
    
    @When("^Click on Manufacturers$")
    public void click_on_manufacturers() throws Throwable 
    {
    	//creating object for HomeCatalog
    	HomeCatalog h=new HomeCatalog(driver);
    	//clicking on manufacturers
    	h.getManufacturers().click();
    }

    @Then("^Navigate to Manufacturers Page$")
    public void navigate_to_manufacturers_page() throws Throwable
    {
    	//Getting present page title and comparing it with expected title Manufacturers
        String s=driver.getTitle();
        Assert.assertEquals("Manufacturers",s);
       //checking if page source contains Manufactures and printing a message
        if(driver.getPageSource().contains("Manufacturers"))
        {
        	System.out.println("Navigated to Manufacturers page");
        }
    }
    
    @And("^Not giving manufacturer details for required fields and clicking on save icon$")
    public void not_giving_manufacturer_details_for_required_fields_and_clicking_on_save_icon() throws Throwable 
    {
    	//clicking on save icon
    	ManufacturersCatalog m=new ManufacturersCatalog(driver);
    	m.getSave().click();
    }
    
    @Then("^Should dispaly Error message to fill required manufacturer details$")
    public void should_dispaly_error_message_to_fill_required_manufacturer_details() throws Throwable 
    {
    	//Checking if error message is displayed or not 
    	ManufacturersCatalog m=new ManufacturersCatalog(driver);
    	Assert.assertTrue(m.getErrMsg().isDisplayed());
    	//printing the error message
    	System.out.println(m.getErrMsg().getText());
    }
    
    @When("^Giving manufacturer details for required fileds and clicking on save icon$")
    public void giving_manufacturer_details_for_required_fileds_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving input for required fields
    	ManufacturersCatalog m=new ManufacturersCatalog(driver);
    	m.getManName().sendKeys("ramya");
    	//clicking on save icon
    	m.getSave().click();
    }

    @Then("^Create Manufacturer$")
    public void create_manufacturer() throws Throwable 
    {
    	ManufacturersCatalog m=new ManufacturersCatalog(driver);
    	//checking if success message is displayed and print the message
    	Assert.assertTrue(m.getSuccess().isDisplayed());
    	System.out.println(m.getSuccess().getText());
    	//printing page number
    	System.out.println(m.getPage().getText());
    }
    
    @Then("^Delete that Manufacturer$")
    public void delete_that_manufacturer() throws Throwable 
    {
    	//checking if success message is displayed
    	ManufacturersCatalog m=new ManufacturersCatalog(driver);
    	Assert.assertTrue(m.getSuccess().isDisplayed());
    	//printing the message and page number
    	System.out.println(m.getSuccess().getText());
    	System.out.println(m.getPage().getText());
    }
    
    ///////////////////////////////downloads//////////////////////////////////
    
    @When("^Click on Downloads$")
    public void click_on_downloads() throws Throwable 
    {
    	//clicking on downloads
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getDownloads().click();
    }

    @Then("^Navigate to Downloads Page$")
    public void navigate_to_downloads_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Downloads
    	String s=driver.getTitle();
    	Assert.assertEquals("Downloads",s);
    	//checking if page source contains Downloads and printing a message
    	if(driver.getPageSource().contains("Downloads"))
    	{
    		System.out.println("Navigated to Downloads page");
    	}
    }
    
    @And("^Giving downloads details for required fileds and clicking on save icon$")
    public void giving_downloads_details_for_required_fileds_and_clicking_on_save_icon() throws Throwable 
    {
    	//giving required details
    	DownloadsCatalog d=new DownloadsCatalog(driver);
        d.getDownloadName().sendKeys("download");
        //clicking on save icon
        d.getSave().click();
    }
    
    @Then("^Create download$")
    public void create_download() throws Throwable 
    {
    	DownloadsCatalog d=new DownloadsCatalog(driver);
    	//checking if error message is displayed if yes then printing error message
        if(d.getFileNameErr().isDisplayed() || d.getMaskErr().isDisplayed())
        {
        	System.out.println("!!!!!!!!!!Error: FILE NAME AND MASK ARE NOT MARKED AS MANDATORY!!!!!!!!!!");
        	//clicking on back icon
        	d.getBack().click();
        }
        else
        {
        	System.out.println("download created");
        }
    }
    
    @Then("^Delete that Download$")
    public void delete_that_download() throws Throwable 
    {
    	//checking if success message is displayed or not
    	DownloadsCatalog d=new DownloadsCatalog(driver);
    	Assert.assertTrue(d.getSuccess().isDisplayed());
    	//printing success message
    	System.out.println(d.getSuccess().getText());
    	System.out.println(d.getPage().getText());
    }
    
    @And("^Editing Downloads details$")
    public void editing_downloads_details() throws Throwable 
    {
    	//clearing the input fields and editing
    	DownloadsCatalog d=new DownloadsCatalog(driver);
    	d.getDownloadName().clear();
    	d.getDownloadName().sendKeys("download1");
    	//clicking on save icon
    	d.getSave().click();
    }
    
    @Then("^Download details should be edited$")
    public void download_details_should_be_edited() throws Throwable 
    {
    	//checking if success message is displayed or not
    	DownloadsCatalog d=new DownloadsCatalog(driver);
    	Assert.assertTrue(d.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(d.getSuccess().getText());
    }

    //////////////////////////////////reviews/////////////////////////////
    
    @When("^Click on Reviews$")
    public void click_on_reviews() throws Throwable 
    {
    	//clicking on Reviews
    	HomeCatalog h=new HomeCatalog(driver);
    	h.getReviews().click();
    }
    
    @Then("^Navigate to Reviews Page$")
    public void navigate_to_reviews_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title reviews
    	String s=driver.getTitle();
    	Assert.assertEquals("Reviews",s);
    	//checking if page source contains Reviews and printing a message
    	if(driver.getPageSource().contains("Reviews"))
    	{
    		System.out.println("Navigated to Reviews page");
    	}
    }
    
    @And("^Not giving review details for required fields$")
    public void not_giving_review_details_for_required_fields() throws Throwable 
    {
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	//clicking on save icon
    	r.getSave().click();
    }

    @Then("^Should dispaly Error message to fill required review details$")
    public void should_dispaly_error_message_to_fill_required_review_details() throws Throwable
    {
    	//creating object for ReviewsCatalog class
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	//checking if error messages are displayed or not
    	Assert.assertTrue(r.getErrAuthor().isDisplayed());
    	Assert.assertTrue(r.getErrProduct().isDisplayed());
    	Assert.assertTrue(r.getErrText().isDisplayed());
    	Assert.assertTrue(r.getErrRating().isDisplayed());
    	//printing error messages
    	System.out.println(r.getErrAuthor().getText()+"\n"+r.getErrProduct().getText()+"\n"+r.getErrText().getText()+"\n"+r.getErrRating().getText());
    }

    @When("^Giving review details for required fields$")
    public void giving_review_details_for_required_fields() throws Throwable 
    {
    	//giving input for required fields
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	r.getAuthorName().sendKeys("ramya");
    	r.getProduct().sendKeys("Apron");
    	driver.findElement(By.xpath("//*[@id='form-review']/div[2]/div/ul/li[1]")).click();
    	r.getText().sendKeys("good");
    	r.getRating().click();
    	//clicking on save icon
    	r.getSave().click();
    }

    @Then("^Create Review$")
    public void create_review() throws Throwable 
    {
    	//checking if success message is displayed or not 
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	//printing the success message and page number
    	System.out.println(r.getSuccess().getText());
    	System.out.println(r.getPage().getText());
    }
    
    @Then("^Delete review$")
    public void delete_review() throws Throwable 
    {
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	//checking if success message is displayed or not 
    	Assert.assertTrue(r.getSuccess().isDisplayed());
    	//printing the success message and page number
    	System.out.println(r.getSuccess().getText());
    	System.out.println(r.getPage().getText());
    }

    @When("^giving valid review details$")
    public void giving_valid_review_details() throws Throwable 
    {
    	//giving valid details for input fields
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	r.getProName().sendKeys("jacket");
    	r.getAuthor().sendKeys("AVENGER");
    	r.getStatus().click();
    	//selecting Enabled from drop down
    	WebElement status=r.getStatus();
    	Select dropdown=new Select(status);
    	dropdown.selectByVisibleText("Enabled");
    }
    
    @Then("^Display the reviews which are having selected details$")
    public void display_the_reviews_which_are_having_selected_details() throws Throwable 
    {
    	//Checking if list is displayed or not
    	WebElement list=driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']/tbody"));
    	Assert.assertTrue(list.isDisplayed());
    	//printing the success message
        System.out.println("Displayed");
    }	
    
    @When("^giving invalid review details$")
    public void giving_invalid_review_details() throws Throwable 
    {
    	//giving invalid details for input fields
    	ReviewsCatalog r=new ReviewsCatalog(driver);
    	r.getProName().sendKeys("jjjjjjjjjjj");
    	r.getAuthor().sendKeys("AVENGER");
    	r.getStatus().click();
    	//selecting Enabled from drop down
    	WebElement status=r.getStatus();
    	Select dropdown=new Select(status);
    	dropdown.selectByVisibleText("Enabled");
    }

    //////////////////////////////information///////////////////////////////
    
    @When("^Click on Information$")
    public void click_on_information() throws Throwable 
    {
    	//creating object for HomeCatalog
    	HomeCatalog h=new HomeCatalog(driver);
    	//clicking on Information
    	h.getInformation().click();
    }
    
    @Then("^Navigate to Information Page$")
    public void navigate_to_information_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title information
    	String s=driver.getTitle();
    	Assert.assertEquals("Information",s);
    	//checking if page source contains Information and printing a message
    	if(driver.getPageSource().contains("Information"))
    	{
    		System.out.println("Navigated to Information page");
    	}
    }
    
    @And("^Not giving information details for required fields$")
    public void not_giving_information_details_for_required_fields() throws Throwable 
    {
    	//clicking on save icon
    	InformationCatalog i=new InformationCatalog(driver);
    	i.getSave().click();
    }

    @Then("^Should dispaly Error message to fill required information details$")
    public void should_dispaly_error_message_to_fill_required_information_details() throws Throwable 
    {
    	//checking if error message is displayed or not
    	InformationCatalog i=new InformationCatalog(driver);
    	Assert.assertTrue(i.getErrInfo().isDisplayed());
    	Assert.assertTrue(i.getErrDesc().isDisplayed());
    	Assert.assertTrue(i.getErrMeta().isDisplayed());
    	//printing a message
    	System.out.println("Displaying messages to fill required fields");
    }
    
    @When("^Giving information details for required fields$")
    public void giving_information_details_for_required_fields() throws Throwable 
    {
    	//giving input for required fields
    	InformationCatalog i=new InformationCatalog(driver);
    	i.getInfoTitle().sendKeys("Customer_care");
    	i.getDesc().sendKeys("for any quiries contact");
    	i.getMetaTitle().sendKeys("contact");
    	//clicking on save icon
    	i.getSave().click();
    }

    @Then("^Create Information$")
    public void create_information() throws Throwable 
    {
    	//checking if success message is displayed or not
    	InformationCatalog i=new InformationCatalog(driver);
    	Assert.assertTrue(i.getSuccess().isDisplayed());
    	//printing success message
    	System.out.println(i.getSuccess().getText());
    	System.out.println(i.getPage().getText());
    } 
    
    @Then("^Delete Information$")
    public void delete_information() throws Throwable 
    {
    	//checking if success message is displayed or not
    	InformationCatalog i=new InformationCatalog(driver);
    	Assert.assertTrue(i.getSuccess().isDisplayed());
    	//printing the success message
    	System.out.println(i.getSuccess().getText());
    	System.out.println(i.getPage().getText());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////     News Letter   /////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @When("^Click on Subscribe unsubscribe to newsletter$")
    public void click_on_subscribe_unsubscribe_to_newsletter() throws Throwable 
    {
    	//creating object for NewsLetter class
    	NewsLetter n=new NewsLetter(driver);
    	//clicking on Subscribe Unsubscribe to newsletter
    	n.getNewsLetter().click();
    }

    @Then("^Navigate to NewsLetter page$")
    public void navigate_to_newsletter_page() throws Throwable 
    {
    	//Getting present page title and comparing it with expected title Newsletter Subscription
    	String s=driver.getTitle();
    	Assert.assertEquals("Newsletter Subscription",s);
    	//printing navigated message
    	System.out.println("Navigated to Newsletter Subscription page");
    }
    
    @When("^Clicking on Subscribe Yes$")
    public void clicking_on_subscribe_yes() throws Throwable 
    {
    	//clicking on "Yes" for subscribe
    	NewsLetter n=new NewsLetter(driver);
    	n.getSubYes().click();
    	//checking if subscribe "Yes" is selected or not
    	Assert.assertTrue(n.getSubYes().isSelected());
    	System.out.println("Yes is selected");
    }

    @And("^Clicking on Subscribe No$")
    public void clicking_on_subscribe_no() throws Throwable 
    {
    	//clicking on subscribe "No"
    	NewsLetter n=new NewsLetter(driver);
    	n.getSubNo().click();  
    	//Checking if subscribe "No" is selected or not
    	Assert.assertTrue(n.getSubNo().isSelected());
    	System.out.println("No is selected");
    }
    
    @Then("^Subscribe Yes should not be selected$")
    public void subscribe_yes_should_not_be_selected() throws Throwable
    {
    	//checking if Subscribe Yes is not selected
    	NewsLetter n=new NewsLetter(driver);
    	Assert.assertFalse(n.getSubYes().isSelected());
    	System.out.println("Yes is not selected");
    }
    
    @When("^Clicking on Yes in NewsLetter$")
    public void clicking_on_yes_in_newsletter() throws Throwable 
    {
    	//clicking on "Yes"
    	NewsLetter n=new NewsLetter(driver);
    	n.getSubYes().click();
    }

    @And("^Clicking on CONTINUE in NewsLetter$")
    public void clicking_on_continue_in_newsletter() throws Throwable 
    {
    	//Clicking on continue button
    	NewsLetter n=new NewsLetter(driver);
    	n.getSubmit().click();
    }
    
    @Then("^Subscribe NewsLetter$")
    public void subscribe_newsletter() throws Throwable 
    {
    	//checking if success message is displayed or not
    	NewsLetter n=new NewsLetter(driver);
    	Assert.assertTrue(n.getSuccess().isDisplayed());
    	System.out.println(n.getSuccess().getText());
    	//again navigating to NewsLetter page
    	n.getNewsLetter().click();
    	//checking if yes is selected
    	Assert.assertTrue(n.getSubYes().isSelected());
    	System.out.println("Subscribed");
    }
    
    @When("^Clicking on No in NewsLetter$")
    public void clicking_on_no_in_newsletter() throws Throwable 
    {
    	//clicking on "No"
    	NewsLetter n=new NewsLetter(driver);
    	n.getSubNo().click();
    }
    
    @Then("^Unsubscribe NewsLetter$")
    public void unsubscribe_newsletter() throws Throwable 
    {
    	//checking if success message is displayed or not
    	NewsLetter n=new NewsLetter(driver);
    	Assert.assertTrue(n.getSuccess().isDisplayed());
    	System.out.println(n.getSuccess().getText());
    	//again navigating to NewsLetter page
    	n.getNewsLetter().click();
    	//checking if no is selected
    	Assert.assertTrue(n.getSubNo().isSelected());
    	System.out.println("Un Subscribed");
    }
}