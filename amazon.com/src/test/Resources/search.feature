Feature: Verify Search Functionality on Amazon Website
@test
  Scenario: User can search valid product as a guest

    Given User is on Homepage
    When User types a valid product in Search bar
    And User clicks on Search icon
    Then appropriate result page should be displayed

@test

Scenario: User can search valid product after login
  Given User is on Homepage
  When User Clicks on Your account Sign-In
  And enters valid username and password
  And Clicks on sign in submit button
  Then User logins successfully
  And  User types a valid product in Search bar
  And User clicks on Search icon
  Then appropriate result page should be displayed
