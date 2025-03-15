package Assignments_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_71b_RetryTheFailedTestCases2 {
	
	@Test(retryAnalyzer = Assignments_TestNG.Assignment_71a_RetryTheFailedTestCases1.class)
	public void Search()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement SearchProduct = driver.findElement(By.name("qa"));
		SearchProduct.sendKeys(("India")+Keys.ENTER);
		
	}
	

}
