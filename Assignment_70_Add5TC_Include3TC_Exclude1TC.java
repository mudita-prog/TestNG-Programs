package Assignments_TestNG;

import org.testng.annotations.Test;

public class Assignment_70_Add5TC_Include3TC_Exclude1TC {
	
	@Test(groups= {"system"})
	public void TC1()
	{
		System.out.println("TestCase1");
	}
	
	@Test(groups= {"regression"})
	public void TC2()
	{
		System.out.println("TestCase2");
	}
	
	@Test(groups= {"smoke","system"})
	public void TC3()
	{
		System.out.println("TestCase3");
	}
	
	@Test(groups= {"regression"})
	public void TC4()
	{
		System.out.println("TestCase4");
	}
	
	@Test(groups= {"system"})
	public void TC5()
	{
		System.out.println("TestCase5");
	}

}
