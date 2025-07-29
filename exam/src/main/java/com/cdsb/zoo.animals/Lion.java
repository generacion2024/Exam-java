package com.cdsb.zoo.animals;

import zoo.management.FoodSchedule;

public class Lion extends Mammal {
    public Lion(String name, int age, double weight) {
        super(name, age, weight, 50.0, false);
    }

    @Override
    public String getSpecies() {
        return "Lion";
    }

    @Override
    public String getDietType() {
        return "Carnivore";
    }

    @Override
    public String getNaturalBehavior() {
        return "Predator";
    }
}
