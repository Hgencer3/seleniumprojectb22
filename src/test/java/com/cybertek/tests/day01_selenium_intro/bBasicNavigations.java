package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bBasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1.setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2.Create instance of selenium web driver
        //this line open empty browser
        WebDriver driver=new ChromeDriver();

        //3.get the page for Tesla.com
        driver.get("https://www.tesla.com");

        //putting 3 second
        Thread.sleep(3000);

        //4.Going back using navigation
        driver.navigate().back();

        //putting 3 second
        Thread.sleep(3000);
        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 second
        Thread.sleep(3000);

        //refreshing the page using navigation
        driver.navigate().refresh();

        //going to another url using .to() method
        driver.navigate().to("http://www.google.com");
        // getTitle() method
        System.out.println("Current Title: "+driver.getTitle());
        //.getCurrentUrl()  as aString method
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Crurrent url: "+currentUrl);

        //.manage().window().maximize()
        driver.manage().window().fullscreen();

        //.closed method--- it will close 1 browser or 1 tab
        driver.close();
        //.quit method-- this methot close all of the opened browser or tabs  within the same session
        //driver.quit();






    }


}
