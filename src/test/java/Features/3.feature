Feature: Zones
  Scenario: As a user i can load list  of zones view
    Given the user has access to side menu
    When the user clicks on Zones navigateMenutool SubMenu
    Then The user redirected to Zone List view "zones"
  Scenario: As a user i can load details list  of selected zone
    Given The user redirected to Zone List view "zones"
    When the user clicks on selected Zones to see the details
    Then The user redirected to details Zone in map view
  Scenario: As a user i can verify assets position
    Given The user redirected to details Zone in map view
    When the user clicks on the assets review button
    Then The user has access to see all the assets in the  map view "assets"
    And The user can mask  all the assets in the  map view "assets"
#    And The user can return list of assets
#  Scenario: As a user i can search for a  zone
#    Given the user has access to search button
#    When the user clicks on search  button
#   Then The user has access to textField search






