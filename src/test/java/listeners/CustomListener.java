package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener implements ITestListener {

	
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test started: yo" + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test passed: yo" + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: yo" + result.getName());
	        
	        System.out.println("Attribute value:" + result.getAttribute("reporterobj"));
	        ExtentTest test=(ExtentTest) result.getAttribute("reporterobj");
	        test.log(Status.INFO,  "NAME OF test case is " + result.getName());
	        test.fail("Failure" + result.getThrowable().getMessage());
	    
	    }

	
}
