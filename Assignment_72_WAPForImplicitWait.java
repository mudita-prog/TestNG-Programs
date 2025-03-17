package Maven_Project.Project1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_72_WAPForImplicitWait {
	
	@Test
	public void AddToCart()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement SearchAProduct = driver.findElement(By.id("twotabsearchtextbox"));
		SearchAProduct.sendKeys(("Shoe")+Keys.ENTER);

	    WebElement SelectProduct = driver.findElement(By.xpath("//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis puis-vxuo4i0smxoqo255pnzj7j19yb s-latency-cf-section puis-card-border']//img[@alt='Sponsored Ad - DOCTOR EXTRA SOFT Mens Running Shoe with Memory Foam Insole & Ultrasoft Outsole|Sports,Gym,Training,Walkin...']"));
		SelectProduct.click();
	
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 =s1.iterator();
		String parentId = i1.next();
		String childId = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);

		WebElement AddtoCart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		AddtoCart.click();
		
		driver.quit();
	}

}
