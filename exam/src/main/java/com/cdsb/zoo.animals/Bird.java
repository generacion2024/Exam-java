package com.cdsb.zoo.animals;

public abstract class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, double weight, double spaceRequired, boolean canLiveInGroup, double wingspan) {
        super(name, age, weight, spaceRequired, canLiveInGroup);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public String getDietType() {
        return "Omnivore"; // Default for birds
    }
}
