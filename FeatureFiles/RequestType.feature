Feature: RequestType Feature

  @RequestTypeFeature
  Scenario: Verify the request type feature
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    And the user clicks on the login button
    Then the title "Home" should be shown to the user
    And the user clicks on the "CRM" option
    When the user clicks on the "Lead" option under the Sales Pipeline
    Then the lead page should be displayed
    Then in the lead page when the user click on the add lead option then add lead page should open
    Then validate whether the text "Request Type" is visible or not
    When the user clicks on the "Request Type" option, the request type dropdown should be displayed
    And the user selects the respective option from the dropdown
