package Assignments_TestNG;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Assignment_84_RightClickOnGmail_ {

	    public static void main(String[] args) throws AWTException, InterruptedException {

	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");

	        
	        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

	       
	        Actions actions = new Actions(driver);
	        actions.contextClick(gmailLink).perform(); // right-click

	       
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);

	        Thread.sleep(300);

	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);

	        Thread.sleep(300);

	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);

	        Thread.sleep(300);

	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	    
	    }
	}


