package Assignments_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_52_UsingBeforeMethodAfterMethod_Test_AddAnItemToWIshlist {
	
	@BeforeMethod
    public void LaunchBrowser()
    {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
    }
	@Test		
	 public void AddProductToWishlist()
	 {ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]"));
		e2.click();
		
		Set <String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentID = i1.next();
		String childID = i1.next();
		System.out.println(parentID);
		System.out.println(childID);
		driver.switchTo().window(childID);
		
		WebElement e3 = driver.findElement(By.xpath("//span[@id=\"wishListMainButton\"]"));
		e3.click();
		
	 }
	
	@AfterMethod
	
		public void Close_the_Browser()
		{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.close();
		
	}
}
































