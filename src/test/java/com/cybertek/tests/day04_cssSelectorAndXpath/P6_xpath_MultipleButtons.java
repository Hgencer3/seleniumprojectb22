package com.cybertek.tests.day04_cssSelectorAndXpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) throws InterruptedException {

        /*TC #6: XPATH LOCATOR practice
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/multiple_buttons
        3. Click on Button 1
        4. Verify text displayed is as expected:
        Expected: “Clicked on button one!”*/


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // 3. Click on Button 1
        WebElement button1=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        button1.click();
        Thread.sleep(3000);
        //4. Verify text displayed is as expected:  Expected: “Clicked on button one!”
        WebElement clickedOnButton=driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println("clickedOnButton.isDisplayed() = " + clickedOnButton.isDisplayed());

        String expectedText="Clicked on button one!";
        String actualText=clickedOnButton.getText();
        if (actualText.equals(expectedText)) {
            System.out.println("Title verification Passed!!");
        }else {
            System.out.println("Title verification Failed!!");

        }


        driver.close();
    }
}
