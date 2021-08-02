package com.cybertek.tests.day04_cssSelectorAndXpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelectorCybertek {
    public static void main(String[] args) {
        /*TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        f. “Powered by Cybertek School” text
        4. Verify all WebElements are displayed.*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //a. “Home” link
        WebElement homeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));
        //b. “Forgot password” header
        WebElement forgatPasswordHeader=driver.findElement(By.tagName("h2"));
        //c. “E-mail” text
        WebElement emailLabel=driver.findElement(By.cssSelector("label[for='email']"));
        //d. E-mail input box
        WebElement emailInputBox=driver.findElement(By.cssSelector("input[name='email']"));
        //e. “Retrieve password” button
        WebElement retrievePassword=driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        //f. “Powered by Cybertek School” text
        WebElement poweredText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //4. Verify all WebElements are displayed
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgatPasswordHeader.isDisplayed() = " + forgatPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredText.isDisplayed() = " + poweredText.isDisplayed());
        driver.close();


    }
}
