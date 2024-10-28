Feature: Dropdown interaction

  Scenario: Select an option from the dropdown
    Given I go the "Dropdown" on the main page
    And I select "Option 2" from the dropdown
    Then the selected option should be "Option 2"
