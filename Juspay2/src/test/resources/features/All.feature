Feature: TutorialsNinja E-commerce Flow
  Scenario: Login, search product, add to cart, checkout
    Given User is on homepage
    When User clicks My Account and Login
    And User enters valid credentials
    And User searches for "iPhone" and clicks search
    And User adds product to cart and goes to shopping cart
    And User clicks on checkout button
    Then User should reach checkout page