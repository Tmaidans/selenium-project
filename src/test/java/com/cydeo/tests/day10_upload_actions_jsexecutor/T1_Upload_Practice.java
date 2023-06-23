package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.apache.commons.io.input.BrokenInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Upload_Practice {

    @Test
    public void fileUploader() {

        Driver.getDriver().get(ConfigReader.getProperty("env"));
        WebElement chooseFileBtn = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileBtn.sendKeys("C:\\Users\\Tim\\Downloads\\flat,750x1000,075,f.u1.jpg");

        BrowserUtils.sleep(2);

        WebElement uploadBtn = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadBtn.click();

        WebElement pageTitle = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(pageTitle.isDisplayed());


    }

}
