package com.VyTrack003.Pages;

import com.VyTrack003.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TruckDriverHomePage {

    public TruckDriverHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public static WebElement fleetModule;


    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicleOdometerLink;

    @FindBy(xpath = "//span[.='Vehicles Fuel Logs']")
    public WebElement vehicleFuelLogLink;

}
