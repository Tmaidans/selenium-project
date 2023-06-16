package com.cydeo.tests.day08_LAPTOP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T3_TableMethod {

    WebDriver driver;
    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/tables");

    }

    @AfterClass
    public void teardownClass(){
        driver.quit();
    }

//    TC #3: Create a custom method
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/tables
//            3- Write custom method:
//            • Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName

    @Test (priority = 1)
    public void getEmailUtilsTest(){

WebTableUtils.getTableGetEmail(driver,"table1","Tim");

    }












}
