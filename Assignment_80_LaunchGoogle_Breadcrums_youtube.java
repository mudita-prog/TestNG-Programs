package Assignments_TestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_80_LaunchGoogle_Breadcrums_youtube {
	
	@Test

	public void Iframe() throws InterruptedException {
		
		WebDriver driver;
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Thread.sleep(1000);
		
		
		WebElement StaySignedOut = driver.findElement(By.xpath("(//div[@class='niO4u VDgVie SlP8xc'])[1]"));
		StaySignedOut.click();
		
		WebElement Breadcrums = driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']"));
		Breadcrums.click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(iframe);
		
		WebElement YouTube = driver.findElement(By.xpath("//a[.='YouTube']"));
		YouTube.click();
	
		
	    String s1 = driver.getWindowHandle();
	    driver.switchTo().window(s1);
	        
		
		 WebElement searchBox =driver.findElement(By.xpath("//input[@name='search_query']"));
	     searchBox.sendKeys("India" + Keys.ENTER);

	      
	        Thread.sleep(3000);

;
		
	}
}
