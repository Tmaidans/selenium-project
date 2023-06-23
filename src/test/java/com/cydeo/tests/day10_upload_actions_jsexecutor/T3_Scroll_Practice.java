package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_Scroll_Practice {

        @Test
    public void scrollTest(){

            Driver.getDriver().get("https://practice.cydeo.com/");

            WebElement poweredByTag = Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"));

            Actions actions = new Actions(Driver.getDriver());
            BrowserUtils.sleep(2);
            actions.moveToElement(poweredByTag).perform();
            BrowserUtils.sleep(2);

            actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
        }







}
