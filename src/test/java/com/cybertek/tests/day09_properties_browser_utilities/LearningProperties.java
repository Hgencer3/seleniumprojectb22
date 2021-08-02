package com.cybertek.tests.day09_properties_browser_utilities;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
