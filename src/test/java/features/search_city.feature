Feature: Search for a city and validate the results on AccuWeather page
  As a user
  I want to search for a city on AccuWeather

  Scenario: Search for a city by search query
    When I click on the consent data usage button
    And I search for the city "New York"
    And I see the result list displayed
    And I select the first search result
    Then I see header contains city name "New York" from the search
