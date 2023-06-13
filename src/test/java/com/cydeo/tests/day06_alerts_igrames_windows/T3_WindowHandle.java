package com.cydeo.tests.day06_alerts_igrames_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T3_WindowHandle {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void windowHandle() {

        String mainPage = driver.getWindowHandle();
        WebElement clickButton = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickButton.click();

//driver.getWindowHandles()
        //1- windowHandle : mainHandle
        //2- windowHandle : 2nd window

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current title while switching pages: " + driver.getTitle());

        }



    }

}
