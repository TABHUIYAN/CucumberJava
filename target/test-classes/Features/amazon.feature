
Feature: feature to test amazon search functionality

  Scenario: Validate amazon search page 
    Given browser is open
    And user is on amazon search page
    When user enters a text in search box 
    And hits enter
    Then user is navigated to search results
     