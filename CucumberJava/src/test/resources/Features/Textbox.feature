Feature: Textbox test

  Scenario Outline: Enter values in textboxes
    Given user navigated to demoqa website
    And user clicks on Elements
    And user clicks on Textbox
    And user enters fullName as <fullName>
    And user enters email address as <email address>
    And user enters current address as <current address>
    And user enters permanent address as <permanent address>
    When user clicks on Submit
    Then All user entered details displayed

    Examples: 
      | fullName       | email address              | current address | permanent address |
      | Tony smith     | tonysmith123@yahoo.com     | some address    | some address      |
      | Brad Pitt      | bradpitt123@yahoo.com      | some address    | some address      |
      | Angelina Jolie | angelinajolie123@yahoo.com | some address    | some address      |
