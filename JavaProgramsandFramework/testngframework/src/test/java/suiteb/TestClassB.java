package suiteb;

import org.testng.annotations.Test;

public class TestClassB {

	
	@Test
	public void TestA() throws InterruptedException
	{
		
		System.out.println("Starting Test B");
		Thread.sleep(3000);
		System.out.println("Ending Test B");
	}
}
