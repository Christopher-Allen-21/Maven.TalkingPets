package io.zipcoder.polymorphism;

public class Pet {
    String name;
    String speak;


    public Pet(String name) {
        this.name = name;
        this.speak = "Animal Noise";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String speak() {
        return speak;
    }

    public void setSpeak(String animalNoise) {
        speak = animalNoise;
    }
}
