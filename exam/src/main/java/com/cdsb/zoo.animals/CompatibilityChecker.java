package com.cdsb.zoo.animals;

import zoo.animals.Animal;

public class CompatibilityChecker {
     public boolean areCompatible(Animal animal1, Animal animal2) {
        // Same species are usually compatible (except for territorial animals)
        if (animal1.getClass().equals(animal2.getClass())) {
            return animal1.canLiveInGroup() && animal2.canLiveInGroup();
        }

        // Predator-prey relationships
        if (isPredatorOf(animal1, animal2) || isPredatorOf(animal2, animal1)) {
            return false;
        }

        // Check habitat compatibility
        if (!animal1.getHabitat().getClass().equals(animal2.getHabitat().getClass())) {
            return false;
        }

        // Specific compatibility rules
        // Herbivores can live together
        if (animal1.getDietType().equals("Herbivore") && animal2.getDietType().equals("Herbivore")) {
            return true;
        }

        // Tropical birds can live together
        if ((animal1 instanceof Parrot || animal1 instanceof Toucan) &&
            (animal2 instanceof Parrot || animal2 instanceof Toucan)) {
            return true;
        }

        // Aquatic social animals can live together
        if ((animal1 instanceof Dolphin || animal1 instanceof Seal) &&
            (animal2 instanceof Dolphin || animal2 instanceof Seal)) {
            return true;
        }

        // By default, assume not compatible unless proven otherwise
        return false;
    }

    private boolean isPredatorOf(Animal potentialPredator, Animal potentialPrey) {
        // This is a simplified check - in a real system, this would be more comprehensive
        return potentialPredator.getNaturalBehavior().equals("Predator") &&
               potentialPrey.getNaturalBehavior().equals("Prey") &&
               potentialPredator.getDietType().equals("Carnivore");
    }
}
