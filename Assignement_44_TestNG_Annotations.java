package Assignment_44_TestNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignement_44_TestNG_Annotations {
@BeforeSuite
	public static void bs()
	{
	System.out.println("@Before suite");
	}
@AfterSuite
	public static void as()
	{
	System.out.println("@After suite");
	}
@BeforeTest
	public static void bt()
	{
	System.out.println("@Before test");
	}
@BeforeClass
	public static void bc()
	{
	System.out.println("@Before class");
	}
@BeforeMethod
	public static void bm()
	{
	System.out.println("@Before Method");
	}
@Test
	public static void test()
	{
	System.out.println("@Test");
	}
@AfterTest
	public static void at()
	{
	System.out.println("@After test");
	}
@AfterClass
	public static void ac()
	{
	System.out.println("@After class");
	}
@AfterMethod
	public static void Am()
	{
	System.out.println("@After Method");
	}

}
