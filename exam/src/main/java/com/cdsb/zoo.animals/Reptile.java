package com.cdsb.zoo.animals;

public abstract class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name, int age, double weight, double spaceRequired, boolean isVenomous) {
        super(name, age, weight, spaceRequired, false); 
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    @Override
    public String getDietType() {
        return "Carnivore";
    }
}
