package suitec;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassC extends TestBase{

	
	@Test
	public void TestC() throws InterruptedException
	{
		
		System.out.println("Starting Test C");
		Thread.sleep(3000);
		System.out.println("Ending Test C");
	}
}
