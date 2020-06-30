Feature: Search and place order for vegetables

@SmokeTest
Scenario: Search for items and validate the results
Given User is on GreenKart Landing page
When User search for "Cucumber" Vegetable
Then "Cucumber" results are displayed

@SmokeTest
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenKart Landing page
When User search for <FruitName> Vegetables
Then <FruitName> Fruit results are displayed
And Add items to cart
And User proceeded to Checkout page for purchase
Then Verify selected <FruitName> items are displayed in Check out page


Examples:
|FruitName|
|Cucumber|
|Brinjal|

