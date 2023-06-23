package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T10_ExplicitWaitPractices {

    @Test
    public void test10_wait_until_title_changes(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicpage = new DynamicLoad7Page();
        Assert.assertTrue(dynamicpage.doneMessage.isDisplayed());
        Assert.assertTrue(dynamicpage.spongeBobImage.isDisplayed());


    }

}


