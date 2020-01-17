package com.bridgelabz.base;

import com.bridgelabz.properties.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTest implements IAutoConstant{

    public String methodName=null;
    public WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    @BeforeMethod
    public void setUp(Method method) {

        methodName=method.getName();
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        driver = new ChromeDriver(options);
        String url = Library.getProperty(CONFIGPATH,"url");
        driver.get("https://www.facebook.com");
    }


    @AfterMethod
    public void tearDown() {

        driver.close();
        driver.quit();
    }
}
