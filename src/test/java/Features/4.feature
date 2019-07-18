Feature: Zones Search
  Scenario Outline: as user i can search for a zone
    Given the user has access to search button
    And the user clicks on search button
    When the user set the text field "<searchWord>"
    Then the user : "<result>"
    Examples:
  | searchWord   | result                                       |
  |Mun          |   alert will not have any zone in the list            |
  |Muneerah      |  find the zone Munreerah  in the list        |
