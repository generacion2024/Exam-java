package com.cdsb.interfaces;

import com.cdsb.enums.Behavior;

public interface IAnimals {

 String getType();

 String getName() { return name; }
 DietType getDietType() { return dietType; }
 double getSpaceRequired() { return spaceRequired; }
 Behavior getBehavior() { return behavior; }

 
}
