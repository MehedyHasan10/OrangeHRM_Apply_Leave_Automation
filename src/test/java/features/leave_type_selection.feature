Feature: Apply Leave - Leave Type Selection
  This feature verifies that the user can select and change leave types in the Apply Leave form.

  Background:
    Given User is on the OrangeHRM login page
    When User enters username "Admin"
    And User enters password "admin123"
    And User clicks on login button
    Then Dashboard page should display "Dashboard" text
    And User clicks on the Leave option
    And User clicks on the Apply Leave option

  @TC_AL_003
  Scenario: Verify user can select different leave types
    When User clicks on the Leave Type dropdown
    Then Selected First Leave Type should be "CAN - Personal"
    When User clicks on the Leave Type dropdown again
    Then Selected Second Leave Type should be "CAN - FMLA"
    