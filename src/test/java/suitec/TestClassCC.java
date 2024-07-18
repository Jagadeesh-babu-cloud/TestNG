package suitec;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassCC extends TestBase {

	
	@Test
	public void TestCC() throws InterruptedException
	{
		
		System.out.println("Starting Test CC");
		Thread.sleep(3000);
		System.out.println("Ending Test CC");
	}
}
