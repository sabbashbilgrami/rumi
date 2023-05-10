Feature: Test Demo99 register

  Scenario: Test Contact Information
    When user is on Demo99 register page
    Then user enter firstname and lastname
    And mobile number and email address

  Scenario: Test Mailing Information
    Then user enter Address and City
    And user enter State and Postal code
    And user selects the City

  Scenario: Test User Information
    Then user enter Username
    And user enter password and confirm password
    Then user click on submit

  Scenario: Test Success Page
    Then verify success page URL
    And verify user firstname and lastname
    And verify user email address
