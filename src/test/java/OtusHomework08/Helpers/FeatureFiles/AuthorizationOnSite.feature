Feature: Authorization on site

  Scenario: Authorization on site
    Given I'm in the authorization page
    When I fill the all required fields on the form
    And I submit the form
    Then I see profile name in the header