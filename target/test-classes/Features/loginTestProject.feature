Feature: Test login functionality

  Scenario Outline: check login is successful with valid credntials
    Given test project browser is open
    When user landed to the login page
    And user enters valid <username> and <password>
    And user enter click
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Jerin    |    12345 |
      | Tahmina  |    12345 |
