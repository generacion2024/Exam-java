package com.cdsb.classes;

import com.cdsb.enums.*;

public class Lion extends Animal{
    public Lion() {
        super("Lion", AnimalType.MAMMAL, Diet.CARNIVORE, Behavior.PREDATOR, 500);
    }

    @Override
    public void makeSound() {
        System.out.println("Rooaaarrr!");
    }

}
