package com.cdsb.classes;

import com.cdsb.enums.*;

public class Dolphin extends Animal {
    public Dolphin() {
        super(" Dolphin", AnimalType.AQUATIC, Diet.CARNIVORE, Behavior.SOCIAL, 300);
    }

    @Override
    public void makeSound() {
        System.out.println("Click-click-click!");
    }
}
