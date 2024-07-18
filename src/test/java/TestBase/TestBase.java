package TestBase;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReportManager;
import utils.DriverManager;

public class TestBase {
	public ExtentReports report;
	public ExtentTest test;
	public SoftAssert softAssert;
	protected WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void init(ITestResult res) {
		 driver = DriverManager.getDriver("chrome");
	        driver.manage().window().maximize();
		report = ExtentReportManager.getReporter();
		test = report.createTest( res.getMethod().getMethodName());
		res.setAttribute("reporterobj", test);
		//test = report.createTest(methodname.getName());
		// System.out.println("Name of method name "+methodname.getName());//this and
		// below gives same output

		// System.out.println("Name of res name "+ res.getMethod().getMethodName());

		softAssert=new SoftAssert();

	}

	@AfterMethod(alwaysRun=true)
	public void quit( ITestResult res) {
		//System.out.println("IS SUCESS method" + res.isSuccess());
		//System.out.println("IS status method" + res.getStatus());
		report.flush();
		DriverManager.quitDriver();

	}

	public void log(String msg) {

		test.info(msg);
	}

	public void pass(String msg) {

		test.pass(msg);
	}

	public void fail(String msg) {

		test.fail(msg);
	}
	
	
	public void skip(String msg) {
        
		test.skip(msg);
	}
	
	//print softassert error inextent report ,fail in tetsng report
	public void softAssert(String msg) {
		fail( msg);
		softAssert.fail(msg);
	}
	
	//print softassert error inextent report ,stop the execution
	
	public void failAndStop(String msg) {

		fail( msg);
		softAssert.assertAll();
	}
	
	
	

}
