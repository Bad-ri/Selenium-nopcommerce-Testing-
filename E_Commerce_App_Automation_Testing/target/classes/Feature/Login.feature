Feature: User shall login in the system
  Scenario: User login with valid data
    Given User open the browser
    When navigate to the login page
    And User enter a valid email and password "20196861@fue.edu.eg" and "MohamedElbadri"
    And User click on login button
    Then successfully message will displayed
