Feature: User shall be able to register to the system
  Scenario: User enter a valid data
    Given User open the browser2
    When user navigate to the register page
    And user enter a valid first name "Mohamed"
    And user enter a valid second name "Elbadri"
    And user enter a valid email "20196861@fue.edu.eg"
    And user enter a valid password "MohamedElbadri"
    And user enter the right password confirmation "MohamedElbadri"
    And user click on register button
    Then successful message will be displayed
