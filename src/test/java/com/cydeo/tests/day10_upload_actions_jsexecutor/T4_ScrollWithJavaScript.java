package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T4_ScrollWithJavaScript {

    @Test
    public void infinite_scroll_test() {

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(4);

        for (int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0,750)");
            BrowserUtils.sleep(1);

        }



    }

}
