package Assignments_TestNG;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;
	
	public class Assignment_85_RobotClass {
	@Test
	
	public void MoveTheSlider() throws InterruptedException, AWTException
	{
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement a1 = driver.findElement(By.id("twotabsearchtextbox"));
		a1.sendKeys(("Shoe")+Keys.ENTER);
		
		WebElement price = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
		
		Actions Ac = new Actions(driver);
		Ac.doubleClick(price).perform();
				
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<=50;i++)
		{
			Thread.sleep(100);
			r1.keyPress(KeyEvent.VK_LEFT);
		}
	}
		
	}


