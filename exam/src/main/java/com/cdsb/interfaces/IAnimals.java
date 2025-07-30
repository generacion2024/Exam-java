package com.cdsb.interfaces;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.Behavior;
import com.cdsb.enums.Diet;

public interface IAnimals {

    AnimalType getType();
    String getName();
    Diet getDietType();
    double getSpaceRequired();
    Behavior getBehavior();

    boolean canBeTogether();

    boolean veterinaryCare();

}
