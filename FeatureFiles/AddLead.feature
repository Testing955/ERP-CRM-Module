Feature: Add New Lead

  @AddNewLead
  Scenario: User is able to create the Lead under add lead option
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    And the user click on the "CRM" option
    When the user click on the "Lead" option under sales pipeline
    Then the lead page should open
    And in the lead page verify the option "Add Lead"
    Then in the lead page when the user click on the add lead option then add lead page should open
    When new lead page is open then verify the title "New Lead"
    Then in the section1 mention text should be showm "Save"
    Then in the section1 mention text should be shown  "Series"
    And user verify the text in the section1  "First Name"
    Then in the section1 mention text should be shown "Salutation"
    Then in the section1 mention text should be shown "Middle Name"
    Then in the section1 mention text should be shown "Last Name"
    And user verify the text in the section1  "First Name"
    Then in the section2 mention text should be shown "Job Title"
    Then in the section2 mention text should be shown "Gender"
    //Then in the section2 mention text should be shown "Source"
    Then in the section3 mention text should be shown "Lead Owner"
    Then in the section3 mention text should be shown "Lead Type"
    Then in the section3 mention text should be shown "Request Type"
    And user verify the text in the section3 "Status"
    Then in the status section the mention text should be shown "Lead"
    Then in the status section the mention text should be shown "Open"
    Then in the status section the mention text should be shown "Replied"
    Then in the status section the mention text should be shown "Opportunity"
    Then in the status section the mention text should be shown "Quotation"
    Then in the status section the mention text should be shown "Lost Quotation"
    Then in the status section the mention text should be shown "Interested"
    Then in the status section the mention text should be shown "Converted"
    Then in the status section the mention text should be shown "Do Not Contact"
    Then in the leadtype section the mention text should be shown "Client"
    Then in the leadtype section the mention text should be shown "Channel Partner"
    Then in the leadtype section the mention text should be shown "Consultant"
    Then in the requesttype section the mention text should be shown "Product Enquiry"
    Then in the requesttype section the mention text should be shown "Request for Information"
    Then in the requesttype section the mention text should be shown "Suggestions"
    Then in the requesttype section the mention text should be shown "Other"
    

  @AddNewLeadContactInfo
  Scenario: User adding the conatct info of the Lead
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    And also verify the title "Contact Info"
    Then in the Contact Info section email and website the mention text should be shown "Email"
    Then in the Contact Info section email and website the mention text should be shown "Website"
    Then in the Contact Info section mobile and whatsapp the mention text should be shown "Mobile No"
    Then in the Contact Info section mobile and whatsapp the mention text should be shown "WhatsApp"
    Then in the Contact Info section phone and phoneextn the mention text should be shown "Phone"
    Then in the Contact Info section phone and phoneextn the mention text should be shown "Phone Ext."

  @AddNewLeadOrganization
  Scenario: User adding the organization info of the Lead
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    And verify the title "Organization"
    Then in the organization Info section of organization email and no of employees the mention text should be shown "Organization Name"
    Then in the organization Info section of organization email and no of employees the mention text should be shown "No of Employees"
    Then in the no of employee section the mention text should be shown "1-10"
    Then in the no of employee section the mention text should be shown "11-50"
    Then in the no of employee section the mention text should be shown "51-200"
    Then in the no of employee section the mention text should be shown "201-500"
    Then in the no of employee section the mention text should be shown "501-1000"
    Then in the no of employee section the mention text should be shown "1000+"
    Then in the organization Info section of organization Annual revenue Industry and MarketSegment the mention text should be shown "Annual Revenue"
    Then in the organization Info section of organization Annual revenue Industry and MarketSegment the mention text should be shown "Industry"
    Then in the organization Info section of organization Annual revenue Industry and MarketSegment the mention text should be shown "Market Segment"
    Then in the organization Info section of organization Territory and Fax the mention text should be shown "Territory"
    Then in the organization Info section of organization Territory and Fax the mention text should be shown "Fax"

  @AddNewLeadAddressAndContacts
  Scenario: User adding the address and contact info of the Lead
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    And verify the title "Address & Contacts"
    When the user click on the address and contact then address and contacts dropdown should open
    Then in the address and contact Info section the mention text should be shown "City"
    Then in the address and contact Info section the mention text should be shown "State"
    Then in the address and contact Info section the mention text should be shown "Country"

  @AddNewLeadQualification
  Scenario: User adding the qualification info of the Lead
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    And verify the title of the section "Qualification"
    When the user click on the qualification then qualification dropdown should open
    Then in the qualification Info section the mention text should be shown "Qualification Status"
    Then in the qualification Info section the mention text should be shown "Qualified By"
    Then in the qualification Info section the mention text should be shown "Qualified on"
    When the user click on the qualification status then qualification status dropdown should open
    Then in the qualification status Info section the mention text should be shown "Unqualified"
    Then in the qualification status Info section the mention text should be shown "In Process"
    Then in the qualification status Info section the mention text should be shown "Qualified"

  @AddNewLeadAdditionalInformation
  Scenario: User adding the additional information info of the Lead
    Given the browser is launching
    When the user enters the email "administrator"
    And the user enters the password "Test@123"
    When the user click on the login button
    Then "Home" title should be shown to the user
    When the user enter the search page name in the awesomebar and press the enter
    When new lead page is open then verify the title "New Lead"
    And verify the title "Additional Information"
    When the user click on the additional information then additional information dropdown should open
    Then in the additional information Info section the mention text should be shown "Campaign Name"
    Then in the additional information Info section the mention text should be shown "Company"
    Then in the additional information Info section the mention text should be shown "Print Language"
    Then in the additional information Info section the mention checkbox should be shown "Disabled"
    Then in the additional information Info section the mention checkbox should be shown "Unsubscribed"
    Then in the additional information Info section the mention checkbox should be shown "Blog Subscriber"


