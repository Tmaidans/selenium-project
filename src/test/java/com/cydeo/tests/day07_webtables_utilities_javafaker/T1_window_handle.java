package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_window_handle {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

    }

    @AfterClass
    public void teardownClass(){
        driver.quit();
    }

    @Test
    public void windowHandle() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Thread.sleep(3000);

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);

            if (driver.getTitle().contains("Etsy")) {
                break;
            }

        }

            BrowserUtils.verifyTitleContains(driver,"Etsy");

    }

    @Test
    public void utilsTest(){

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

    }


}
