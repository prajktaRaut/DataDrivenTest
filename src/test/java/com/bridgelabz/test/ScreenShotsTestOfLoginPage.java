package com.bridgelabz.test;

import com.bridgelabz.base.BaseTest;
import com.bridgelabz.models.LoginPages;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.bridgelabz.base.ITestListener.class)
public class ScreenShotsTestOfLoginPage extends BaseTest {

    @Test
    public void getScreenShotsUsingITestListener() {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.setUserName("9764324126");
        loginPages.setPasswordField("Psraut@123");
        loginPages.clickLoginButton();
    }

}
