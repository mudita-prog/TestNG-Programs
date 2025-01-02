package Assignments_TestNG;

import org.testng.annotations.Test;

public class Assignment_55_WAPwith3Test_with1testHasInvocationCountof10 {
	

	@Test
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test
	public void Logout()
	{
		System.out.println("Logout");
	}
	
	@Test(invocationCount=10)
	public void Registration()
	{
		System.out.println("Registration");
	}


}
