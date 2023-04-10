@ZLATAN
Feature: Logged user could add different products to Shopping cart
  Background: open browser and login
    And USEr login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User Add product to cart
    Given navigate to shoes page and shoes one
    When User open dropdown list and choose the size
    And Click on add to cart button
    And successfully added
    When User navigate to home and choose a phone to add to cart
    And Click on add to Cart button
    Then successfully added notification

