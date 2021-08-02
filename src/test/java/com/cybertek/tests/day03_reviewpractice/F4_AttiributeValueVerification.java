package com.cybertek.tests.day03_reviewpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttiributeValueVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        Thread.sleep(2000);
        //verify "create a page" link href value contains "registration_form"

        //Locating the "Create a page" link
        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
        //expected "registration_form"
        String expectedInHref = "registration_form";
        String actualHrefValue = createPageLink.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("Href value verification passed");
        } else {
            System.out.println("Href value verification failed");
        }
        driver.close();

    }
}
