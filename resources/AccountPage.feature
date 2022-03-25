Feature: Validate the AccountsPage Elements
Background: User is logged in Salesforce application
When User is on "LoginPage"
When User enter into text box "Username" "test@tek.com"
When User enter into text box "Password" "salesforce1"
Then User Clicks on Button "Login"
Scenario Outline:
Create an account
When User is on "HomePage"
When User Clicks on Link "AccountsTab"
Given User is on "AccountsPage"
And User Clicks on Button "NewButton"
Then User enter into text box "AccountName" "<accountname>"
Then User Select "Technology Partner" from "TypeDropDown" Box
Then User Select "High" from "PriorityDropDown" Box
And User Click on Button "SaveAndNewButton"
Examples:
|accountname |
|Amazon|
|AliBaba|


