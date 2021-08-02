package com.cybertek.tests.day03_reviewpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_FacebookHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        Thread.sleep(2000);

        //verify header text is an expected
        WebElement header = driver.findElement(By.className("_8eso"));//alt+enter short cut create WebElement type
        //Expected:"Connect with friends and the world around you on Facebook."
        String expectedHeader="Connect with friends and the world around you on Facebook.";
        String actualHeader=header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed");
        }else {
            System.out.println("Header verification failed");
        }
        driver.close();
    }
}
