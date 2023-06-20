package com.cydeo.sundayReviews.Week3;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC5_tables {

    @Test(priority = 1)
    public void loginToPage() {

        // TC : Web table practice
        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/tables
        Driver.getDriver().get(ConfigReader.getProperty("env"));

    }

    @Test(priority = 2)
    public void tableVerification() {

        // WebElement table1 = Driver.getDriver().findElement(By.xpath("//table[@id='table1']"));

        List<WebElement> listOfAllTableData = Driver.getDriver().findElements(By.xpath("//table[@id='table1']//*[td]"));

        for (WebElement eachTableElement : listOfAllTableData) {
            System.out.print(eachTableElement.getText());
        }


    }


    // 3. Print table data as a single String, not so common, but useful sometimes
    // 4. verify tconway@earthlink.net is anywhere in the table
    // 5. print all column names in single line
    // 6. print each column name in separate lines using a loop and findElements method


}
