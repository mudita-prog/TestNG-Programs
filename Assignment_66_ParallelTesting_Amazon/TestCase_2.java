package Assignment_66_ParallelTesting_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_2 extends Launch_Quit {
	
	@Test
	public void ProductSearch()
	{
		WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(ProductSearch.isEnabled(), "SearchField is not editable");
		ProductSearch.sendKeys(("Lipstick")+ Keys.ENTER);
	}

}
