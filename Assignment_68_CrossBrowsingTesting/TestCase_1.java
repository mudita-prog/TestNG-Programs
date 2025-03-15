package Assignment_68_CrossBrowsingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_1 extends Launch_Quit {
	
	@Test
	public void SearchProduct()
	{
		WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(ProductSearch.isEnabled(), "Product Search is not editable");
		ProductSearch.sendKeys(("Lipstick")+ Keys.ENTER);
	
	}

}
