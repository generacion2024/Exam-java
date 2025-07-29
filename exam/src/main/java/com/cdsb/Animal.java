package com.cdsb;

import zoo.habitats.Habitat;
import zoo.management.FoodSchedule;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private double spaceRequired; // in square meters
    private boolean canLiveInGroup;
    private FoodSchedule foodSchedule;
    private Habitat habitat;

    public Animal(String name, int age, double weight, double spaceRequired, boolean canLiveInGroup) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.spaceRequired = spaceRequired;
        this.canLiveInGroup = canLiveInGroup;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getSpaceRequired() { return spaceRequired; }
    public boolean canLiveInGroup() { return canLiveInGroup; }
    public FoodSchedule getFoodSchedule() { return foodSchedule; }
    public Habitat getHabitat() { return habitat; }

    public void setFoodSchedule(FoodSchedule foodSchedule) {
        this.foodSchedule = foodSchedule;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public abstract String getSpecies();

    public abstract String getDietType();

    public abstract String getNaturalBehavior();

    @Override
    public String toString() {
        return String.format("%s (Name: %s, Age: %d, Weight: %.1f kg, Space needed: %.1f m²)",
                getSpecies(), name, age, weight, spaceRequired);
    }
}
