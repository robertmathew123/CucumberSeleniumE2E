Feature: Potal Login
Background:
Given Validate the browser
When  Browser is triggered
Then  Check if browser is started

@PortalTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into Netbanking with "Joby" and "123"
Then Home page is displayed
And Cards are displayed "true"

@PortalTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into Netbanking with "Joby1" and "124"
Then Home page is displayed
And Cards are displayed "false"

@PortalTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When User sign up with following details
| Jennifer | abcd | Jennifer@abcd.com | India | 3242353 | 
Then Home page is displayed
And Cards are displayed "false"

@PortalTest
Scenario Outline: Home Page default login
Given User is on Netbanking landing page
When User login into application with <UserName> and <PassWord>
Then Home page is displayed
And Cards are displayed "true" 

Examples:
|UserName|PassWord|
|User5   |Pass5   |
|User6   |Pass6   |
|User7   |Pass7   |
|User8   |Pass8   |

