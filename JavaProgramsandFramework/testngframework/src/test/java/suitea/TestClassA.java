package suitea;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReportManager;

public class TestClassA {
  ExtentReports report;
  ExtentTest test;
	
	@BeforeMethod
	public void init()
	{
		report=ExtentReportManager.getReporter();
		test=report.createTest("Test A");
		
				
	}
	
	
	@AfterMethod
	public void quit()
	{
		report.flush();
		
	}
	
	
	@Test
	public void TestA() throws InterruptedException
	{
		
		System.out.println("Starting Test A");
		Thread.sleep(3000);
		System.out.println("Ending Test A");
	}
}
