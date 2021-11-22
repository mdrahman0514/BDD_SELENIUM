Feature: Sign Up Validation of Facebook

  Scenario Outline: 
    Given user wants to land facebook URL
    When user clicks at Create New Account
    When user inputs First name "<firstname>", Last name "<lastname>", 
    When user types email"<email>"
    When user enters confirm email "<email>", New password "<password>"
    Then user selects dropdown Month and dropdown Day and dropdown Year
    Then user clicks on  Male
    Then user clicks on signup button and redirect to facebook page

    Examples: 
      | firstname | lastname | email                | password   |
      | Shamima   | Akter    | sakter1963@yahoo.com | JoduModu12345$ |
      
      