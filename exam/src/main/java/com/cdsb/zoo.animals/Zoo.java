package com.cdsb.zoo.animals;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.Animal;

public class Zoo {
    private String name;
    private List<Animal> animals;
    private List<Habitat> habitats;
    private CompatibilityChecker compatibilityChecker;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
        this.habitats = new ArrayList<>();
        this.compatibilityChecker = new CompatibilityChecker();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addHabitat(Habitat habitat) {
        habitats.add(habitat);
    }

    public boolean assignAnimalToHabitat(Animal animal, Habitat habitat) {
        if (!animals.contains(animal) || !habitats.contains(habitat)) {
            return false;
        }

        // Check compatibility with existing animals in the habitat
        for (Animal existingAnimal : habitat.getAnimals()) {
            if (!compatibilityChecker.areCompatible(animal, existingAnimal)) {
                return false;
            }
        }

        return habitat.addAnimal(animal);
    }

    public List<Habitat> findSuitableHabitats(Animal animal) {
        List<Habitat> suitableHabitats = new ArrayList<>();
        for (Habitat habitat : habitats) {
            if (habitat.canAddAnimal(animal)) {
                // Check compatibility with existing animals
                boolean compatibleWithAll = true;
                for (Animal existingAnimal : habitat.getAnimals()) {
                    if (!compatibilityChecker.areCompatible(animal, existingAnimal)) {
                        compatibleWithAll = false;
                        break;
                    }
                }
                if (compatibleWithAll) {
                    suitableHabitats.add(habitat);
                }
            }
        }
        return suitableHabitats;
    }

    public void displayZooStatus() {
        System.out.println("=== " + name + " Zoo Status ===");
        System.out.println("\nAnimals:");
        animals.forEach(animal -> {
            System.out.println(animal);
            if (animal.getHabitat() != null) {
                System.out.println("  - Located in: " + animal.getHabitat().getName());
            } else {
                System.out.println("  - Not assigned to any habitat");
            }
        });

        System.out.println("\nHabitats:");
        habitats.forEach(habitat -> {
            System.out.println(habitat);
            System.out.println("  - Animals in this habitat:");
            habitat.getAnimals().forEach(animal -> System.out.println("    * " + animal.getName()));
        });
    }
}
