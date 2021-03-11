package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public MainApplication(){
    }

    public void addPet(Pet newPet){
        pets.add(newPet);
    }

    public Object[] getPets() {
        return pets.toArray();
    }


}
