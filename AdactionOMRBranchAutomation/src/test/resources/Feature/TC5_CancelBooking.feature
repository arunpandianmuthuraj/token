@cancelpage @RunAll
Feature: Verifying Adactin Hotel Cancel Page

  Scenario Outline: Verify Adactin Hotel Cancelling Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Fill & Submit All Feilds In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NoOfRoom>","<Check-in>","<Check-out>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify Message After Select "Book A Hotel"
    And User Should Book Hotel "<FirstName>","<LastName>" and "<Address>"
      | CreditCardType   | CreditCardNo     | Month   | Year | CCVNo |
      | American Express | 1234567887654321 | January | 2022 |   321 |
      | VISA             | 1234567887654321 | January | 2022 |   321 |
      | Master Card      | 1234567887654321 | January | 2022 |   321 |
    Then User Should Verify Message After Booking "Booking Confirmation"
    And User Should Cancel The Order Id
    Then User Should Verify Message After Cancelling "The booking has been cancelled."
					

    Examples: 
      | UserName       | Password       | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | Address |
      | Selvafrench123 | Selvafrench123 | London   | Hotel Creek | Standard | 1 - One  | 21/06/2022 | 23/06/2022 | 2 - Two       | 1 - One         | barath    | c        | chennai |

  Scenario Outline: Verify Adactin Hotel Cancelling Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Cancel The Previously Booked Order Id "<Order Id>"
    

    Examples: 
      | UserName       | Password       | Order Id   |
      | Selvafrench123 | Selvafrench123 | 8A27H37D61 |
