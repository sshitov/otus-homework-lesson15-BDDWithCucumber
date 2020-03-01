Feature: Subscribe to news notifications

  Scenario: Subscribe to news notifications
    Given I'm in the main page
    When I fill the subscribe field
    And I click 'subscribe' link
    Then I see the 'You success subscribed' message