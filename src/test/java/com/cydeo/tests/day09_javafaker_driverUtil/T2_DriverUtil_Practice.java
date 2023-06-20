package com.cydeo.tests.day09_javafaker_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class T2_DriverUtil_Practice {

//    WebDriver driver;
//    @BeforeClass
//    public void setupClass() {
//        driver = WebDriverFactory.getDriver(ConfigReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    }
    @AfterMethod
    public void teardownMethod(){
        //We won't be using selenium's quit method anymore.
        //Driver.getDriver().quit() --> No more using this method
        //We will use Driver.closeDriver();
        Driver.closeDriver();
    }


    @Test(priority = 1)
    public void bingSearch() {

        //Driver.getDriver()--> will return me the "driver"
        //instead of writing driver, from now on we will write Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("env"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@type='search']"));
        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigReader.getProperty("searchKeyword") + Keys.ENTER);

        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(Driver.getDriver(), ConfigReader.getProperty("searchKeyword") + " - Search");
    }


    @Test(priority = 2)
    public void bingSearch2() {

        //Driver.getDriver()--> will return me the "driver"
        //instead of writing driver, from now on we will write Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("env"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@type='search']"));
        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigReader.getProperty("searchKeyword") + Keys.ENTER);

        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(Driver.getDriver(), ConfigReader.getProperty("searchKeyword") + " - Search");
    }

}
