Feature: This feature is to test parameterization of FB Login page.

Scenario Outline: Verify FB login page.
   Given Open the browser
   And navigate to facebook paage.
   When user enters <username> and <password>
   And clicks on login
   Then user is navigated to home page
   
   Examples:
   |username|password|
   |nitya123|test|
   |bapi1234|test|
   