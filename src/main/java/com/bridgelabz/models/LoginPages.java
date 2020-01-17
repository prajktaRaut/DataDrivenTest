package com.bridgelabz.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages{

    @FindBy(name = "email")
    WebElement userNameField;

    @FindBy(name = "pass")
    WebElement passwordField;

    @FindBy(id = "loginbutton")
    WebElement loginButton;

    public LoginPages(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setUserName(String userName)
    {
        userNameField.sendKeys(userName);
    }

    public void setPasswordField(String password)
    {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

}
