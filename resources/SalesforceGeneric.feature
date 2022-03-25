Feature: Login into Salesforce Application

Scenario: Login into saleforce with valid username and Valid password
Given User is on "LoginPage"
When User enter into text box "Username" "test@tek.com"
When User enter into text box "Password" "salesforce1"
Then User Clicks on Button "Login"
Given User is on "HomePage"
Then User Clicks on Link "Leads"

Scenario: TC25 Create New Contact
Given User is on "LoginPage"
When User enter into text box "Username" "test@tek.com"
When User enter into text box "Password" "salesforce1"
Then User Clicks on Button "Login"
Given User is on "HomePage"
Then User Clicks on Link "Contacts"
Then User Clicks on Link "Dialog"
Given User is on "ContactsPage"
When User Clicks on Button "New"
Then User enter into text box "LastName" "namelast"
Then User enter into text box "AccountName" "GenePoint"
Then User Clicks on Button "Save"

Scenario: TC26 Create New View in the Contact Page
Given User is on "LoginPage"
When User enter into text box "Username" "test@tek.com"
When User enter into text box "Password" "salesforce1"
Then User Clicks on Button "Login"
Given User is on "HomePage"
Then User Clicks on Link "Contacts"
Given User is on "ContactsPage"
Then User Clicks on Link "CreateNewView"
When User enter into text box "ViewName" "nView"
When User enter into text box "ViewUniqueName" "v_1"
Then User Clicks on Button "Save"

Scenario: TC27 Check recently created Contacts
Given User is on "LoginPage"
When User enter into text box "Username" "test@tek.com"
When User enter into text box "Password" "salesforce1"
Then User Clicks on Button "Login"
Given User is on "HomePage"
Then User Clicks on Link "Contacts"
Given User is on "ContactsPage"
When User enter into text box "RecentlyCreated" "Recently Created"


