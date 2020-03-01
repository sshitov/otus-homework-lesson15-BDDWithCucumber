Feature: Filtration blog by QA

  Scenario: Filtration blog by QA
    Given I'm on the posts page
    When I navigate to 'Blog'
    And I select QA
    Then I see in the page header 'QA and testing'