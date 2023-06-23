package com.cydeo.tests.sundayReviews.Week3;

import com.cydeo.tests.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_javaFaker extends TestBase {

    // TC: Java Faker practice
    // 1. Open Chrome browser
    Faker faker = new Faker();


    @Test

    public void enterPage() {

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

    }

    @Test

    public void loginTest() {

        // 3. Enter username using java faker
        WebElement loginField = driver.findElement(By.xpath("//input[@name='username']"));
        loginField.sendKeys(faker.name().username());

        // 4. Enter password using java faker
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys(faker.random().hex());


        // 5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        loginButton.click();
    }

    @Test

    public void verifyText() {

        // 6. Verify text displayed on page
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash error']"));

        //    Expected: "Your username is invalid!"
        String expectedMessage = "\n" +
                "            Your username is invalid!\n" +
                "            ";
        String actualMessage = errorMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
