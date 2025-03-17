package Assignments_TestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_74_WAP_BrokenLinks {

		public static void main(String[] args) throws InterruptedException, IOException{

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			List<WebElement> e1 = driver.findElements(By.tagName("a"));
			int count = e1.size();
			System.out.println(count);
			
			
			for (int i=0;i<count;i++)
			{
				WebElement a1 = e1.get(i);
				String url = a1.getAttribute("href");
				System.out.println(url);
				verifyLinks(url);
			}}
			
			static void verifyLinks (String url) throws IOException {
				try {
				URL u1 = new URL(url);
				HttpURLConnection u2 =  (HttpURLConnection) u1.openConnection();
				
				if (u2.getResponseCode() == 200)
				{
					System.out.println("Link is valid" + url + "  " + u2.getResponseMessage());
				}
				
				else
				{
					System.out.println("Link is not valid");
				}
				}
				catch(MalformedURLException w1)
				{
					System.out.println("Handled the Exception");
				}
			}}


