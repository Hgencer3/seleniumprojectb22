package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerifications {
    public static void main(String[] args) throws InterruptedException {
       /* TC #3: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Click to Gmail from top right.
        4- Verify title contains:
        Expected: Gmail
        5- Go back to Google by using the .back();
        6- Verify title equals:
        Expected: Google */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
       //3- Click to Gmail from top right.
       //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();
        //4- Verify title contains:
        //        Expected: Gmail
        System.out.println("Current Title: "+driver.getTitle());
        String expectedTitle2="Gmail";
        String actualTile2=driver.getTitle();
        if (actualTile2.contains(expectedTitle2)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        String expectedGoogleTitle="Google";
        String actualGoogleTitle=driver.getTitle();
        if (actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Google Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Google Title is not as expected. Verification FAILED!");
        }
        driver.close();
    }
}
