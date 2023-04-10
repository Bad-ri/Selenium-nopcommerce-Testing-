@ZLATAN
Feature: User shall login in the system
  Scenario: User login with valid data
    When navigate to the login page
    And User enter a valid email and password "20199999@fue.edu.eg" and "MohamedElbadri"
    And User click on login button
    Then successfully message will displayed
