Feature: Search and view weather information for a city
  As a user
  I want to search for a city on AccuWeather

  Scenario: Search for a city and verify recent locations
    When I see consent data usage
    When I search for the city "London"
    And I see the result list displayed
    When I select the first search result
    And I see city header displayed
    When I go back to the previous page
    Then Main is open
    When I click first recent location
    Then I see header contains city name "London" from the search
