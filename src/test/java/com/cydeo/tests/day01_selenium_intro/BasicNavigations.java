package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //Setup browser driver
        WebDriverManager.chromedriver().setup();

        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        //go to tesla.com
        driver.get("https://www.tesla.com");

        Thread.sleep(1000);

        //Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //User navigates forward() to go forward
        driver.navigate().forward();

        Thread.sleep(1000);

        //User refreshes the page using navigate.refresh()
        driver.navigate().refresh();

        Thread.sleep(1000);

        //navigate to google.com using navigate().to() method
        driver.navigate().to("https://www.google.com");

        //get title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }

}
