package com.cybertek.tests.PracticeClasses;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class multipleSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        /*TC #4: Selecting value from multiple select dropdown
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/dropdown
        3. Select all the options from multiple select dropdown.
        4. Print out all selected values.
        5. Deselect all values*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(2000);
        //3. Select all the options from multiple select dropdown.

    }
}
