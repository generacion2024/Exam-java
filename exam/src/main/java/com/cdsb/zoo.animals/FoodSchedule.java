package com.cdsb.zoo.animals;

public class FoodSchedule {
    private String dietType;
    private String feedingFrequency;
    private String[] preferredFoods;
    private String specialInstructions;

    public FoodSchedule(String dietType, String feedingFrequency, String[] preferredFoods, String specialInstructions) {
        this.dietType = dietType;
        this.feedingFrequency = feedingFrequency;
        this.preferredFoods = preferredFoods;
        this.specialInstructions = specialInstructions;
    }

    // Getters
    public String getDietType() { return dietType; }
    public String getFeedingFrequency() { return feedingFrequency; }
    public String[] getPreferredFoods() { return preferredFoods; }
    public String getSpecialInstructions() { return specialInstructions; }

    @Override
    public String toString() {
        return String.format("Diet: %s, Frequency: %s, Preferred foods: %s, Special: %s",
                dietType, feedingFrequency, String.join(", ", preferredFoods), specialInstructions);
    }
}
