package com.VyTrack003.StepDefinitions;

import com.VyTrack003.Pages.LoginPage;
import com.VyTrack003.Pages.TruckDriverHomePage;
import com.VyTrack003.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleFuelLogStepDefinitions {
    TruckDriverHomePage truckDriverHomePage = new TruckDriverHomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @When("truck driver log in to account successfully")
    public void truck_driver_log_in_to_account_successfully() {

        LoginPage.login("username_truckDriver", "password");

    }


    @Then("truck driver should select Vehicle Fuel Log link")
    public void truck_driver_should_select_vehicle_fuel_log_link() {
        truckDriverHomePage.vehicleFuelLogLink.click();

    }

    @Then("truck driver should see Vehicle Fuel Logs in the title")
    public void truck_driver_should_see_vehicle_fuel_logs_in_the_title() {
        String expectedInTitle = "Vehicle Fuel Logs";
        wait.until(ExpectedConditions.titleContains(expectedInTitle));


        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


    @Then("store manager should select Vehicle Fuel Log link")
    public void storeManagerShouldSelectVehicleFuelLogLink() {


    }

    @Then("sales manager should select Vehicle Fuel Log link")
    public void salesManagerShouldSelectVehicleFuelLogLink() {


    }
}
