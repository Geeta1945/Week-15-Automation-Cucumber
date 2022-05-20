Feature: Login Test
  As User I want to login into autoamation-practice website


  Scenario: User should navigate tp sign in page successfully
    Given I am on homepage
    When I click On login link
    Then I verify "AUTHENTICATION" message
    And I should navigate to  login page successfully



Scenario: User should login successfully with valid credentials
  Given I am on homepage
  When I click On login link
  And I enter email address "Geeta1945p@gmail.com"
  And I enter password "Geeta1945"
  And I click on sign in button
  Then I verify "Sign out"



    Scenario: User should log out successfully
      Given I am on homepage
      When I click On login link
      And I enter email address "Geeta1945p@gmail.com"
      And I enter password "Geeta1945"
      And I click on sign in button
      Then I click on Log out button

  @test2
    Scenario Outline: Verify the error message with valid credentials displayed
      Given I am on homepage
      When I click On login link
      And I enter email address "<username>"
      And I enter password "<password>"
      And I click on sign in button
      Then I Verify "<message>" error message

    Examples:
      | username | password | message |
      | | 123456 | An email address required. |
      | abcd@gmail.com | | Password is required. |
      | adfdfgfg | 123456 | Invalid email address. |
      | abcd@gmail.com | 123456 | Authentication failed. |


  

