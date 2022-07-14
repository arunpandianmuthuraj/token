@BookHotel @RunAll
Feature: Verifying Adactin Hotel Booking Page

  Scenario Outline: Verify Adactin Hotel Booking Page With Valid Credentials
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
      | VISA             | 1234567887654358 | January | 2022 |   321 |
      | Master Card      | 1234567887654321 | January | 2022 |   321 |
    Then User Should Verify Message After Booking "Booking Confirmation"

    Examples: 
      | UserName       | Password       | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | Address |
      | Selvafrench123 | Selvafrench123 | London   | Hotel Creek | Standard | 1 - One  | 21/06/2022 | 23/06/2022 | 2 - Two       | 1 - One         | barath    | c        | chennai |

  Scenario Outline: Verify Adactin Hotel Booking Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    And User Should Verify Welcome Message After Login "Hello Selvafrench123!"
    And User Should Fill & Submit All Feilds In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NoOfRoom>","<Check-in>","<Check-out>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify Message After Select "Book A Hotel"
    And User Should Book Hotel Without Filling All Mandatory Feilds
    Then User Should Verify All Error Message After Booking "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | UserName       | Password       | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom |
      | Selvafrench123 | Selvafrench123 | London   | Hotel Creek | Standard | 1 - One  | 21/06/2022 | 23/06/2022 | 2 - Two       | 1 - One         |

      
      
      
      
      
      
      
      
      
      
      
      
      