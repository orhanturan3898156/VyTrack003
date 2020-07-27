package com.VyTrack003.StepDefinitions;

import com.VyTrack003.Pages.LoginPage;
import com.VyTrack003.Pages.SalesManagerHomePage;
import com.VyTrack003.Pages.StoreManagerHomePage;
import com.VyTrack003.Pages.TruckDriverHomePage;
import com.VyTrack003.Utilities.ConfigurationReader;
import com.VyTrack003.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VehicleOdometerStepDefinitions {
    LoginPage loginPage = new LoginPage();

    TruckDriverHomePage truckDriverHomePage = new TruckDriverHomePage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    SalesManagerHomePage salesManagerHomePage = new SalesManagerHomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    Actions actions = new Actions(Driver.getDriver());


    @When("truck driver is on the home page")

    public void truck_driver_is_on_the_home_page() {

        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

    }

    @Then("truck driver should enter valid username")
    public void truck_driver_should_enter_valid_username() {
        String username = ConfigurationReader.getProperty("username_truckDriver");
        loginPage.usernameInputBox.sendKeys(username);

    }

    @Then("truck driver should enter valid password")
    public void truck_driver_should_enter_valid_password() {

        String password = ConfigurationReader.getProperty("password");
        loginPage.passwordInputBox.sendKeys(password);

    }

    @Then("truck driver should click on the login button")
    public void truck_driver_should_click_on_the_login_button() {

        loginPage.submitButton.click();

    }

    @Then("truck driver should hover over to Fleet module")
    public void truck_driver_should_hover_over_to_fleet_module() {
        actions.moveToElement(TruckDriverHomePage.fleetModule).perform();

    }

    @Then("truck driver should select Vehicle Odometer link")
    public void truck_driver_should_select_vehicle_odometer_link() {
        truckDriverHomePage.vehicleOdometerLink.click();

    }

    @Then("truck driver should see Vehicle Odometer in the title")
    public void truck_driver_should_see_vehicle_odometer_in_the_title() {
        String expectedInTitle = "Vehicle Odometer";
        wait.until(ExpectedConditions.titleContains(expectedInTitle));
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


    @When("store manager log in to account successfully")
    public void storeManagerLogInToAccountSuccessfully() {
        LoginPage.login("username_storeManager", "password");
    }

    @Then("store manager should hover over to Fleet Module")
    public void storeManagerShouldHoverOverToFleetModule() {
        actions.moveToElement(truckDriverHomePage.fleetModule).perform();
    }

    @Then("store manger should select Vehicle Odometer link")
    public void storeMangerShouldSelectVehicleOdometerLink() {
        storeManagerHomePage.vehicleOdometerLink.click();
    }

    @Then("store manager should see message")
    public void storeManagerShouldSeeMessage() {
        Assert.assertTrue(storeManagerHomePage.message.isDisplayed());
    }

    @When("sales manager log in to account successfully")
    public void salesManagerLogInToAccountSuccessfully() {
        LoginPage.login("username_salesManager", "password");
    }

    @Then("sales manager should hover over to Fleet Module")
    public void salesManagerShouldHoverOverToFleetModule() {
        actions.moveToElement(salesManagerHomePage.fleetModule).perform();
    }

    @Then("sales manger should select Vehicle Odometer link")
    public void salesMangerShouldSelectVehicleOdometerLink() {
        salesManagerHomePage.vehicleOdometerLink.click();
    }

    @Then("sales manager should see message")
    public void salesManagerShouldSeeMessage() {
        Assert.assertTrue(salesManagerHomePage.message.isDisplayed());
    }
}
