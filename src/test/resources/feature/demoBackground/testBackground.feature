Feature: This is testing cucumber background functionality using lean automation site testing

Background: User is logged in
Given user is on login page
When user enters username and password
Then login successful

Scenario: verify edit profile page displayed
Given User id displayed with profile icon
When user clicks on profile icon
And user clicks on edit profile link
Then edit profile page is displayed

Scenario: verify user logged out successfully
Given User id displayed with profile icon
When user clicks on profile icon
And user clicks on logout link
Then logout successful


