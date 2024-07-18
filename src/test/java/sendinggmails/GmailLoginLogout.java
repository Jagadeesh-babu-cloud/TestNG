package sendinggmails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GmailLoginLogout {
    
    @Test(groups="smokes")
    public void s() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "E:\\JavaProgramsandFramework\\testngframework\\src\\test\\resources\\chromedriver.exe");

        // Disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Gmail
      //  driver.get("https://mail.google.com");
        driver.get("https://www.google.com/");

        // Enter username
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("jagadeesh.babu.b123@gmail.com");

        // Click next
        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        // Wait for password input field to be visible
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Enter password
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Automation@6460");

        // Click next
        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
        passwordNextButton.click();

        // Wait for Gmail to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sign out
        WebElement profileButton = driver.findElement(By.xpath("//a[contains(@aria-label, 'Google Account') or contains(@aria-label, 'Profile') or contains(@aria-label, 'Account') or contains(@aria-label, 'Google') or contains(@aria-label, 'Apps') or contains(@aria-label, 'menu')]"));
        profileButton.click();

        WebElement signOutButton = driver.findElement(By.xpath("//a[contains(text(),'Sign out')]"));
        signOutButton.click();

        // Close the browser
        driver.quit();
    }
}
