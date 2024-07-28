Feature: Customers

  Scenario: Add New Customer
    Given User Launch Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/Admin/Customer/Create"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User clicks on customers menu
    And clicks on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer information
    And click on Save button
    Then User can view confirmation message "The new customer has been moved successfully."
    And close browser
