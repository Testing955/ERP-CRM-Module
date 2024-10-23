Feature: User Login
@UserLoginTest
  Scenario: User logs in with valid email and password
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    And the user clicks on the login button
    Then the user should be logged into their account
