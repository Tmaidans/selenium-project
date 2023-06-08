package com.cydeo.tests.day02_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackAndForth {

    public static void main(String[] args) {

//        TC #3: Back and forth navigation
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.get("https://google.com");

//        2.5 - Locate Gmail button
        WebElement gmailButton = driver.findElement(By.className("gb_v"));

//        3- Click to Gmail from top right.
        gmailButton.click();

//        4- Verify title contains:
//        Expected: Gmail
        String expectedTitleContains = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleContains)){
            System.out.println("Title contains verification --> PASSED!!!");
        }else{
            System.out.println("Title contains verification --> FAILED!!!");
        }

//        5- Go back to Google by using the .back();
        driver.navigate().back();

//        6- Verify title equals:
//        Expected: Google
        String expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification --> PASSED!!!");
        }else{
            System.out.println("Title verification --> FAILED!!!");
        }

        driver.quit();

    }

}
