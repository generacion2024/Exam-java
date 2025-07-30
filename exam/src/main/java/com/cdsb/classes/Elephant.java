package com.cdsb.classes;

import com.cdsb.enums.*;

public class Elephant extends Animal {
    public Elephant() {
        super("Elephant", AnimalType.MAMMAL, Diet.HERBIVORE, Behavior.SOCIAL, 1000);
    }

    @Override
    public void makeSound() {
        System.out.println("Pawoooo!");
    }
}
