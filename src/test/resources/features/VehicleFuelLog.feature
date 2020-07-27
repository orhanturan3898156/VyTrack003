Feature: Vehicle Fuel Logs

  Agile Story9: As an authorized user I should be able to access Vehicle Fuel logs

  @vehicleFuelLog-TruckDriver
  Scenario: Verify that truck driver user can access Vehicle Fuel logs
    When truck driver log in to account successfully
    Then truck driver should hover over to Fleet module
    Then truck driver should select Vehicle Fuel Log link
    Then truck driver should see Vehicle Fuel Logs in the title

  @vehicleFuelLog-StoreManager
  Scenario: Verify that store manager cannot access Vehicle Fuel logs
    When store manager log in to account successfully
    Then store manager should hover over to Fleet Module
    Then store manager should select Vehicle Fuel Log link
    Then store manager should see message


  @vehicleFuelLog-SalesManager
  Scenario: Verify that sales manager cannot access Vehicle Fuel logs
    When sales manager log in to account successfully
    Then sales manager should hover over to Fleet Module
    Then sales manager should select Vehicle Fuel Log link
    Then store manager should see message