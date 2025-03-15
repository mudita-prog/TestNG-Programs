package Assignments_TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Assignment_71a_RetryTheFailedTestCases1 implements IRetryAnalyzer{

	int initialCount=0;
	int retryCount = 2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(initialCount<retryCount)
		{
		initialCount++;
		return true;
		}
		
		
		
		
		return false;
	}

}
