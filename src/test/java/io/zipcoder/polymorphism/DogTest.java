package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void getNameTest(){
        Dog dog1 = new Dog("Fido");

        String expected = "Fido";
        String actual = dog1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Dog dog1 = new Dog("Fido");
        dog1.setName("Kujo");

        String expected = "Kujo";
        String actual = dog1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Dog dog1 = new Dog("Fido");

        String expected = "Bark!";
        String actual = dog1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSpeakTest(){
        Dog dog1 = new Dog("Fido");
        dog1.setSpeak("Woof!");

        String expected = "Woof!";
        String actual = dog1.speak();

        Assert.assertEquals(expected,actual);
    }

}