package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

       /* TC #1: Etsy Title Verification
        1. Open Chrome browser
        2. Go to https://www.etsy.com/
        3. Search for “wooden spoon”
        4. Verify title:
        Expected: “Wooden spoon | Etsy”*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.etsy.com");
        Thread.sleep(2000);
        //3. Search for “wooden spoon”
        // 4. Verify title: Expected: “Wooden spoon | Etsy”
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        System.out.println("Current Title: "+driver.getTitle());
        String expectedTitle="wooden spoon";
        String actualTile=(driver.getTitle()).toLowerCase();
        if (actualTile.contains(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
