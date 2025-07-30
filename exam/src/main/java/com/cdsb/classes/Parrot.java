package com.cdsb.classes;

import com.cdsb.enums.*;

public class Parrot extends Animal {
    public Parrot() {
        super("Parrot", AnimalType.BIRD, Diet.HERBIVORE, Behavior.SOCIAL, 20);
    }

    @Override
    public void makeSound() {
        System.out.println("¡Hola! ¡Hola!");
    }
}
