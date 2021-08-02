package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aSeleniumTest {


    public static void main(String[] args) {

        // 1. set up the web driver
        WebDriverManager.chromedriver().setup();

        //2. create the instance of the chrome drive
        WebDriver drive= new ChromeDriver();

        //3.test if driver is working
        drive.get("https://www.google.com");


    }
}
