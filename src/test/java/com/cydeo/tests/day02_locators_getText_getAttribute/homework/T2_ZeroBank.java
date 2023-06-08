package com.cydeo.tests.day02_locators_getText_getAttribute.homework;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBank {

    public static void main(String[] args) throws InterruptedException {

//        HWP #2: Zero Bank header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(1000);

//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

//        3. Verify header text
//        Expected: “Log in to ZeroBank”
        String expectedHeader ="Log in to ZeroBank";
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Header verification --> PASSED!!!");
        }else{
            System.out.println("Header verification --> FAILED!!!");
        }

      //  driver.quit();

    }

}
