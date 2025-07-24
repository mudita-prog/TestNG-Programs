package Assignments_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Assignments_TestNG.Assignment_86a_ListenersLogic.class)
public class Assignment_86b_ListenersLogic {

    // ✅ Shared driver so listener can use it
    public static WebDriver driver;

    @BeforeMethod
    public void Testing() {
        driver = new EdgeDriver(); // ✅ Assign to class-level driver
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(3000); // Optional: for observing before quit
        driver.quit();
    }
}
