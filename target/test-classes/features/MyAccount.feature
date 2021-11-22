Feature: MyAccount

  Background: Open browser and navigate to url and login with valid credentials
		Given Login with user credentials
	
  @myaccount
  Scenario: Verify MyAccount page is opening when clicking on MyAccount
    
    When Click on MyAccount in footer
    Then Navigate to MyAccount page
    And Close driver
    
    Given Login with user credentials
    When Click on MyAccount in dropdown
    Then Navigate to MyAccount page
    And Close driver
    

  @account_details
  Scenario: Verify Edit your account information
    
    When Click on Edit your account information
    Then Navigate to MY ACCOUNT INFORMATION
    
    When Edit details and click on CONTINUE
    Then Get success message
    
    When Edit details and click on Back
    Then Details not updated
    
    When Giving text for Telephone field and click on continue
    Then Show Error
    And Close driver
    

  @password
  Scenario: Verify Change your password
    
    When Click on Change your password
    Then Navigate to CHANGE PASSWORD
    
    When Edit password with different input for password and confirm password and click on CONTINUE
    Then Get missmatch message
    
    When Edit password with size lessthan 3 and click on CONTINUE
    Then Get Sizemissmatch message
    
    When Edit password with same input for password and confirm password and click on CONTINUE
    Then Get updated message
    
    When Clicking on Change your password and clicking on Back
    Then Navigate to MyAccount page
    And Close driver
    
  @address
  Scenario: Verify Modify your address book entries
  	
    When Click on Modify your address book entries
    Then Navigate to Address book entries
    
    When Clicking on New Address
    And Creating a new Addrees by giving valid details and click on continue
    Then Address is created
    
    When Deleting Default address
    Then Display error Message
    
    When Deleting Normal address
    Then Delete that address
    
    When Clicking on Back
    Then Navigate to MyAccount page
    And Close driver
    
  @wishlist
  Scenario: Verify Modify your wishlist
  	
  	When Click on Modify your wishlist
    Then Navigate to Modify your wishlist 
 		
 		When Click on into icon
 		Then Delete that product from MyWishList
 		
 		When Click on Cart icon
 		Then Product Should be added to cart
 		
 		When Click on Continue
 		Then Navigate to MyAccount page
 		And Close driver 
     
    
    
    
