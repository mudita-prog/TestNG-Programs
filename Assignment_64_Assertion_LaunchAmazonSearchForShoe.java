package Assignments_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_64_Assertion_LaunchAmazonSearchForShoe {
	
	@Test
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		
e1.sendKeys("shoe");


List<WebElement> l1=driver.findElements(By.tagName("a"));
	int count=l1.size();
	System.out.println(count);
    Assert.assertEquals(l1.size()>25,true);
	}
}
