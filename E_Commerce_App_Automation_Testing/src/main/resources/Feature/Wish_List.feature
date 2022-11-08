@ZLATAN
Feature: Logged user could add different products to Wishlist
  Background: open browser and login
    Given User open the browser10
    And USER Login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User Add products to Wishlist
    Given Navigate to shoes page and choose one
    When User opens dropdown list and choose the size
    And Click on add to wishlist button
    And successfully added to wishlist
    When User navigate to Home and choose a phone to add to wishlist
    And Click on add to wishlist
    Then successfully added to wishlist NOTIFICATION