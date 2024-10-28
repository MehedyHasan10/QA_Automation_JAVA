Feature: Multiple Windows
  As a user
  I want to handle multiple browser windows
  So that I can switch between them successfully

  Scenario: Handling multiple windows
    Given I go the "Multiple Windows" on the main page
    When I click on the Click Here link to open a new window
    Then I should be able to switch to the new window
    And I should see the new window's title as "New Window"
