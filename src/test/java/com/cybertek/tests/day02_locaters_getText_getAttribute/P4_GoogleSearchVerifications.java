package com.cybertek.tests.day02_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerifications {
    public static void main(String[] args) throws InterruptedException {
       /*TC #4:    Google    search
        1- Open    a    chrome    browser
        2- Go    to:    https://google.com/
        3- Write    “apple”    in    search    box
        4- Click    google    search    button
        5- Verify    title:
        Expected:    Title    should    start    with    “apple”    word*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        //3- Write    “apple”    in    search    box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //4- Click    google    search    button

        // 5- Verify    title:
        System.out.println("Current Title: "+driver.getTitle());
        String expectedTitle="apple";
        String actualTile=driver.getTitle();
        if (actualTile.contains(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
