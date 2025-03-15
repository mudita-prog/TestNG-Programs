package Assignment_67_AddProductToWishList;

import java.util.Iterator;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit {
	WebDriver driver;
	@Test
	public void AddProductToWishList()
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
	    WebElement SearchProduct = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(SearchProduct.isEnabled(), "Search field is not editable");
		SearchProduct.sendKeys(("iphone")+Keys.ENTER);
		WebElement SelectFirstPhone = driver.findElement(By.xpath("//div[@class=\"sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16\"][1]"));
		SelectFirstPhone.click();
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
	    String parentId =  i1.next();
	    String childId =  i1.next();
	    System.out.println(parentId);
	    System.out.println(childId);
	    driver.switchTo().window(childId);
	    WebElement AddToWishList = driver.findElement(By.xpath("//div[@id=\"wishlistButtonStack\"]"));
	    AddToWishList.click();
	    Assert.assertTrue(AddToWishList.isDisplayed(), "Add To Wish List is not visible");
	    Assert.assertTrue(AddToWishList.isEnabled(), "Add To Wish List is not clickable");
	    
	    
}
}

