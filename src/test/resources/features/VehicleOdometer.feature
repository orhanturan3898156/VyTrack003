@VehicleOdometer
Feature: Vehicle Odometer page
  Story No4: As an authorized user I should be access to Vehicle odometer page

  @vehicleOdometer-TruckDriver
  Scenario: Verify that Only truck driver can access to vehicle odometer page
    When truck driver is on the home page
    Then truck driver should enter valid username
    Then truck driver should enter valid password
    Then truck driver should click on the login button
    Then truck driver should hover over to Fleet module
    Then truck driver should select Vehicle Odometer link
    Then truck driver should see Vehicle Odometer in the title

  @vehicleOdometer-StoreManager
  Scenario: Verify that Store manager not able to access Vehicle odometer page
    When store manager log in to account successfully
    Then store manager should hover over to Fleet Module
    Then store manger should select Vehicle Odometer link
    Then store manager should see message

  @vehicleOdometer-SalesManager
  Scenario: Verify that sales manager not able to access Vehicle odometer page
    When sales manager log in to account successfully
    Then sales manager should hover over to Fleet Module
    Then sales manger should select Vehicle Odometer link
    Then sales manager should see message




