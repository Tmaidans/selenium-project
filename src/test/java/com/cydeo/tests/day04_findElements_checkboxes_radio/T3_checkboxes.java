package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_checkboxes {

    public static void main(String[] args) {

//        TC#3: Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1 = driver.findElement(By.cssSelector("input#box1"));
        if (checkBox1.isSelected()==false){
            System.out.println("Check box 1 is NOT SELECTED");
        }else{
            System.out.println("Check box 1 IS SELECTED");
        }

//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.cssSelector("input#box2"));
        if (checkBox2.isSelected()==false){
            System.out.println("Check box 2 is NOT SELECTED");
        }else{
            System.out.println("Check box 2 IS SELECTED");
        }

//        4. Click checkbox #1 to select it.
        checkBox1.click();
        System.out.println("Click CB 1");

//        5. Click checkbox #2 to deselect it.
        checkBox2.click();
        System.out.println("Click CB 2");

//        6. Confirm checkbox #1 is SELECTED.
        if (checkBox1.isSelected()==false){
            System.out.println("Check nox 1 is NOT SELECTED");
        }else{
            System.out.println("Check box 1 IS SELECTED");
        }

//        7. Confirm checkbox #2 is NOT selected.
        if (checkBox2.isSelected()==false){
            System.out.println("Check nox 2 is NOT SELECTED");
        }else{
            System.out.println("Check box 2 IS SELECTED");
        }


        driver.quit();

    }

}
