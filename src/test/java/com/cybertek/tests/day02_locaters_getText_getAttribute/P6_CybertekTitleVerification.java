package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        /*TC #6: Practice Cybertek – Class locator practice
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/inputs
        3. Click “Home” button
        4. Verify title as expected:
        Expected: Practice*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(2000);
        //3. Click “Home” button
        driver.findElement(By.className("nav-link")).click();
        //4. Verify title as expected:     Expected: Practice
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
       // Thread.sleep(2000);
        // driver.close();

    }
}
