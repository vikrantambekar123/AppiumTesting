package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Appium_Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("On Test Start"+result.toString());
	}

	
	@Override
	public void onTestSuccess(ITestResult result) 
	{

	}

	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
	}

	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		// TODO Auto-generated method stub

	}

	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

	}

	
	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	
	@Override
	public void onStart(ITestContext context)
	{
	
	}

	
	@Override
	public void onFinish(ITestContext context) 
	{
	
	}

	
	
	
}
