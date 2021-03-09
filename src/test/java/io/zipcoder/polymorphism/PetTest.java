package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetTest extends TestCase {

    @Test
    public void constructorTest(){
        Pet pet1 = new Pet("Generic Pet Name");

        String expected = "Generic Pet Name";
        String actual = pet1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Pet pet1 = new Pet("Generic Pet Name");

        String expected = "Animal Noise";
        String actual = pet1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSpeak(){
        Pet pet1 = new Pet("Generic Pet Name");

        pet1.setSpeak("A Different Animal Noise");

        String expected = "A Different Animal Noise";
        String actual = pet1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Pet pet1 = new Pet("Generic Pet Name");

        pet1.setName("Different Generic Pet Name");

        String expected = "Different Generic Pet Name";
        String actual = pet1.getName();

        Assert.assertEquals(expected,actual);
    }

}