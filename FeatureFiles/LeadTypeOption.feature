Feature: LeadType List
@TestLeadType
  Scenario: User selects an option from the LeadType dropdown under Lead option
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    And the user clicks on the login button
    Then the title "Home" should be shown to the user
    And the user clicks on the "CRM" option
    When the user clicks on the "Lead" option under the Sales Pipeline
    Then the lead page should be displayed
    Then in the lead page when the user click on the add lead option then add lead page should open
    And the text "Lead Type" should be visible to the user
    When the user clicks on the LeadType dropdown the dropdown list should open
    And the user selects an option from the LeadType dropdown list
