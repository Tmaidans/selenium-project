package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class T5_dropdown_intro {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simple_dropdowns_test() {

//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String firstSelectedOption = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(firstSelectedOption.equals("Please select an option"));

    }

    @Test
    public void state_dropdown_test() {
//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByValue("AL");
        String defaultState = stateDropdown.getFirstSelectedOption().getText();
        //   Assert.assertTrue(defaultState.equals("Select a State"));
    }

    //  @AfterClass
    //  public void tearDown() {
    //    driver.quit();
//    }


}

/*
TC#5: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”

 */