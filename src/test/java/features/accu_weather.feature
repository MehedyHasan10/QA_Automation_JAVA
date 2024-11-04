Feature: Search for a city and validate the results on AccuWeather page
  As a user
  I want to search for a city on AccuWeather
  So that I can view the city's weather information

  Scenario: Search and select a city
    Given I accept the consent policy
    When I search City
    When I should see the result list displayed
    And I select the first search result
    Then I should see the city header displayed
