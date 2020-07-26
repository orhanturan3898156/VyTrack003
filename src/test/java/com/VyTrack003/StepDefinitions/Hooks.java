package com.VyTrack003.StepDefinitions;

import com.VyTrack003.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().manage().window().fullscreen();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());

        }

        Driver.closeDriver();

    }


}
