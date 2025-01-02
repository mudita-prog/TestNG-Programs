package Assignments_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_56_SearchSomethingOnAmazonWith10Inputs {
	@DataProvider (name = "set1")
	public Object[][] method1()
	{
		return new Object[][] {{"Shoe"},{"Lipstick"},{"Bags"},{"Bedsheet"},{"Heater"},{"Jacket"},{"Heels"},{"Nails"},{"Tops"},{"dresses"}};
	}	
		
	@Test(dataProvider ="set1" )
	public void Search(String input)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("twotabsearchtextbox"));
		a1.sendKeys(input + Keys.ENTER);
	}
	

}
