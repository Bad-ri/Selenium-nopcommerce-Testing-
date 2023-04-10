@ZLATAN
Feature: Logged user could select different Categories
  Background: open browser and login
    And uSer login in the system "20199999@fue.edu.eg" and "MohamedElbadri"
  Scenario: User change the currency
    Given NAvigate to Home page
    When User click on a category
    And User click on a subcategory
    Then successfully page oppened