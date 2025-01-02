package Assignment_45_Check_Execution_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assignment_45_Check_Execution_1 {
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
	
	@AfterClass
	static void AfterClass()
	{
		System.out.println("@AfterClass");
	}

}
