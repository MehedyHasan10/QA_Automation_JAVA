Feature: Drag and Drop functionality

  Scenario: User can drag Column A to Column B
    Given I go the "Drag and Drop" on the main page
    When I drag Column A to Column B
    Then Column A should display "B"
    And Column B should display "A"
