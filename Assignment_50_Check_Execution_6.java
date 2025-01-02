package Assignment_50_Check_Execution_6;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_50_Check_Execution_6{
	
@BeforeMethod
static void BeforeMethod()
{
	System.out.println("@BeforeMethod");
}

@Test
static void Test1()
{
	System.out.println("@Test1");
}
@Test
static void Test2()
{
	System.out.println("@Test2");
}
@AfterMethod
static void AfterMethod()
{
	System.out.println("@AfterMethod");
}
@Test
static void Test3()
{
	System.out.println("@Test3");
}
}
