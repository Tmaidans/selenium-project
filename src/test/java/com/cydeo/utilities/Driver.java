package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create private constructor to remove access to this object

    private Driver() {
    }

    /*
    We make the Webdriver private because we want to close access from outside the class.
    We are making it static because we use it in static method.
     */
    private static WebDriver driver;

    /*
    Create reusable utility method which will return the same driver instance once we call it.
    - If an instance doesn't exist, it will create first, and then it will always return the same instance.
     */
    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = ConfigReader.getProperty("browser");
               /*
               Depending on the browser type returned from configuration.properties, switch statement will determine
               the case and open matching browser .
                */
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }

        }

        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {
            /*
            This line will terminate the currently existing driver completely. It will not exist going forward.
             */
            driver.quit();

            driver = null;

        }
    }


}
