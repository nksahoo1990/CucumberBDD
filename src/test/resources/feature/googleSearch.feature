Feature: Feature to test google search functionality

Scenario: Verify google search is working
   Given browser is open
   And user is on google page
   When user enters text in serach box
   And hits enter
   Then user is navigated to search results