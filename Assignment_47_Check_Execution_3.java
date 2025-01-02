package Assignment_47_Check_Execution_3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_47_Check_Execution_3 {
	@Test
	static void Test()
	{
		System.out.println("@Test");
	}
	
	@AfterMethod
	static void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}
	@BeforeSuite
	static void BeforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterClass
	static void AfterClass()
	{
		System.out.println("@AfterClass");
	}
}