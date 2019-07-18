Feature: Logout
  Scenario: As a user i can Logout
    Given the user has access to side menu
    When the user clicks on Logout  navigateMenutool SubMenu
    Then The user redirected to LogInPage