package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankLinkTextVerification {
    public static void main(String[] args) throws InterruptedException {
        /*TC #2: Zero Bank link text verification
        1. Open Chrome browser
        2. Go to http://zero.webappsecurity.com/login.html
        3. Verify link text from top left:
        Expected: “Zero Bank”
        4. Verify link href attribute value contains:
        Expected: “index.html”*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(2000);
        //locate the link and store inside of webElement
        WebElement zeroBankLink= driver.findElement(By.className("brand"));
        //3. Verify link text from top left:    Expected: “Zero Bank”
        String expektedLinkText="Zero Bank";
        String actualLinkText=zeroBankLink.getText();
        if (actualLinkText.equals(expektedLinkText)){
            System.out.println("Link text verification PASSED!");
        }else {
            System.out.println("Link text verification FAILED!");
            }
        //Verify link href attribute value contains:     Expected: “index.html”
        String actualLinkAttribute= zeroBankLink.getAttribute("href");
        String expectedInHrefValue="index.html";
        if (actualLinkAttribute.contains(expectedInHrefValue)){
            System.out.println("Link href attribute value verification PASSED!");
        }else{
            System.out.println("Link href attribute value verification FAILED!");
            }
        Thread.sleep(2000);
        driver.close();
    }
}
