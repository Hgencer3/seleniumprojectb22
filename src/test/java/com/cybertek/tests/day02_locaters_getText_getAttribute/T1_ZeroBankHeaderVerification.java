package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        /*TC #1: Zero Bank header verification
        1. Open Chrome browser
        2. Go to http://zero.webappsecurity.com/login.html
        3. Verify header text
        Expected: “Log in to ZeroBank”*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(2000);
        //Verify header text Expected: “Log in to ZeroBank”
        // First= locate the web element
        //second= get the text of it using getText() method
        WebElement actualHeader=driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();

        String expectedHeader = "Log in to ZeroBank";
        if (actualHeaderText.equals(expectedHeader)) {
            System.out.println("Header verification PASSED!");
        } else {
            System.out.println("Header verification FAILED!");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
