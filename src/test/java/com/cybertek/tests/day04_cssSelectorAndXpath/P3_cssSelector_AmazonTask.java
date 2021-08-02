package com.cybertek.tests.day04_cssSelectorAndXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        /*TC #3: Amazon link number verification
        1. Open Chrome browser
        2. Go to https://www.amazon.com
        3. Enter search term (use cssSelector to locate search box)
        4. Verify title contains search term*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //3. Enter search term (use cssSelector to locate search box)
        WebElement amazonSearchBar=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        Thread.sleep(3000);
        amazonSearchBar.sendKeys("Wooden spoon"+ Keys.ENTER);

        //4. Verify title contains search term
        String axpectedTitle="Amazon.com : wooden spoon";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(actualTitle)){
            System.out.println("Title verification Passes!!");
        }else {
            System.out.println("Title verification Failed!!");
        }

    }
}
