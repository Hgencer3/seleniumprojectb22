package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cPractice {
    public static void main(String[] args) {
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com");
        String expectedTitle="Yahoo";
        String actualTile=driver.getTitle();
        if (actualTile.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }




    }
}
