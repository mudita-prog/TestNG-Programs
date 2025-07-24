package Assignments_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_86c_ListenersLogic extends Assignment_86b_ListenersLogic {

    @Test
    public void Hover_Over() {
        WebElement HoverOverOnAccount = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1 = new Actions(driver);
        a1.moveToElement(HoverOverOnAccount).perform();
    }
}
