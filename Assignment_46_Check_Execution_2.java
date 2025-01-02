package Assignment_46_Check_Execution_2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_46_Check_Execution_2 {
	
	@BeforeTest
	static void BeforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	static void BeforeClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	static void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	static void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}
	
	@Test
	static void Test()
	{
		System.out.println("@Test");
	}
	}

