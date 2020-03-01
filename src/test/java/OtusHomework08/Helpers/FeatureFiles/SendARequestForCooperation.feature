Feature: send a request for cooperation

  Scenario: Send a request for cooperation
    Given I'm in the recruiters page
    When I click 'cooperate' link
    And I fill all required fields on the form
    And I submit form
    Then I see a message that the application sent