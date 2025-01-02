package Assignment_49_Check_Execution_5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_49_Check_Execution_5{
	
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
}
