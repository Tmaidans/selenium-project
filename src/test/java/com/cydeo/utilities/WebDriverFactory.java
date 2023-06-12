package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //Task NEW METHOD CREATION


    //Method accepts a name of the browser that we will be using as a String argument.
    //Creates instance of a WebDrover named driver.
    public static WebDriver getDriver(String browserType) {


        if (browserType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else {

            System.out.println("Given string doesn't represent any browser.");
            System.out.println("Either that browser does not exist or not currently supported");
            System.out.println("Driver = null");
            return null;
        }


    }


    //Methods accepts a WebElement as an argument along with attribute and id as Strings.
    //Clicks button and prints out whether the button is selected or not.
    public static void clickAndVerifyButtonById(WebDriver driver, String idAttribute) {

        WebElement button = driver.findElement(By.xpath("//input[@id='" + idAttribute + "']"));
        button.click();

        if (button.isSelected()) {
            System.out.println("Radio button selection verification --> PASSED!!!");
        }

    }
    public static void clickAndVerifyButtonByName(WebDriver driver, String nameAttribute) {

        WebElement button = driver.findElement(By.xpath("//input[@id='" + nameAttribute + "']"));
        button.click();

        if (button.isSelected()) {
            System.out.println("Radio button selection verification --> PASSED!!!");
        }

    }


}


