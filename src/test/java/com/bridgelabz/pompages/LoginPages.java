package com.bridgelabz.pompages;

import com.bridgelabz.base.BaseTest;
import com.bridgelabz.base.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPages extends BaseTest {

    @DataProvider(name = "testData")
    public Object[][] getData() {
        Library config = new Library(EXCELPATH);
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
        try {
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys(username);
            WebElement pass = driver.findElement(By.id("pass"));
            pass.sendKeys(password);
            WebElement loginBtn = driver.findElement(By.id("loginbutton"));
            loginBtn.click();
            Thread.sleep(2000L);
            System.out.printf(driver.getTitle());
        } catch (InterruptedException var6) {
            var6.printStackTrace();
        }
    }
}
