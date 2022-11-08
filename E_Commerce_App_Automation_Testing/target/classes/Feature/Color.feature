@ZLATAN
Feature: Logged user could filter with color
  Background: open browser and login
    Given User open the browser7
    And USer login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User filter by color
    Given navigate to Apparel page
    When User click on shoes category
    And User choose red color for filter
    Then successfully page filterd
