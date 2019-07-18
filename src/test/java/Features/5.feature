Feature: PLACE MARKETS
  Scenario: As a user i can load list  of place market view
    Given the user has access to side menu
    When the user clicks on place market navigateMenutool SubMenu
    Then The user redirected to place market List view "market"
