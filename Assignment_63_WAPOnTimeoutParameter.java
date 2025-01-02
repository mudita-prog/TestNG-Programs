package Assignments_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_63_WAPOnTimeoutParameter {
	@Test(timeOut=10000)
	public void Login()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.close();
	}


}
