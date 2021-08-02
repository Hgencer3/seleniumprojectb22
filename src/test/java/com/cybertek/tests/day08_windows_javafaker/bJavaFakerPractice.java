package com.cybertek.tests.day08_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class bJavaFakerPractice {
    @Test
    public void test1(){
        Faker faker=new Faker();
        String fullName=faker.name().fullName();
        System.out.println("full name: "+fullName);
        String firstName=faker.name().firstName();
        System.out.println("first name: "+firstName);

        String chuckNorris=faker.chuckNorris().fact();
        System.out.println("Chuck Norris: "+chuckNorris);

    }
}
