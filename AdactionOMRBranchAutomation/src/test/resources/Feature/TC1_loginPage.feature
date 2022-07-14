@Login @RunAll
Feature: Verifying Adactin Hotel Login Page

  Scenario Outline: Verify Adactin Login With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"

    Examples: 
      | UserName       | Password       |
      | Selvafrench123 | Selvafrench123 |

  Scenario Outline: Verify Adactin Login With Valid Credentials With ENTER key
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>" With Help of ENTER key
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"

    Examples: 
      | UserName       | Password       |
      | Selvafrench123 | Selvafrench123 |

  Scenario Outline: Verify Adactin Login With Invalid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>" with in valid details
    Then User Should Verify Login Error Message Contains After Login "Invalid "

    Examples: 
      | UserName       | Password      |
      | Selvafrench123 | Selvafrench12 |
