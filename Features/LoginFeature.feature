Feature: Login

Scenario: Successful login with valid credentials
	Given User Launch Chrome Browser
	When User opens URL "https://demo.nopcommerce.com/login"
	And User enters Email as "ruban52z92@gmail.com" and Password as "52Inspire@92"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And close browser
	
 Scenario Outline: Successful login with valid credentials Data Driven Testing
  Given User Launch Chrome Browser
	When User opens URL "https://demo.nopcommerce.com/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And close browser
	
	
	Examples: 
	|email|password|
	|ruban52z92@gmail.com|52Inspire@92|
	|ruban52z92@gmail.com|52Inspire@92|
	|ruban52z92@gmail.com|52Inspire@92|
	
	