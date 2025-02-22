package Assignment_66_ParallelTesting_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_3  {
	WebDriver driver;
	@Test
	public void AddProducttoCart() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(ProductSearch.isEnabled(), "SearchField is not editable");
		ProductSearch.sendKeys(("Lipstick")+ Keys.ENTER);
		WebElement AddProductToCart = driver.findElement(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20'][1]"));
		AddProductToCart.click();
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator <String> i1 = s1.iterator();
		String parentID = i1.next();
		String childID = i1.next();
		System.out.println(parentID);
		System.out.println(childID);
		driver.switchTo().window(childID);
		
		WebElement AddToCartButton = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		Assert.assertTrue(AddToCartButton.isDisplayed(), "Add to cart button is not showing");
		AddToCartButton.click();

	    Thread.sleep(6000);
	
	}
}
