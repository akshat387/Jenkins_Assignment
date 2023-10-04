package JenkinsAssign.SampleTestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest 
{
	@Test
	public void launchBrowser() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatbajpai\\Downloads\\SampleTestCases\\Drivers\\chromedriver.exe");

 

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

 

        // Open a website
        driver.get("https://www.google.com");
 
 

        // Perform your actions here

 

        // Close the browser
        driver.quit();
    }
}
