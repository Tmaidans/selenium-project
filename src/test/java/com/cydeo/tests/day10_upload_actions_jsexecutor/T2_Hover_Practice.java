package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class T2_Hover_Practice {

    @Test
    public void hoverTest() {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);

        WebElement firstAvatar1 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        WebElement firstAvatar2 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        WebElement firstAvatar3 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        WebElement userNameTag1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement userNameTag2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement userNameTag3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        actions.moveToElement(firstAvatar1).perform();
        BrowserUtils.sleep(2);
        Assert.assertTrue(userNameTag1.isDisplayed());


        Driver.closeDriver();

    }

}
