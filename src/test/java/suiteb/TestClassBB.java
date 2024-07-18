package suiteb;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassBB extends TestBase{

	
	@Test
	public void TestBB() throws InterruptedException
	{
		
		System.out.println("Starting Test BB");
		Thread.sleep(3000);
		System.out.println("Ending Test BB");
	}
}
