package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakeScreenshotMethod;

public class TestNGListener extends ListenersTest implements ITestListener{// we want to take scr shot on fail test case so we implement ITestListener
	// after that goto source-override/implement method -click all check box -ITestListner 

	// TestNGListener class are monitoring the "Test class" . it is not the part of test cases class
	
	@Override
	public void onTestStart(ITestResult result) {                              // run before the Test case start
	    System.out.println("Test Case:"+result.getName()+" has been started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {                          // after test case pass then run 
		System.out.println("Test Case:"+result.getName()+" has been Pass");
	}

	
	@Override
	public void onTestFailure(ITestResult result) {                           // after test case fail then run 
		System.out.println("Test Case:"+result.getName()+" has been Fail");
		
// if method is fail so we call scr shot code
		
		try
		{
			TakeScreenshotMethod.captureScreenshot(driver, result.getName());   // extends class bcz of give the driver
			
			                                               // result.getName() - it give the fail test case name 
		} 
		catch (IOException e) 
		{
			
		} 
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {                           // after test case skip then run
		System.out.println("Test Case:"+result.getName()+" has been Skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  // no use
		
		}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {                // no use
	
	}

	@Override  // context,get name give us the <test> tag name
	public void onStart(ITestContext context) {                               // start at the time of " Testtag " run
		System.out.println(context.getName()+" has been Started ");
	}

	@Override
	public void onFinish(ITestContext context) {                              // run at the time of all execution end
		System.out.println(context.getName()+" has been completed ");
	} 
	

}
