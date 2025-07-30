package com.cdsb.classes;

import com.cdsb.enums.*;
import com.cdsb.interfaces.IAnimals;

public class Animal implements IAnimals{
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
    @Override
    public String getName() {
        return name;
    }

    @Override
    public AnimalType getType() {
        return type;
    }
    @Override
    public Behavior getBehavior() {
        return behavior;
    }
    @Override
    public double getSpaceRequired() {
         return spaceRequired;
    }

    @Override
    public Diet getDietType() {
        return diet;
    }

    @Override
    public boolean canBeTogether() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canBeTogether'");
    }


}
