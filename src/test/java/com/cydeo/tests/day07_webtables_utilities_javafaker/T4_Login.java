package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_Login {

    WebDriver driver;
//    TC #4: Login scenario
//1. Create new test and make set ups

//            3. Enter valid username
//4. Enter valid password
//5. Click to `Log In` button
//6. Verify title is as expected:
//    Expected: Portal

    @BeforeClass
    public void setupClass (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//2. Go to: http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");
    }

    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement loginField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginField.sendKeys("helpdesk2@cydeo.com");

        Thread.sleep(2000);
        WebElement passField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passField.sendKeys("UserUser");

        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();
    }

    @Test
    public void loginMethodTest() throws InterruptedException {

        LoginMethod.login_crm(driver,"helpdesk1@cydeo.com", "UserUser");

    }

    @Test
    public void loginTest2() throws InterruptedException {
        Thread.sleep(2000);
        WebElement loginField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginField.sendKeys("helpdesk2@cydeo.com");

        Thread.sleep(2000);
        WebElement passField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passField.sendKeys("UserUser");

        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"");
    }

}
