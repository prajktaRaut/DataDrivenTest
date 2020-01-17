package com.bridgelabz.base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;

public class ITestListener extends BaseTest implements org.testng.ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

       // getScreenShots();
        System.out.println(" In the OnTestStart Method "+result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    public void getScreenShots()
    {
        try {
            TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("/home/admin1/Documents/PrajktaRaut/SeleniumDemo/src/test/resources/ScreenShots/"+methodName+".jpg");
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
