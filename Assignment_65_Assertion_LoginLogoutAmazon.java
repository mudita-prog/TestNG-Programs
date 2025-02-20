package Assignments_TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_65_Assertion_LoginLogoutAmazon {
/*
	@Test(priority=1)
	public void LaunchingBrowser()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
		
			@Test(priority=2)
			public void HoverOver_Fuctionality() 
			{
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
			}
		
			@Test(priority=3)
			public void ClickOnSignInButton() 
			{
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
				Actions a1 = new Actions(driver);
				a1.moveToElement(e1).perform();
				Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
		        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
	            Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
	            SignInButton.sendKeys(Keys.ENTER);
		
			}
   
        @Test(priority=4)
        public void EnterUserName() {
        	
        	EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(e1).perform();
			Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
	        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
            Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
            SignInButton.sendKeys(Keys.ENTER);
        	WebElement UserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        	Assert.assertTrue(UserName.isDisplayed(), "Username field is not displayed");
        	Assert.assertTrue(UserName.isEnabled(), "Username field is not clickable");
    		UserName.sendKeys("9717377131");
    		WebElement ContinueButton = driver.findElement(By.id("continue"));
    		Assert.assertTrue(ContinueButton.isDisplayed(), "Continue Button is not visible");
    		Assert.assertTrue(ContinueButton.isEnabled(), "Continue Button is not clickable");
    		ContinueButton.click();
    		
        }
		
        @Test(priority=5)
        public void EnterPassword() {
        	
        	EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(e1).perform();
			Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
	        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
            Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
            SignInButton.sendKeys(Keys.ENTER);
        	WebElement UserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        	Assert.assertTrue(UserName.isDisplayed(), "Username field is not displayed");
        	Assert.assertTrue(UserName.isEnabled(), "Username field is not clickable");
    		UserName.sendKeys("9717377131");
    		WebElement ContinueButton = driver.findElement(By.id("continue"));
    		Assert.assertTrue(ContinueButton.isDisplayed(), "Continue Button is not visible");
    		Assert.assertTrue(ContinueButton.isEnabled(), "Continue Button is not clickable");
    		ContinueButton.click();
	        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		    password.sendKeys("Qazwsx123@");
		    Assert.assertTrue(password.isEnabled(), "password field is not clickable");
		    WebElement signinButton = driver.findElement(By.id("auth-signin-button"));
		    Assert.assertTrue(signinButton.isEnabled(), "signinButton field is not clickable");
		    signinButton.click();
    }
		    
	 @Test(priority=6)
     public void LoginAndSearchProduct() {
	
		EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(e1).perform();
			Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
	        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
            Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
            SignInButton.sendKeys(Keys.ENTER);
        	WebElement UserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        	Assert.assertTrue(UserName.isDisplayed(), "Username field is not displayed");
        	Assert.assertTrue(UserName.isEnabled(), "Username field is not clickable");
    		UserName.sendKeys("9717377131");
    		WebElement ContinueButton = driver.findElement(By.id("continue"));
    		Assert.assertTrue(ContinueButton.isDisplayed(), "Continue Button is not visible");
    		Assert.assertTrue(ContinueButton.isEnabled(), "Continue Button is not clickable");
    		ContinueButton.click();
	        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		    password.sendKeys("Qazwsx123@");
		    Assert.assertTrue(password.isEnabled(), "password field is not clickable");
		    WebElement signinButton = driver.findElement(By.id("auth-signin-button"));
		    Assert.assertTrue(signinButton.isEnabled(), "signinButton field is not clickable");
		    signinButton.click();
		    WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		    Assert.assertTrue(ProductSearch.isEnabled(), "Search feld is editable");
		    ProductSearch.sendKeys(("Lipstick")+Keys.ENTER);
		   }
		    */
		
		
	 @Test(priority=7)
     public void SignOut() {
	
		EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(e1).perform();
			Assert.assertTrue(e1.isDisplayed(),"Hoverover is working");
	        WebElement SignInButton = driver.findElement(By.partialLinkText("Sign in"));
            Assert.assertTrue(SignInButton.isEnabled(), "Sign in button is not clickable!");
            SignInButton.sendKeys(Keys.ENTER);
        	WebElement UserName = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        	Assert.assertTrue(UserName.isDisplayed(), "Username field is not displayed");
        	Assert.assertTrue(UserName.isEnabled(), "Username field is not clickable");
    		UserName.sendKeys("9717377131");
    		WebElement ContinueButton = driver.findElement(By.id("continue"));
    		Assert.assertTrue(ContinueButton.isDisplayed(), "Continue Button is not visible");
    		Assert.assertTrue(ContinueButton.isEnabled(), "Continue Button is not clickable");
    		ContinueButton.click();
	        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		    password.sendKeys("Qazwsx123@");
		    Assert.assertTrue(password.isEnabled(), "password field is not clickable");
		    WebElement signinButton = driver.findElement(By.id("auth-signin-button"));
		    Assert.assertTrue(signinButton.isEnabled(), "signinButton field is not clickable");
		    signinButton.click();
		    WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		    Assert.assertTrue(ProductSearch.isEnabled(), "Search feld is editable");
		    ProductSearch.sendKeys(("Lipstick")+Keys.ENTER);
		    WebElement hoverover= driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		    Actions a2 = new Actions(driver);
		    a2.moveToElement(hoverover).perform();
		    Assert.assertTrue(hoverover.isDisplayed(),"Hoverover is not working");
		    WebElement SignoutButton = driver.findElement(By.xpath("//a[@id=\"nav-item-signout\"]"));
		    Assert.assertTrue(SignoutButton.isEnabled(),"SignoutButton is not working");
		    SignoutButton.click();
		    Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}}

