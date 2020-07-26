package com.VyTrack003.Pages;

import com.VyTrack003.Utilities.ConfigurationReader;
import com.VyTrack003.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "_username")
    public WebElement usernameInputBox;

    @FindBy(name = "_password")
    public WebElement passwordInputBox;

    @FindBy(id = "_submit")
    public WebElement submitButton;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;

    public static void login(String username, String password) {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

        if (username.equals("username_truckDriver")) {
            username = ConfigurationReader.getProperty("username_truckDriver");///user10
        } else if (username.equals("username_salesManager")) {
            username = ConfigurationReader.getProperty("username_salesManager");
        } else if (username.equals("username_storeManager")) {
            username = ConfigurationReader.getProperty("username_storeManager");
        }


        LoginPage loginPage = new LoginPage();

        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitButton.click();


    }


}
