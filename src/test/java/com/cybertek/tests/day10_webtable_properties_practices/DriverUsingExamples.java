package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExamples {
    @Test
    public void how_to_use_driver(){

        Driver.getDriver().get("http://library1.cybertekschool.com/login.html");
    }
}
