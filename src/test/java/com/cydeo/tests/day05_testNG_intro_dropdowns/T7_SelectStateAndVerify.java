package com.cydeo.tests.day05_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T7_SelectStateAndVerify {

    WebDriver driver;

    //    TC #7: Selecting state from State dropdown and verifying result
//1.  Open Chrome browser
//2.  Go to http://practice.cybertekschool.com/dropdown
    @BeforeClass
    public void setupClass() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    //3. Select Illinois
    @Test (priority = 1)
    public void selectIll() throws InterruptedException {
        Thread.sleep(1000);
        Select illinois = new Select(driver.findElement(By.id("state")));
        illinois.selectByVisibleText("Illinois");
    }

    //4. Select Virginia
    @Test (priority = 2)
    public void selectVA() throws InterruptedException {
        Thread.sleep(1000);
        Select illinois = new Select(driver.findElement(By.id("state")));
        illinois.selectByValue("VA");
    }

    //5. Select California
    @Test (priority = 3)
    public void selectCal() throws InterruptedException {
        Thread.sleep(1000);
        Select illinois = new Select(driver.findElement(By.id("state")));
        illinois.selectByIndex(5);
        Assert.assertTrue(illinois.getFirstSelectedOption().getText().equals("California"));
    }

//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }

}
