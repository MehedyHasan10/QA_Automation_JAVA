Feature: File Download

  Scenario: Verify file download functionality
    Given I go the "File Download" on the main page
    Then the download link for the file should be displayed
    And I click the file download link
    Then the file should be downloaded successfully
    And I delete the file if it exists
