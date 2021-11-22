Feature: Catalog

  Background: Open browser and navigate to url
    Given Login with admin creditials
    And Click on menu button and then Catalog

  @categories
  Scenario: Verify Categories functionality in Catalog
  
    When Click on Categories
    Then Navigate to Categories page
    
    When Clicking on plus icon
    And Not giving input for required fields for category and clicking on save icon
    Then Should dispaly Error message to fill required category details
    
    When Giving input for required fields for category and clicking on save icon
    Then Create that category
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that categories
    
    When Clicking on edit icon
    And Editing category and meta title
    Then Category should be edited
    And Close driver

  @products
  Scenario: Verify Products functionality in Catalog
  
    When Click on Products
    Then Navigate to Products page
    
    When Clicking on plus icon
    And Not giving input for required fields for products and clicking on save icon
    Then Should dispaly Error message to fill required products details
    
    When Giving input for required fields for products and clicking on save icon
    Then Create that product
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that product
    
    When Clicking on Edit icon
    And Editing Product details
    Then Product details should be edited
    
    When Giving valid product details
    And Click on filter
    Then Display the products which are having selected details
    
    When Giving invalid product details
    And Click on filter
    Then Display No Results
    And Close driver

  @recurring_profiles
  Scenario: Verify Recurring Profiles functionality in Catalog
  
    When Click on Recurring Profiles
    Then Navigate to Recurring Profiles page
    
    When Clicking on plus icon
    And Not giving input for required fields for recurring profiles and clicking on save icon
    Then Should dispaly Error message to fill required Recurring Profile details
    
    When Giving input for required fields for recurring profiles and clicking on save icon
    Then Create that Recurring Profile
    
    When Selecting checkboxes
    And Clicking on copy icon
    Then Copy that RecurringProfile
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that Recurring profile
    
    When Clicking on edit icon
    And Editing Recurring Profiles details
    Then Recurring Profiles should be edited
    And Close driver

  @filters
  Scenario: Verify Filters functionality in Catalog
  
    When Click on Filters
    Then Navigate to Filters page
    
    When Clicking on plus icon
    And Not giving input for required fields for Filter and clicking on save icon
    Then Should dispaly Error message to fill required Filter details
    
    When Giving input for required fields for Filter and clicking on save
    Then Create Filter
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that Filter
    
    When Clicking on edit icon
    And Editing filter details
    Then Filter details should be edited
    And Close driver

  @attributes
  Scenario: Verify attributes functionality in Catalog
  
    When Click on Attributes
    Then Should display drop down
    
    When Click on Attributes in Attributes List
    Then Navigate to Attributes Page
    
    When Clicking on plus icon
    And Not giving attributes details for required fields
    Then Should dispaly Error message to fill required attribute details
    
    When Giving attribute details for requiredfileds and clicking on save icon
    Then Create attribute
    
    
    When Click on edit icon
    And Editing attribute details
    Then Attribute details should be edited
    
    When Clicking on Attribute Groups
    Then Navigate to Attribute Groups Page
    
    When Clicking on plus icon
    And Not giving attribute group details for required fields and clicking on save icon
    Then Should dispaly Error message to fill required attribute group details
    
    When Giving attribute group details for required fields and clicking on save icon
    Then Create Attribute Group
    
    
    When Clicking on edit icon
    And Editing attribute group details
    Then Attribute group details should be edited
    And Close driver

  @options
  Scenario: Verify options functionality in Catalog
  
    When Click on Options
    Then Navigate to Options Page
    
    When Clicking on plus icon
    And Not giving option details for required fields
    Then Should dispaly Error message to fill required option details
    
    When Giving option details for required fields and clicking on save icon
    Then Create option
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that option
    And Close driver

  @manufacturers
  Scenario: Verify manufacturers functionality in Catalog
  
    When Click on Manufacturers
    Then Navigate to Manufacturers Page
    
    When Clicking on plus icon
    And Not giving manufacturer details for required fields and clicking on save icon
    Then Should dispaly Error message to fill required manufacturer details
    
    When Giving manufacturer details for required fileds and clicking on save icon
    Then Create Manufacturer
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that Manufacturer
    And Close driver

  @downloads
  Scenario: Verify downloads functionality in Catalog
  
    When Click on Downloads
    Then Navigate to Downloads Page
    
    When Clicking on plus icon
    And Giving downloads details for required fileds and clicking on save icon
    Then Create download
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete that Download
    
    When Clicking on edit icon
    And Editing Downloads details
    Then Download details should be edited
    And Close driver

  @reviews
  Scenario: Verify reviews functionality in Catalog
  
    When Click on Reviews
    Then Navigate to Reviews Page
    
    When Clicking on plus icon
    And Not giving review details for required fields
    Then Should dispaly Error message to fill required review details
    
    When Giving review details for required fields
    Then Create Review
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete review
    
    When giving valid review details
    And Click on filter
    Then Display the reviews which are having selected details
    
    When giving invalid review details
    And Click on filter
    Then Display No Results
    And Close driver

  @information
  Scenario: Verify information functionality in Catalog
  
    When Click on Information
    Then Navigate to Information Page
    
    When Clicking on plus icon
    And Not giving information details for required fields
    Then Should dispaly Error message to fill required information details
    
    When Giving information details for required fields
    Then Create Information
    
    When Selecting checkboxes
    And Clicking on delete icon
    Then Delete Information
    And Close driver
