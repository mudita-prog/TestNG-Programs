package Assignment_69_AddProductToWishlist;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearch extends LaunchAndQuit {
	
	@Test
	public void Product_Search()
	{
	
		WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextboxtwotabsearchtextbox"));
		Assert.assertTrue(ProductSearch.isEnabled(), "Product Search is not editable");
		ProductSearch.sendKeys(("Shoe")+Keys.ENTER);
		WebElement SelectProduct = driver.findElement(By.xpath("//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"][1]"));
		SelectProduct.click();
		
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
		String parentId = i1.next();
		String childId = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		
	    driver.switchTo().window(childId);
	    WebElement WishListButton = driver.findElement(By.id("wishListMainButton"));
	    WishListButton.click();
		
	}

}
