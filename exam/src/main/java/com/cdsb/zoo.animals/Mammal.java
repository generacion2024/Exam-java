package com.cdsb.zoo.animals;

import com.cdsb.Animal;

public abstract class Mammal extends Animal {
    public Mammal(String name, int age, double weight, double spaceRequired, boolean canLiveInGroup) {
        super(name, age, weight, spaceRequired, canLiveInGroup);
    }

    @Override
    public String getDietType() {
        return "Omnivore"; // Default, can be overridden
    }
}
