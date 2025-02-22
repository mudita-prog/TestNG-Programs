package Assignment_66_ParallelTesting_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_1 extends Launch_Quit {
	
	@Test
	public void LoginToAmazon() throws InterruptedException
	{
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
        Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
        SignInButton.sendKeys(Keys.ENTER);
    	WebElement UserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
    	Assert.assertTrue(UserName.isDisplayed(), "Username field is not displayed");
    	Assert.assertTrue(UserName.isEnabled(), "Username field is not clickable");
		UserName.sendKeys("9717377131");
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		Assert.assertTrue(ContinueButton.isDisplayed(), "Continue Button is not visible");
		Assert.assertTrue(ContinueButton.isEnabled(), "Continue Button is not clickable");
		ContinueButton.click();
        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    password.sendKeys("Qazwsx123@");
	    Assert.assertTrue(password.isEnabled(), "password field is not clickable");
	    WebElement signinButton = driver.findElement(By.id("auth-signin-button"));
	    Assert.assertTrue(signinButton.isEnabled(), "signinButton field is not clickable");
	    signinButton.click();
	    
	    Thread.sleep(6000);
	}

}
