package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void tc15_action_hover(){

        //TC #15: Hover Test
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locating all the "user" texts
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2);
        Actions actions=new Actions(Driver.getDriver());

        //2. Hover over to first image
        actions.moveToElement(img1).perform();
        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed(),"User1 text is not displayed. Failed!");
        BrowserUtils.sleep(2);
        // 4. Hover over to second image
        actions.moveToElement(img2).perform();
        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed(),"User2 text is not displayed. Failed!");
        BrowserUtils.sleep(2);
        //6. Hover over to third image
        actions.moveToElement(img3).perform();
        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed(),"User3 text is not displayed. Failed!");


    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        //scroll down topowered by cybertek school
        Actions actions=new Actions(Driver.getDriver());
        //locate "powered by cybertek school"
        WebElement cybertekSchoolLink=Driver.getDriver().findElement(By.linkText("Cybertek School"));

        //scroll using actions object
        BrowserUtils.sleep(2);
        actions.moveToElement(cybertekSchoolLink).perform();

        //scrolling up using Keys.Page+Up button
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();


        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }
}
