Feature: Select product from Woman tab
  As User I want to select product from woman tab


  Scenario Outline: User should  add product to the cart successfully
    Given I am on homepage
    When I click on woman tab
    And I click on product "<product>"
    And I select quantity "<qty>"
    And I select size "<size>"
    And I select colour "<colour>"

    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |
