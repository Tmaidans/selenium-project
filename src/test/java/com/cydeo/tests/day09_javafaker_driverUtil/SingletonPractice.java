package com.cydeo.tests.day09_javafaker_driverUtil;

import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SingletonPractice {

    @AfterMethod
    public void teardownMethod (){
        System.out.println("Teardown engaged");
        Singleton.closeWord();
    }

    @Test
    public void singleton_understanding_test1(){

        String str1= Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2= Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3= Singleton.getWord();
        System.out.println("str3 = " + str3);

    }

    @Test
    public void singleton_understanding_test2(){

        String str4= Singleton.getWord();
        System.out.println("str4 = " + str4);

        String str5= Singleton.getWord();
        System.out.println("str5 = " + str5);

        String str6= Singleton.getWord();
        System.out.println("str6 = " + str6);

    }
}
