Feature: Open personal profile page

  Scenario: Open personal profile page
    Given I'm on the main page and authorized
    When I click 'My profile' link
    Then I see text 'profile data'