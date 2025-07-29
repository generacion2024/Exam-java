package com.cdsb.zoo.animals;

import com.cdsb.Animal;

public abstract class Aquatic extends Animal {
    private double waterVolumeRequired; // in liters

    public Aquatic(String name, int age, double weight, double spaceRequired, boolean canLiveInGroup, double waterVolumeRequired) {
        super(name, age, weight, spaceRequired, canLiveInGroup);
        this.waterVolumeRequired = waterVolumeRequired;
    }

    public double getWaterVolumeRequired() {
        return waterVolumeRequired;
    }

    @Override
    public String getDietType() {
        return "Carnivore"; // Most aquatic animals are carnivores
    }
}
