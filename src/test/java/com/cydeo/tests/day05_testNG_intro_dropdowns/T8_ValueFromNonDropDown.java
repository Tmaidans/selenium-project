package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T8_ValueFromNonDropDown {

    WebDriver driver;

//    TC #8: Selecting value from non-select dropdown


    @BeforeClass
    public void setupClass() {
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void nonSelect() throws InterruptedException {
//3. Click to non-select dropdown
//4. Select Facebook from dropdown
//5. Verify title is “Facebook - Log In or Sign Up”
        WebElement dropDownButton = driver.findElement(By.id("dropdownMenuLink"));
        dropDownButton.click();
        Thread.sleep(1000);
        WebElement dropDownSelection = dropDownButton.findElement(By.xpath("//a[.='Facebook']"));
        dropDownSelection.click();
        Thread.sleep(1000);
        String expectedTitle = "Facebook - log in or sign up2";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title are not equals");

    }

    @AfterClass
    public void classTeardown() {
        driver.quit();
    }

}
