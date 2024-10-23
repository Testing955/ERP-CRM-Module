Feature: Functionaly creating a new lead

  @Test1
  Scenario: creating a new lead through functionality
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    And the user clicks on the login button
    Then the title "Home" should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    When the user click on the saluation field then salutation drop down should be open
    And under salutation dropdown the user choose the option Create a new Salutation
    And after selecting the option the text "New Salutation" should be shown to the user
    And under new salution option the text "Salutation" should be shown to the user
    Then the user enter the salutation tag under salutation field
    Then in the section1 mention text should be showm "Save"
    And after entering the tag the user user click on the save option to save the salutation details
    Then user enter the firstname in the firstname field
    Then user enter the middlename in the middlename field
    Then user enter the lastame in the lastname field
    Then user enter the jobtitle in the jobtitle field
    When the user click on the gender field then gender drop down should be open
    And under gender dropdown the user choose the option Create a new Gender
    And after selecting the option "New Gender" text should be shown to the user
    And text "Gender" option should be shown to the user
    Then the user enter the gender tag under gender field
    Then in the section1 mention text should be showm "Save"
    And after entering the tag the user user click on the save option to save the gender details
    When the user click on the source field then leadsource drop down should be open
    And under source field dropdown the user choose the option Create a new Lead Source
    And after selecting the option the text "New Lead Source" should be shown to the user in the lead source popup
    And text "Source Name" option should be visible to the user in the lead source popup
    Then the user enter the lead source tag under lead source field popup
    When the user click on the close option then the pop up sourcefield should be closed
    Then in the section1 mention text should be showm "Save"
    And after entering the tag the user user click on the save option from the source pop to save the lead details
    When the user click on the edit option under leadsource popup
    Then the option "New Lead Source" should be shown to the user in the lead source field
    And text "Source Name" option should be shown to the user in the lead source field
    Then the user enter the lead source details under lead source field
    Then in the section1 mention text should be showm "Save"
    And after entering the tag the user user click on the save option from the Leadsource field
    When the user clicks on the status options
    Then in the status dropdown user select the option lead from the dropdown
    When the user click on the leadtype option dropdown down should open
    And from the dropdown user select the desired option from it
    Then user clicks on the request type option dropdown should open
    And from the dropdown user select the options from it
    Then the user enters the email ID in the "Email" field
    Then the user enters the mobile number in the "Mobile Number" field
    Then the user enters the phone number in the "Phone Number" field
    Then the user enters the website in the "Website" field
    Then the user enters the WhatsApp number in the "WhatsApp" field
    Then the user enters the phone extension number in the "Phone Extension" field
    Then the user enters the organization name in the "Organization Name" field
    Then the user enters the annual revenue in the "Annual Revenue" field
    Then the user clicks on the territory option
    Then the user selects the option "Bihar" from the dropdown
    And from the "Number of Employees" dropdown, the user selects the desired option
    Then the user clicks on the "Industry" option to choose the industry
    And from the Industry dropdown, the user chooses the option "Create New Industry"
    And on the popup, the user validates the text "New Industry Type"
    And on the popup, the text "Industry" should be visible
    Then in the "Industry Type" field on the popup, the user enters the data
    And after that, the user validates the text "Edit Full Form" on the popup
    Then in the section1 mention text should be showm "Save"
    When all the details are filled, the user clicks on the "Save" option
    And if the user doesn't want to create the new industry, they click on the "Close" option from the popup
    When the user clicks on the Edit Form option, then on the New Industry page, the text "New Industry Type" should be displayed
    And the text "Industry" should also be displayed on the "New Industry Type" page
    And in the "Industry Type" field, the user enters the data
    Then in the section1 mention text should be showm "Save"
    When the data is saved after clicking on the "Save" option from the "New Industry Type" page
    Then in the "Fax" field, the user enters the fax number
    When the user clicks on the "Market Segment" option from there choose marketoption
    Then from the "Market Segment" dropdown, the user chooses the desired option
    Then the user enters the city name in the "City" field
    And the state name in the "State" field
    Then from the "Qualification" field, the user chooses the option
