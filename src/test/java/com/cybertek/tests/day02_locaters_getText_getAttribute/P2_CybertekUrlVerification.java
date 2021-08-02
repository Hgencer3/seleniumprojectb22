package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Cybertek practice tool verifications
        //1. Open Chrome browser
        //2. Go to https://practice.cybertekschool.com
        //3. Verify URL contains
        //Expected: cybertekschool
        //4. Verify title:
        // Expected: Practice

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(3000);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current url: "+currentUrl);
        String expectedUrl="http://practice.cybertekschool.com/";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL is expected. Verification PASSED!");
        }else{
            System.out.println("URL is not expected. Verification FAILED!");
        }
        System.out.println("Current Title: "+driver.getTitle());
        String expectedTitle2="Practice";
        String actualTile2=driver.getTitle();
        if (actualTile2.equals(expectedTitle2)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
        driver.close();
    }
}
