package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest /*extends TestCase*/ {
    @Test
    public void getNameTest(){
        Cat cat1 = new Cat("Simba");

        String expected = "Simba";
        String actual = cat1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Cat cat1 = new Cat("Simba");
        cat1.setName("Scar");

        String expected = "Scar";
        String actual = cat1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Cat cat1 = new Cat("Simba");

        String expected = "Meow!";
        String actual = cat1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSpeakTest(){
        Cat cat1 = new Cat("Simba");
        cat1.setSpeak("Purr");

        String expected = "Purr";
        String actual = cat1.speak();

        Assert.assertEquals(expected,actual);
    }
}