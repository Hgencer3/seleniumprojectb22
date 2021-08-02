package com.cybertek.utilities;

public class BrowserUtils {
    /**
     * Method that will accept int
     * Wait for given second duration
     */

    public static void sleep(int second)  {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println(" Happened something an the sleep method");
        }

    }
}
