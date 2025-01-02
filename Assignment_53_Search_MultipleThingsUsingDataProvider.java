package Assignments_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Assignment_53_Search_MultipleThingsUsingDataProvider {
    
	@DataProvider (name="set1")
	public Object[][] method1()
	{
		return new Object[][] {{"India"}, {"Kashmir"}, {"Vietnam"}};
	}
	
	@DataProvider (name="set2")
	public Object[][] method2()
	{
		return new Object[][] {{1100}, {5001}, {1232}};
		
	}
/*	
	@Test(dataProvider = "set2")
	public void method2(int input)
	{
		int sum = 100+input;
		Reporter.log("Addition is _>" + sum);*/
	
	

	    @Test(dataProvider = "set1")
	    public void Search(String input) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement a1 = driver.findElement(By.name("q"));
		a1.sendKeys(input+ Keys.ENTER); 
		

	}

}
