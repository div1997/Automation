package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resource.Baseclass;
import Resource.ExtentReport;

public class Listners extends Baseclass implements ITestListener
{
 // whenever there is failure then command come to this sections
	ExtentTest test;
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal <ExtentTest>(); // belogs to threadlocal all test send to threadlocal pull where we run sequence
	ExtentReports extent=ExtentReport.getreportobject();                //Threadsafe concept
	public void onTestStart(ITestResult result) 
	{

		String testmethodname = result.getMethod().getMethodName(); // get the name of testcase method
		
	 test = extent.createTest("testmethodname");
	 extenttest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extenttest.get().log(Status.PASS," testcase pass");
	}

	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		extenttest.get().fail(result.getThrowable());
		WebDriver driver =null;
		
		
		String testmethodname = result.getMethod().getMethodName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try 
		{
			extenttest.get().addScreenCaptureFromPath(screenshot(testmethodname, driver),result.getMethod().getMethodName()); // send screenshot in index.html file 
			screenshot(testmethodname, driver);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) 
	{
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
