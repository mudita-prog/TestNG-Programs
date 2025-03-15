package Assignment_67_AddProductToWishList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void precondition(String nameofbrowser)
	{
	 {
		if (nameofbrowser.equals("Chrome"))
		{
	    driver =  new ChromeDriver();
		}
		if (nameofbrowser.equals("Edge"))
		{
        driver =  new EdgeDriver();
		}
  		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}}
		
		@AfterMethod
		public void postTestActivities() throws InterruptedException
		{
		Thread.sleep(2000);
		driver.quit();

}
}