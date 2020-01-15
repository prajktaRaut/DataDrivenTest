package com.bridgelabz.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest implements IAutoConstant{

    String methodName=null;
    public WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    @BeforeMethod
    public void setUp(Method method) {

        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        driver.get(CONFIGPATH);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
