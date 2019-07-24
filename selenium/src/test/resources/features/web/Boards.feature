@boardsPage
Feature: Boards Page

  Background:
    Given the Trello home page is loaded
    When the user click the login button in the Trello homepage
    And the user enters "testgr100@gmail.com" in the email field in the Trello login page
    And the user enters "password1" in the password field in the Trello login page
    And the user clicks the login button in the Trello login page
    Then the user should successfully be logged in to Trello

  Scenario: User able to successfully create a new board and add a card
   When the user click the Create new board item in the Boards page
    And the user enters "Automation Board test" in the Add board title in the Create Board modal
    And the user chooses "public" for the Boards visibility option
    And the user click the Create Board button in the Boards page
    Then the "Automation Board test" trello board should be displayed
    When the user enters list title "Review automated test" in the Board page
    And the user clicks the Add List button in the Board page
    Then the Title "Review automated test" should be displayed in the Board page
    When the user clicks Add a card in the Board page
    And the user enters card title "Automated card" in the Board page
    And the user clicks the Add Card button in the Board page
    Then the Automated card "Automated card" should be displayed

  Scenario: User able to successfully create a new board and add multiple cards and multiple list
    When the user click the Create new board item in the Boards page
    And the user enters "Automation Board multilist" in the Add board title in the Create Board modal
    And the user chooses "public" for the Boards visibility option
    And the user click the Create Board button in the Boards page
    Then the "Automation Board multilist" trello board should be displayed
    When the user enters list title "Review automated multi" in the Board page
    And the user clicks the Add List button in the Board page
    Then the Title "Review automated multi" should be displayed in the Board page
    When the user clicks Add a card in the Board page
    And the user enters card title "Automated first multiple card" in the Board page
    And the user clicks the Add Card button in the Board page
    Then the Automated card "Automated first multiple card" should be displayed
    When the user clicks Add another list in the Board page
    And the user enters list title "Review automated multi list 2" in the Board page
    And the user clicks the Add List button in the Board page
    Then the Title "Review automated multi list 2" should be displayed in the Board page
    When the user clicks Add a card in the Board page
    And the user enters card title "Automated second multiple card list 2" in the Board page
    And the user clicks the Add Card button in the Board page
    Then the Automated card "Automated second multiple card list 2" should be displayed
    When the user enters list title "Review automated multi list 3" in the Board page
    And the user clicks the Add List button in the Board page
    Then the Title "Review automated multi list 3" should be displayed in the Board page

  Scenario: User able to drags cards in a Board
    When the user navigates to "https://trello.com/b/rwfzAzkt/automation-board-multilist"
    Then the "Automation Board multilist" trello board should be displayed
    And the user can drag "Automated first multiple card" card over to the "Review automated multi list 2" list
    And the user can drag "Automated first multiple card" card over to the "Review automated multi" list

  Scenario: User able to add card details and edit card details
    When the user navigates to "https://trello.com/b/rwfzAzkt/automation-board-multilist"
    Then the "Automation Board multilist" trello board should be displayed
    When the user clicks the "Automated first multiple card" card in the Board page
    Then the card detail window should be displayed
    When the user enters "This is an automated card test" in the description in the card detail window
    And the user clicks the save button
    And the user enters "This is an automated comment" in the comments section in the card detail window
    And the user clicks the save button for comments
    And the user closes the card detail window
    Then the card should now have the description icon displayed in the card in the Board page
    And the card should now have the comments icon displayed in the card in the Board page
    And the user should see "1" comment text displayed in the card
    When the user clicks the "Automated first multiple card" card in the Board page
    And the user clears the Description in the card detail window
    And the user clears the Comments in the card detail window
    And the user closes the card detail window
    Then the card should not have the description icon displayed in the card in the Board page



  Scenario: User able to send a Board Invite and remove a Board Invitee
    When the user navigates to "https://trello.com/b/rwfzAzkt/automation-board-multilist"
    Then the "Automation Board multilist" trello board should be displayed
    When the user clicks the Invite icon in the Board page
    And the user enter "galexholmes@gmail.com" in the email address in the Invite To Board pop up
    And the user clicks the Send Invite button in the Invite To Board pop up
    Then the membership invitee member should appear in the Board page
    When the user click the invitee member in the Board page
    And the user selects Remove from Board in the pop up
    And the user click the Remove Memeber button
    Then the invitee should be removed





























