package com.bridgelabz.test;

import com.bridgelabz.base.BaseTest;
import com.bridgelabz.generic.ExcelData;
import com.bridgelabz.models.LoginPages;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @DataProvider(name = "testData")
    public Object[][] getData() {
        ExcelData config = new ExcelData(EXCELPATH);
        int rows = config.getrowcount(0);
        Object[][] credentials = new Object[rows][2];

        for(int i = 0; i < rows; ++i) {

                credentials[i][0] = config.getData(0, i, 0);
                credentials[i][1] = config.getData(0, i, 1);
        }
        return credentials;
    }

    @Test(dataProvider = "testData")
    public void getDataFromExcelFile(String username, String password) {


            LoginPages loginPages = new LoginPages(driver);
            loginPages.setUserName(username);
            loginPages.setPasswordField(password);
            loginPages.clickLoginButton();


    }
}
