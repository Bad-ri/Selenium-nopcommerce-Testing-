@ZLATAN
Feature: Logged in user shall change the currency of the system
  Background: open browser and login
    Given User open the browser5
    And user login in the system "20197871@fue.edu.eg" and "MohamedElbadri"
  Scenario: User change the currency
    Given Navigate to Home page
    When User click on change button
    Then successfully currency changed