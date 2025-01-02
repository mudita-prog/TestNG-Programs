package Assignments_TestNG;

import org.testng.annotations.Test;

public class Assignment_60_WriteScriptTestingPriority {
	
	@Test(priority=-2)
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=-1)
	public void Logout()
	{
		System.out.println("Logout");
	}
	
	@Test(priority=-3)
	public void Registration()
	{
		System.out.println("Registration");
	}

}
