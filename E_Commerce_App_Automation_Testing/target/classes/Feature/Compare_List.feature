@ZLATAN
Feature: Logged user could add different products to compare list
  Background: open browser and login
    Given User open the browser11
    And USER LOgin in the system "20197871@fue.edu.eg" and "MohamedElbadri"
  Scenario: User Add products to compare list
    Given Navigate to shoes page and user choose a one
    When User opens the dropdown list and choose the size
    And Click on add to compare list
    And successfully added to compare list
    When User navigate to Home and Choose a phone to add to compare list
    And Click on compare list
