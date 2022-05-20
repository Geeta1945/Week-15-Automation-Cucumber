Feature: Create Account Test
  As User I want to register into automation -practice website


  Scenario:User should create account successfully
  Given I am on homepage
    When I click On login link
    And I enter email address create account "Geeta1945p@gmail.com"
    And I click on "Create an account" button
    And I click on Gender Button
    And I enter first name "My First Name"
    And I enter last name "My Last Name"
    And I enter my password "MyTrickyPassword123"
    And I enter my address "107,My Road"
    And I enter my city "MyCity"
    And I select my state from dropdown "California"
    And I enter my postcode "36101"
    And I  enter Home Number "0123456789"
    And I enter Mobile number "0123456789"
    Then I click on register button
    And verify "MY ACCOUNT" message


