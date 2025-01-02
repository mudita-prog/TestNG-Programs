package Assignments_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_51_CheckExecution_LaunchBrowser{
	
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
	}
	
	
	@Test
	public void LoginToAmazon() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("Mobiles"));
		e1.click();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void LoginToAmazonAndAddProductToWishlist() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
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
		
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void Close_Browser()
	{
		ChromeDriver driver = new ChromeDriver();
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
		driver.quit();
	}
}