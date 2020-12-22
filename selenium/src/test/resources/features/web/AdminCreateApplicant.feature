@regression
Feature: Admin

  Background:
    Given the Catalyte Admin login page is loaded
    And the user enters "admin" in the username field in the Admin login page
    And the user enters "Admin" in the password field in the Admin login page
    And the user clicks the sign in button in the Admin login page
    Then the user should successfully be logged in to the Catalyte home page

  Scenario Outline: Admin able to create an applicant
    When the admin clicks the Create Account link in the Catalyte home page
    And the admin selects the Applicant Account link
    Then the admin should see the Create Account page
    When the admin enters "<first Name>" in the first name field in the Create Account page
    When the admin enters "<middle name>" in the middle name field in the Create Account page
    And the admin enters "<last Name>" in the last name field in the Create Account page
    And the admin enters "<email>" in the email field in the Create Account page
    And the admin enters "<password>" in the password field in the Create Account page
    And the admin enters "<confirm password>" in the confirm password field in the Create Account page
    And the admin selects the Chicago developer role in the Create Account page
    And the user clicks the create button in the Create Account page
    Then the new user should be created

    Examples:
    |first Name|middle name| last Name  |email       |username     |password |confirm password |
    |Automation|sdet       |Tester      |autotester  |automation   |password1|   password1    |

















