Feature: Dynamic Controls

  Scenario: Enable input field and enter text
    Given I go the "Dynamic Controls" on the main page
    When I click the enable button
    Then the input field should be enabled
    When I enter random text in the input field

