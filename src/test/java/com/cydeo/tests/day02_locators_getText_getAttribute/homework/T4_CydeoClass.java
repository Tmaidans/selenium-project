package com.cydeo.tests.day02_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_CydeoClass {

    public static void main(String[] args) {

//        TC #4: Practice Cydeo – Class locator practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

//        2.5 - Locate "Home" link
//        PS: Locate “Home” link using “className” locator
        WebElement holeLink = driver.findElement(By.className("nav-link"));

//        3- Click to “Home” link
        holeLink.click();

//        4- Verify title is as expected:
//        Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification --> PASSED!!!!");
        }else{
            System.out.println("Title verification --> FAILED!!!!");
        }

        driver.quit();

    }

}
