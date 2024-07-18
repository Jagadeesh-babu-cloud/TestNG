package suitea;

import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import DataProvider.TestDataProvider;
import TestBase.TestBase;
import jdk.internal.org.jline.utils.Log;
import reports.ExtentReportManager;

public class TestClassA extends TestBase {
//  ExtentReports report;
//  ExtentTest test;
//	
//	@BeforeMethod
//	public void init()
//	{
//		report=ExtentReportManager.getReporter();
//		test=report.createTest("Test A");
//		
//				
//	}
//	
//	
//	@AfterMethod
//	public void quit()
//	{
//		report.flush();
//		
//	}
//	
	
	@Test(dataProvider="dataProviderSuiteA",dataProviderClass=TestDataProvider.class, priority = 0,groups="smoke")
	public void TestA(String arg1,String arg2) throws Exception
	{
		test.info("Starting Test A");
		//System.out.println("Starting Test A");
		//System.out.println( "prinring testing info" + test.info("Starting Test A"));
		Thread.sleep(3000);
		//System.out.println(arg1 +"######   "  +arg2);
		log("username is "+arg1);
		log("password is "+arg2);
		
		if(!arg1.equalsIgnoreCase("fsili"))
		{
			softAssert("validation failure  " + arg1);
			
		}
		
		if(!arg2.equalsIgnoreCase("fsili"))
		{
			//failAndStop("validation failure  " + arg2);//this state will end because it has assert all
			
		}
		
		System.out.println("Ending Test A");
		//test.info("Ending Test A");
		//softAssert.assertAll();
	}
}












