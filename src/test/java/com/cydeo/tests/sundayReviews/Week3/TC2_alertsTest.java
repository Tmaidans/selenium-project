package com.cydeo.tests.sundayReviews.Week3;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_alertsTest {


// TC : Alert practice

@Test (priority = 1)
public void goToPage  (){

    // 1. Open browser
// 2. Go to website: https://practice.cydeo.com/javascript_alerts
    Driver.getDriver().get(ConfigReader.getProperty("env"));

}


    @Test (priority = 2)
    public void clickAndSend (){

        // 3. Click to “Click for JS Prompt” button
        WebElement jSAlertButton  = Driver.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
            jSAlertButton.click();

        // 4. Send “hello” text to alert
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");

        // 5. Click to OK button from the alert
        alert.accept();

    }

    @Test (priority = 3)
    public void verifyText(){

        WebElement message = Driver.getDriver().findElement(By.xpath("//p[@id='result']"));
        String expectedMessage = "You entered: hello";
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }


// 5. Click to OK button from the alert
// 6. Verify “You entered: hello” text is displayed.

}
