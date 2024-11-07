Feature: Search for a city and validate the results on AccuWeather page
  As a user
  I want to search for a city on AccuWeather

  Scenario: Search for a city by search query
    When I see consent data usage
    When I search for the city "New York"
    Then I see the result list displayed
    When I select the first search result
    Then I see header contains city name "New York" from the search
