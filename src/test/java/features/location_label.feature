Feature: Search location functionality

  As a user, I want to be able to click on the search field and see the "Use your current location" label displayed.

  Scenario: Display "Use your current location" label after clicking search field
    When I verify that the consent data usage pop-up is displayed
    And I click the search field
    Then I see the Use your current location label displayed
