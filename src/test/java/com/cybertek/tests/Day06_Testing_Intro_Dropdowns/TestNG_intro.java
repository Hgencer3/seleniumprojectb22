package com.cybertek.tests.Day06_Testing_Intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before Class is running ...");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> After Class is running ...");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("--> before method is running ...");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("--> after method is runnung ...");
    }
    @Test
    public void test1(){
        System.out.println("Running test 1 ... ");
        String actual="apple";
        String expected="apples";

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        System.out.println("Running test 2 ...");
        String actual="apple";
        String expected="apples";
        Assert.assertTrue(actual.equals(expected));

    }
}
