Feature: Settings
  Scenario: As a user i can load list  of Settings view
    Given the user has access to side menu
    When the user clicks on Settings  navigateMenutool SubMenu
    Then The user redirected to settings List view "settings"