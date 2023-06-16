package com.cydeo.utilities;

/*
In this class, we will be creating the reusable logic to read from configuration.properties file
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //1 - Create the Properties object (create object)
    //Make it "private" so we are limiting access to the object
    //"Static" is to make sure its created and loaded before anything else.
    private static Properties properties = new Properties();


    //create static block because it loads first before any other methods
    static {

        try {
            //2 - Ope file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");

            //3 - Load the "properties" object with "file" (load properties)
            properties.load(file);

            //close the file in the memory (not mandatory)
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();
        }
    }
    //create utility a method to use object to read
    //4 = Use "properties" object to read from the file (read properties)

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);

    }

}
