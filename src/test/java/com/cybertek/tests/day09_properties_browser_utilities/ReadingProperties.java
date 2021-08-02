package com.cybertek.tests.day09_properties_browser_utilities;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_file() throws IOException {

        //1- Create object of Properties class(coming from java lib)P
        Properties properties=new Properties();

        //2- Open the file using FileInputStream
        // we are trying to open a file so we need to pass the path
        FileInputStream file=new FileInputStream("configuration.properties");

        //3- Load the properties object with oue file
        properties.load(file);

        //reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }

    @Test
    public void using_properties_method(){

        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));
        System.out.println("ConfigurationReader.getProperty(\"username\") = " + ConfigurationReader.getProperty("uservame"));

    }
}
