Feature: Restore Password

  Scenario: Restore Password
    Given I'm open restore password form
    When I fill the email
    And I click submit
    Then I see the message that notification is sent