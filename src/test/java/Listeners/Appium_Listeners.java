package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import PracticeBase.PracBase_App_Demos;

public class Appium_Listeners extends PracBase_App_Demos implements ITestListener

{

	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("On Test Start  :- "+result.getName());
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(result.getName()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("On Test Success  :- "+result.getName());
//		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file, new File(result.getName()+".jpg"));
//		} catch (IOException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("On Test Fail  :- "+result.getName());
	}

	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("On Test Skipped  :- "+result.getName());

	}

	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("On onTestFailedButWithinSuccessPercentage :- "+result.getName());

	}

	
	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("On onTestFailedWithTimeout  :- "+result.getName());

	}

	
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("On onStart  :- "+context.getName());

	}

	
	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("On onFinish   "+context.getName());

	}

	
	
	
}
