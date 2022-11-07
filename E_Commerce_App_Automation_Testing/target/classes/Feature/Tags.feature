Feature: Logged user could select different tags
  Background: open browser and login
    Given User open the browser8
    And USER login in the system "20197871@fue.edu.eg" and "MohamedElbadri"
  Scenario: User select different tags
    Given navigate to Category page
    When User click on a Tag
    Then successfully page loaded

