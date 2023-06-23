package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1 - Initialize the object of the class and the driver instance inside the constructor.
    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2 - Use @FindBy annotation instead of findElement method
    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[text()='Please enter a valid email address.']")
    public WebElement invalidEmailErrorMessage;

    @FindBy(id = "inputEmail")
    public WebElement emailInputBox;


}
