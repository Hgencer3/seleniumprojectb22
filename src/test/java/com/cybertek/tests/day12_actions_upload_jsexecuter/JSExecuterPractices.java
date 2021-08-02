package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuterPractices {

    @Test
    public void scroll_using_jsExecuter_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        // DownCasting our driver type to JavascriptException so we can reach methods in this interface
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code

        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");

        }

        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0, -750)");
    }

    @Test public void scroll_using_jsExecuter_test2(){

        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        WebElement cybertekschoolLink=Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)",cybertekschoolLink);


        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);





    }

}
