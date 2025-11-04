Feature: Apply Leave functionality in OrangeHRM
  This feature verifies the login process and Apply Leave module functionalities.

  Background:
    Given User is on the OrangeHRM login page
    When User enters username "Admin"
    And User enters password "admin123"
    And User clicks on login button

  @TC_AL_001
  Scenario: Verify user can login and navigate to Apply Leave page
    Then Dashboard page should display "Dashboard" text
    When User clicks on the Leave option
    Then Leave page should display "Leave" text
    When User clicks on the Apply Leave option
    Then Apply Leave page should display "Apply Leave" text
