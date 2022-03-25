Feature: Login into Salesforce Application
Scenario: Login into salesforce with valid username and invalid password
Given User launch the salesforce application
When user enter value into username
And user enter value into password
Then user click on login rememberme checkbox

Scenario: Login into salesforce with valid username and valid password
Given User launch the salesforce application
When user enter value into username
And user enter value into password
Then user click on login button