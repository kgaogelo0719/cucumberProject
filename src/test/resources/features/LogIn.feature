Feature: Login

  Scenario Outline: As a user I want to log into saucedemo successfully.
    Given I am on the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click on the login button
    Then I should be taken to the products page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#      | problem_user | secret_sauce |
#      | performance_glitch_user | secret_sauce |


#  Scenario : As a user, I want to add a product to my cart.
#    Given I am on the products page
#    And I add the product <product> to the cart
#    When I click on the cart button
#    Then I should be taken to the cart page
#    And I should see the product <product> in the cart

