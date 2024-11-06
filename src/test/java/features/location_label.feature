Feature: Search location functionality

  As a user, I want to be able to click on the search field and see the "Use your current location" label displayed.

  Scenario: Display "Use your current location" label after clicking search field
    When I see consent data usage
    When I click the search field
    Then I see the Use your current location label displayed
