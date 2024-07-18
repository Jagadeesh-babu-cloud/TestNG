package suitea;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassAA extends TestBase {

	
	@Test(groups="jagadeesh")
	public void TestAA() throws InterruptedException
	{
		test.info("Starting Test AA");
		System.out.println("Starting Test AA");
		Thread.sleep(3000);
		System.out.println("Ending Test AA");
	//	test.info("Starting Test AA");replacing with log on b ase cclass
		
		log("Ending Test AA");//instead writing above code multiple times we just added same in base class and using log method
		
		
	}
}
