package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import sun.tools.jar.Main;

public class MainApplicationTest {

    @Test
    public void addPetTest(){
        MainApplication myApp = new MainApplication();

        Cat cat1 = new Cat("Mufasa");
        Dog dog1 = new Dog("Hunter");
        Bird bird1 = new Bird("Roadrunner");

        myApp.addPet(cat1);
        myApp.addPet(dog1);
        myApp.addPet(bird1);

        Pet[] expected = new Pet[]{cat1,dog1,bird1};
        String actual = myApp.getPets;

        Assert.assertEquals(expected,actual);
    }
}
