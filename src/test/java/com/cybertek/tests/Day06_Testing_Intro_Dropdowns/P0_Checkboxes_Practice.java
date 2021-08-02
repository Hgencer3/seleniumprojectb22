package com.cybertek.tests.Day06_Testing_Intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkboxes_Practice {
    public static void main(String[] args) throws InterruptedException {
        /*Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkEBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkEBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //2. Confirm checkbox #1 is NOT selected by default
        if (!checkEBox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification is PASSED!");
        }else{
            System.out.println("Checkbox 1 is selected. Verification is FAILED!");
        }
        //3. Confirm checkbox #2 is SELECTED by default.
        if (checkEBox2.isSelected()){
            System.out.println("Checkbox 2 is  selected. Verification is PASSED!");
        }else{
            System.out.println("Checkbox 2 is not selected. Verification is FAILED!");
        }
        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkEBox1.click();
        // 5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkEBox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        if (checkEBox1.isSelected()){
            System.out.println("Checkbox 1 is  selected. Verification is PASSED!");
        }else{
            System.out.println("Checkbox 1 is not selected. Verification is FAILED!");
        }
        //7. Confirm checkbox #2 is NOT selected.
        if (!checkEBox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification is PASSED!");
        }else{
            System.out.println("Checkbox 2 is selected. Verification is FAILED!");
        }


    driver.close();
    }
}
