Feature: Apply Leave - Empty Fields Validation
  This feature verifies that all mandatory fields in the Apply Leave form are required.

  Background:
    Given User is on the OrangeHRM login page
    When User enters username "Admin"
    And User enters password "admin123"
    And User clicks on login button
    Then Dashboard page should display "Dashboard" text
    And User clicks on the Leave option
    And User clicks on the Apply Leave option

  @TC_AL_002
  Scenario: Verify all mandatory fields are required
    When User submits the Apply Leave form without filling any fields
    Then Error message "Required" should be displayed for Leave Type
    And Error message "Required" should be displayed for From Date
    And Error message "Required" should be displayed for To Date
    And The form should remain on the Apply Leave page
