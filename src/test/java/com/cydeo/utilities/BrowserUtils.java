package com.cydeo.utilities;

/*
This class will be storing only utility methods that can be use across project.
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {


//This method will accept integer in seconds and execute Thread.sleep method and resolve the exception.
    public static void sleep(int seconds) {
        seconds *= 1000;

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }

    }

//Switches window and verifies title, checks provided and expected titles, returns result.
    public static void switchWindowAndVerify (WebDriver driver, String expectedInURL, String expectedTitle){

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);

            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }

        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

//Verify title contain certain parameters
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
    public static void verifyTitleContains(WebDriver driver, String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

}
