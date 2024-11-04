Feature: Recent Locations

  Scenario: Verify recent locations functionality on the weather application
    Given I search recent location
    When I see the result list displayed
    And I select the first result
    Then Back to main page
    Then I click the recent location
    Then If I see the google ads
    Then City weather page header contains city name from the search
