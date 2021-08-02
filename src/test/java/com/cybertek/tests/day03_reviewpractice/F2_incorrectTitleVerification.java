package com.cybertek.tests.day03_reviewpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_incorrectTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        Thread.sleep(2000);
        //Locating the web element using is locater and storing it in webelement type
        WebElement inputUserNmae= driver.findElement(By.id("email"));
        //enter incorrect username
        inputUserNmae.sendKeys("something1213@gmail.com");
        //locate the webelement using
        WebElement inputPassword= driver.findElement(By.id("pass"));
        //enter incorrect password
        inputPassword.sendKeys("some wrong password"+ Keys.ENTER);
        //verify title
        String expectedTitle="Log into Facebook";
        Thread.sleep(5000);// bunu koyarak title almasi icin zaman kazaniyor yoksa fail olur
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification Failed");
        }
        driver.close();
    }
}
