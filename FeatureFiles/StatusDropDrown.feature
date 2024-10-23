Feature: Status DropDown List

  @test3
  Scenario: Status dropdown is open under status option
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    And the user click on the "CRM" option
    When the user click on the "Lead" option under sales pipeline
    Then the lead page should open
    When the user should able to see the text "Status"
    And after clicking on the status dropdown the droplist should open
    Then the following text should be shown to the user "Lead"
    Then the following text should be shown to the user "Open"
    Then the following text should be shown to the user "Replied"
    Then the following text should be shown to the user "Quotation"
    Then the following text should be shown to the user "Opportunity"
    Then the following text should be shown to the user "Lost Quotation"
    Then the following text should be shown to the user "Interested"
    Then the following text should be shown to the user "Converted"
    Then the following text should be shown to the user "Do Not Contact"
