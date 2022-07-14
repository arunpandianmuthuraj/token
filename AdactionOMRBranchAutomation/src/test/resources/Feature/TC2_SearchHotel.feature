@searchHotel @RunAll
Feature: Verifying Adactin Hotel Search Page

  Scenario Outline: Verify Adactin Search Hotel Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Fill & Submit All Feilds In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NoOfRoom>","<Check-in>","<Check-out>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should Verify Message After Search "Select Hotel"

    Examples: 
      | UserName       | Password       | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom |
      | Selvafrench123 | Selvafrench123 | London   | Hotel Creek | Standard | 2 - Two  | 21/06/2022 | 23/06/2022 | 2 - Two       | 1 - One         |

  Scenario Outline: Verify Adactin Search Hotel Page With Mandatory Feilds Only
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Fill & Submit Only Mandatory Feilds In Search Hotel Page "<Location>","<NoOfRoom>","<Check-in>","<Check-out>" and "<AdultsPerRoom>"
    Then User Should Verify Message After Search "Select Hotel"

    Examples: 
      | UserName       | Password       | Location | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom |
      | Selvafrench123 | Selvafrench123 | London   | 2 - Two  | 21/06/2022 | 23/06/2022 | 2 - Two       |

  Scenario Outline: Verify Adactin Search Hotel Page With Invalid CheckIn & CheckOut Date
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Fill & Submit Only Mandatory Feilds In Search Hotel Page "<Location>","<NoOfRoom>","<Check-in>","<Check-out>" and "<AdultsPerRoom>"
    Then User Should Verify Invalid Date Error Message After Search "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | UserName       | Password       | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom |
      | Selvafrench123 | Selvafrench123 | London   | Hotel Creek | Standard | 1 - One  | 21/06/2024 | 23/06/2022 | 2 - Two       | 1 - One         |

  Scenario Outline: Verify Adactin Search Hotel Page Without Filling Any Details
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Submit Search Hotel Page Without Filling Any Details
    Then User Should Verify  Error Message After Search "Please Select a Location"

    Examples: 
      | UserName       | Password       |
      | Selvafrench123 | Selvafrench123 |
