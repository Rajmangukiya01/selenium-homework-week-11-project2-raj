package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        //print the current url
        System.out.println("Current url is : " + driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Enter the username in username field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //Enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //close the browser
        driver.close();
    }
}
