Feature: Create a new user

  @SmokeTest
  Scenario:  Visit the sites backend and create a new user
    Given User is on Admin Home Page
    When Click on User and navigate Add New
    Then Fill in the necessary details
    And Click the Add New User button
    And Verify that the user was created
    And Close the browser
