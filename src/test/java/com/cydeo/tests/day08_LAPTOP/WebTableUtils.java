package com.cydeo.tests.day08_LAPTOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String consumerName) {

        WebElement customerOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='" + consumerName + "']/following-sibling::td[3]"));

        System.out.println(consumerName + " Order date is: " + customerOrderDate.getText());
        return customerOrderDate.getText();
    }

    /*
    Method #2 info:
• Name: orderVerify ()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String costumerName
• Arg3: String expectedOrderDate
This method should accept above mentioned arguments and internally assert
expectedOrderDate matching actualOrderDate.
     */
    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {

        WebElement customerOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='" + customerName + "']/following-sibling::td[3]"));

        String expectedDate = expectedOrderDate;
        String actualDate = customerOrderDate.getText();


        System.out.println("expectedDate = " + expectedDate);
        System.out.println("actualDate = " + actualDate);

        Assert.assertEquals(expectedDate, actualDate);

    }

//    TC #3: Create a custom method
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/tables
//            3- Write custom method:
//            • Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName

    public static void getTableGetEmail(WebDriver driver, String tableNum, String firstName){

        WebElement emailLocator = driver.findElement(By.xpath("(//table[@id='"+tableNum+"']//td[.='"+firstName+"']/following-sibling::td[1])"));

        System.out.println("Clients email id: " + emailLocator.getText());
    }

}
