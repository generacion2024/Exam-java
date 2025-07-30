package com.cdsb.classes;

import com.cdsb.enums.*;

public abstract class Animal {
    private String name;
    private AnimalType type;
    private Diet diet;
    private Behavior behavior;
    private double spaceRequired;

    public Animal(String name, AnimalType type, Diet diet, Behavior behavior, double spaceRequired) {
        this.name = name;
        this.type = type;
        this.diet = diet;
        this.behavior = behavior;
        this.spaceRequired = spaceRequired;
    }

    public String getName() { return name; }
    public AnimalType getType() { return type; }
    public Diet getDiet() { return diet; }
    public Behavior getBehavior() { return behavior; }
    public double getSpaceRequired() { return spaceRequired; }

    public abstract void makeSound();
}
