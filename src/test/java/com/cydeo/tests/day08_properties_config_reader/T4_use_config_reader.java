package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_use_config_reader {

//    TC #4: Google search

//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Verify title:
//Expected: apple - Google Search

    WebDriver driver;

    @BeforeClass
    public void setupClass() {

        driver = WebDriverFactory.getDriver(ConfigReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigReader.getProperty("env"));
    }

    @Test
    public void google_search_test() {
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchBox.sendKeys(ConfigReader.getProperty("searchKeyword") + Keys.ENTER);

//        String expectedTitle = "apple - Google Search";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);

        BrowserUtils.verifyTitle(driver, ConfigReader.getProperty("searchKeyword") + " - Google Search");


    }
}
