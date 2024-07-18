package suiteb;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassB extends TestBase {

	
	@Test(groups="selenium")
	public void TestB() throws InterruptedException
	{
		System.out.println(test);
	
		System.out.println("Starting Test B");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		a.moveToElement(we).perform();
		Thread.sleep(3000);
		WebElement we2=driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		
		a.moveToElement(we2).click().perform();
		Thread.sleep(3000);
		
		WebElement we1=driver.findElement(By.xpath("//a[@title='Desktop PCs']"));
		
		a.moveToElement(we1).click().perform();
		Thread.sleep(3000);
		
		
		
//		Queueing Actions: When you create actions like click or hover, 
//		they are not executed immediately. Instead, they are stored in a queue until you call perform(). 
//		This allows you to chain multiple actions together.
//
//		Execution of Actions: Calling perform() triggers the execution of all the actions 
//		in the queue. Without this call, no actions will be executed, and your intended 
//		interaction with the web element will not occur.
//		
		
		System.out.println("Ending Test B");
		
		
	}
	
	
	@Test
	 private static void checkLink(String link) {
        try {
        	URL url = new URL(link);
        	//huc is abstract class which extends to other abstarct class url
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("Broken link: " + link + " - Response Code: " + responseCode);
            } else {
                System.out.println("Valid link: " + link + " - Response Code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Error checking link: " + link + " - " + e.getMessage());
        }
    }
}

