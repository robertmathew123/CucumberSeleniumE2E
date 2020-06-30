@ui @search
Feature: Search functionality


Scenario: Search a product
Given I have browser opened and url is navigated
When I search for product as "Dell"
Then Product list should appear pertaining to the product search as "Dell"

@TC0004
Scenario: User want to Search for products using Hamburger menu in the Header Section
Given I have browser opened and url is navigated
When I click on Hamburger menu
And I click on Hamburger menu with category as "Mobiles, Computers"
And I click on Hamburger menu with sub category as "Power Banks"
Then Search results are displayed for product related to "Power Banks"

@TC0008
Scenario: A User Should be Able to click on a product link from the search page and product description page should be displayed.
Given I have browser opened and url is navigated
When I search for product as "Dell"
And I click on any product in the Search result
Then I am able to see product description and details in new tab
