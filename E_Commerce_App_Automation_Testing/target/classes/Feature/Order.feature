Feature: Create successful Order
  Background: open browser and login
    Given User open the browser12
    And USER LOGIN in the system "20198889@fue.edu.eg" and "MohamedElbadri"
  Scenario: User Create successful Order
    Given Go to Home page
    When Go to electronics category and open phone subcategory
    And Choose a phone and click on add to cart button
    And open Cart page and scroll down
    And accept the terms and click on go to chekout button
    And Enter the personal information city "cairo" address "faysal" zipcode "12345" pone "01000050000"
    And press on continue button
    Then press on continue buttons till the success message displayed

