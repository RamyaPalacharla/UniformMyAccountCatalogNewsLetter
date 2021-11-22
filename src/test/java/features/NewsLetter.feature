Feature: NewsLetter

  Background: Open browser and navigate to url and login with valid credentials
		Given Login with user credentials 
		
	@newsletter
  Scenario: Verify Newsletter functionality in Catalog
  
    When Click on Subscribe unsubscribe to newsletter
    Then Navigate to NewsLetter page  
    
    When Clicking on Subscribe Yes
    And Clicking on Subscribe No
    Then Subscribe Yes should not be selected
    
    When Clicking on Yes in NewsLetter
    And Clicking on CONTINUE in NewsLetter
    Then Subscribe NewsLetter
    
    When Clicking on No in NewsLetter
    And Clicking on CONTINUE in NewsLetter
    Then Unsubscribe NewsLetter 
    
    When Clicking on Back
    Then Navigate to MyAccount page
    And Close driver
    