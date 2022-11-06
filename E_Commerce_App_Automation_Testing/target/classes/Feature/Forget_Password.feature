Feature: user shall be able to change his/her password if he/she forgot it
  Scenario: user enter a valid email
    Given user open browser3
    When user navigate to Password recovery page
    And user enter a valid Email "20194841@fue.edu.eg"
    And user click on recover button
    Then a successful message will be displayed to the user