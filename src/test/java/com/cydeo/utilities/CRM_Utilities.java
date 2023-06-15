package com.cydeo.utilities;

/*
This class will store methods related to CRM project
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

//Logs in into application using set credentials
    public static void login_crm(WebDriver driver){

        WebElement loginField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginField.sendKeys("helpdesk2@cydeo.com");

        WebElement passField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passField.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();

    }

//Logs in into application using given credentials as arguments
    public static void login_crm(WebDriver driver, String username, String password){

        WebElement loginField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginField.sendKeys(username);

        WebElement passField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();

    }











}
