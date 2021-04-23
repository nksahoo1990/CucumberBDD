Feature: This is to test Hook functionality in cucumber

# @smoke
Scenario: google search functionality
Given navigate to google page
When search for pen
And click on enetr button
Then pen page should display

Scenario: google click on links functionality
Given navigate to google page
When click on image link
Then Image page should display