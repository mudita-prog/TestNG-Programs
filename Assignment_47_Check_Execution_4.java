package Assignment_48_Check_Execution_4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_47_Check_Execution_4{
	@BeforeMethod
	static void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
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
	
}