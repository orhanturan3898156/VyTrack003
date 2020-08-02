Feature: Vehicle under Fleet Module
  Agile Story1:As a truck driver I should be able to access Vehicle under Fleet module

  @wip
  Scenario: Verify that truck driver should be able to see all Vehicle information once navigate to Vehicle page.
    When truck driver log in to account successfully
    Then truck driver should hover over to Fleet module
    Then truck driver should select Vehicle link under Fleet module
    Then truck driver should see total number of records
