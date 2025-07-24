package Assignments_TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Assignment_86a_ListenersLogic implements ITestListener {

    WebDriver driver;

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("✅ Test Case Passed: " + result.getName(), true);
        driver = Assignment_86b_ListenersLogic.driver;
        takeScreenshot("PASS_" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("❌ Test Case Failed: " + result.getName(), true);
        driver = Assignment_86b_ListenersLogic.driver;
        takeScreenshot("FAIL_" + result.getName());
    }

    private void takeScreenshot(String fileNamePrefix) {
        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // ✅ Screenshot saved with status and unique name
            File destination = new File("C:\\Users\\hp\\Desktop\\Listeners_Logic\\"
                    + fileNamePrefix + "_" + System.currentTimeMillis() + ".jpg");

            try {
                FileHandler.copy(source, destination);
                Reporter.log("📸 Screenshot saved: " + destination.getAbsolutePath(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Reporter.log("⚠️ WebDriver is null. Screenshot not taken.", true);
        }
    }
}
