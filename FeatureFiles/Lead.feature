Feature: CRM Page

  Scenario: The elements on the CRM page under Sales Pipeline are clickable and functional
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "admin12"
    And the user clicks on the login button
    Then the title "Home" should be displayed to the user
    And the user clicks on the "CRM" option
    When the user clicks on the "Lead" option under Sales Pipeline
    Then the lead page should be displayed
    When the user enters an ID in the "ID" field
    Then the lead associated with that ID should be displayed
    When the user enters a job title in the "Job Title" field
    Then the leads associated with that job title should be displayed
    When the user enters a status in the "Status" field
    Then the leads associated with that status should be displayed
    When the user enters an organization name in the "Organization Name" field
    Then the leads associated with that organization should be displayed
    When the user enters a territory in the "Territory" field
    Then the leads associated with that territory should be displayed
    When the user enters a title in the "Title" field
    Then the leads associated with that title should be displayed
    And the user verifies whether the "Filter" option is visible
    When the user clicks on the "Filter" option, the applied filter should be removed
    And the user verifies the "Add Lead" option is visible
    When the user clicks on the "Add Lead" option, the add lead page should open
