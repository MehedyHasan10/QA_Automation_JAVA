Feature: Search and view weather information for a city
  As a user
  I want to search for a city on AccuWeather

  Scenario: Search for a city and verify recent locations
    When I click on the consent data usage button
    And I search for the city "London"
    And I see the result list displayed
    And I select the first search result
    When I go back to the previous page
    Then Main Page is open
    When I click first recent location
    Then I see header contains city name "London" from the search
