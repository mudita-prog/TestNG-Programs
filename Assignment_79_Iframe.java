package Assignments_TestNG;

//import java.time.Duration;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_79_Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement HoverOverOnAccount = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(HoverOverOnAccount).perform();
		
		WebElement SignInButton = driver.findElement(By.xpath("//a[@class=\"nav-action-signin-button\"]"));
		SignInButton.click();
		WebElement UserName = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		UserName.sendKeys(("9717377131") + Keys.ENTER);
		
		WebElement EnterPass = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		EnterPass.click();
		EnterPass.sendKeys("Qazwsx123@");
		WebElement SubmitButton = driver.findElement(By.xpath("//span[@id=\"auth-signin-button\"]"));
		SubmitButton.click();
		
		WebElement ProductSearch = driver.findElement(By.id("twotabsearchtextbox"));
		ProductSearch.sendKeys(("Pen")+Keys.ENTER);
		WebElement SelectProduct = driver.findElement(By.xpath("//div[@data-index=\"4\"]"));
		SelectProduct.click();
		
	/*	Set <String> s1 =driver.getWindowHandles();
		System.out.println(s1);
		Iterator <String> i1 = s1.iterator();
		String ParentId = i1.next();
		String ChildId = i1.next();
		System.out.println((ParentId) +("")+ (ChildId));
		driver.switchTo().window(ChildId);*/
		

		WebElement BuyNowButton = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		BuyNowButton.click();
		
		WebElement SelectCreditCard = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		SelectCreditCard.click();
		WebElement AddCreditCard = driver.findElement(By.xpath("//a[.='Add a new credit or debit card']"));
		AddCreditCard.click();
		
	    WebElement iframe = driver.findElement(By.xpath("//iframe[@name='ApxSecureIframe']"));
	    driver.switchTo().frame(iframe);
	  
	    WebElement CardNumber = driver.findElement(By.xpath("//input[@name='addCreditCardNumber']"));
	    CardNumber.click();
	    CardNumber.sendKeys("401704218039990");
	   
	    WebElement MonthDD = driver.findElement(By.name("ppw-expirationDate_month"));
	    Select selectMonth = new Select(MonthDD);
	    selectMonth.selectByValue("5"); // May
	    WebElement EnterMonth = driver.findElement(By.xpath("//a[.='05']"));
	    EnterMonth.sendKeys(Keys.ENTER);
	    
        WebElement ExpiryYear = driver.findElement(By.name("ppw-expirationDate_year"));
        Select SelectYear = new Select(ExpiryYear);
	    SelectYear.selectByValue("2030");
	    WebElement EnterYear = driver.findElement(By.xpath("//a[.='2030']"));
	    EnterYear.sendKeys(Keys.ENTER);
	    
	    WebElement Continue = driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']"));
	    Continue.click();
	}

}
