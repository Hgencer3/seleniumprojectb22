package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5b_ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
       /* TC #2: Zero Bank header verification
        1. Open Chrome browser
        2. Go to http://zero.webappsecurity.com/login.html
        3. Verify header text
        Expected: “Log in to ZeroBank”*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(2000);
        //3. Verify header text  Expected: “Log in to ZeroBank”
        //driver.findElement(By.className(""));

    }
}
