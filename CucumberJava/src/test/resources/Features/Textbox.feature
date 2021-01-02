Feature: Textbox test
Scenario: Enter values in textboxes
Given user navigated to demoqa website
And user clicks on Elements
And user clicks on Textbox
And user enters fullName
And user enters email address
And user enters current address
And user enters permanent address
When user clicks on Submit
Then All user entered details displayed