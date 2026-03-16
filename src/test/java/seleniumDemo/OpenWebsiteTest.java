package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsiteTest {

    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open website
        driver.get("https://example.com");

        // Print page title
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        // Close browser
        driver.quit();
    }
}