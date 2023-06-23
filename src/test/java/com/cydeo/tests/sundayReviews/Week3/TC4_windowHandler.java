package com.cydeo.tests.sundayReviews.Week3;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class TC4_windowHandler {

    // TC : Windows handle practice

    @Test (priority = 1)
    public void goToPage(){

        //    1. Open browser
        //    2. Go to website: https://demoqa.com/browser-windows
        Driver.getDriver().get(ConfigReader.getProperty("env"));

    }

    @Test (priority = 2)
    public void clickButtons(){

        //    3. Click on New Tab button
        //    4. Click on New Window button
        //    5. Click on New Window Message button

        WebElement newTabBtn = Driver.getDriver().findElement(By.xpath("//button[.='New Tab']"));
        newTabBtn.click();

        WebElement newWindowBtn = Driver.getDriver().findElement(By.xpath("//button[.='New Window']"));
        newWindowBtn.click();

        WebElement newWindowMsgBtn = Driver.getDriver().findElement(By.xpath("//button[.='New Window Message']"));
        newWindowMsgBtn.click();
    }

    @Test (priority = 3)
            public void printHandles(){

        //    6. Store parent window handle id in a variable
        String mainWindowHandle = Driver.getDriver().getWindowHandle();

        //    7. Store all window handle ids in to a Set
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        //    9. Print out each window title
        System.out.println("mainWindow = " + mainWindowHandle);
        for (String eachHandle : allWindowHandles) {

            if (eachHandle.equals(mainWindowHandle)){
                System.out.println("Main Handle");
            }
            System.out.println(eachHandle);
        }

    }


}
