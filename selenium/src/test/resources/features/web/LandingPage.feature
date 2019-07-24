@homePage
Feature: Home Page

  Background:
    Given the Trello home page is loaded

  Scenario: Verify headers and text in trello home page
    Then the user should see header "Work with any team" displayed in the Trello homepage
    And the user should see text "Whether it’s for work, a side project or even the next family vacation, Trello helps your team stay organized." displayed in the Trello homepage
    Then the user should see header "Information at a glance" displayed in the Trello homepage
    And the user should see text "Dive into the details by adding comments, attachments, due dates, and more directly to Trello cards. Collaborate on projects from beginning to end." displayed in the Trello homepage
    Then the user should see header "See how it works" displayed in the Trello homepage
    And the user should see text "Go from idea to action in seconds with Trello’s intuitively simple boards, lists, and cards." displayed in the Trello homepage
    Then the user should see header "Trello your way" displayed in the Trello homepage
    And the user should see text "Use Trello the way your team works best. We’ve got the flexibility & features to fit any team’s style." displayed in the Trello homepage
    And the user should see subheader "The Team Playbook" displayed in the Trello homepage
    And the user should see small text "" displayed in the Trello homepage
    And the user should see subheader "A Productivity Platform" displayed in the Trello homepage
    And the user should see subheader "Always In Sync" displayed in the Trello homepage

















