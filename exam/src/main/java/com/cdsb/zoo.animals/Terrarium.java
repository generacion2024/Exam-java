package com.cdsb.zoo.animals;

import zoo.animals.Animal;
import zoo.animals.Reptile;
public class Terrarium {
    private double temperature; // in Celsius
    private double humidity; // percentage

    public Terrarium(String name, double size, double temperature, double humidity) {
        super(name, size, 0); // No water volume for basic terrarium
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    protected boolean canAddAnimal(Animal animal) {
        // Terrariums can only hold reptiles
        if (!(animal instanceof Reptile)) {
            return false;
        }

        // Check space
        if (animal.getSpaceRequired() > getAvailableSpace()) {
            return false;
        }

        // Terrariums can only hold one reptile (they're territorial)
        if (!getAnimals().isEmpty()) {
            return false;
        }

        return true;
    }
}
