package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T7_T8_T9_POM_Practices {

    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        loginPage = new LibraryLoginPage();
    }

    @AfterClass
    public void teardownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void t7_field_required_error_message_test (){
        loginPage.signInButton.click();
        Assert.assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());
    }

    @Test
    public void t8_email_error_message_test(){

        loginPage.emailInputBox.sendKeys("user");
        loginPage.signInButton.click();
        Assert.assertTrue(loginPage.invalidEmailErrorMessage.isDisplayed());
    }

}
