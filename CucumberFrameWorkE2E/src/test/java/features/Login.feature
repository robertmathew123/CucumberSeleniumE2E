Feature: Application Login

@WebTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into Netbanking with "Robert" and "123"
Then Home page is displayed
And Cards are displayed "true"

@MobileTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into Netbanking with "Robert1" and "124"
Then Home page is displayed
And Cards are displayed "false"

@MobileTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User sign up with following details
| Jenny | abcd | john@abcd.com | India | 3242353 | 
Then Home page is displayed
And Cards are displayed "false"

@WebTest
Scenario Outline: Home Page default login
Given User is on Netbanking landing page
When User login into application with <UserName> and <PassWord>
Then Home page is displayed
And Cards are displayed "true" 

Examples:
|UserName|PassWord|
|User1   |Pass1   |
|User2   |Pass2   |
|User3   |Pass3   |
|User4   |Pass4   |