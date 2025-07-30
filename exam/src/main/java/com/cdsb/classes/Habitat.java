package com.cdsb.classes;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IHabitat;

public abstract class Habitat implements IHabitat {
    private String name;
    private HabitatType type;
    private double size;
    private List<Animal> animals;

    public Habitat(String name, HabitatType type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.animals = new ArrayList<>();
    }

    @Override
    public boolean addAnimal(Animal animal) {
        animals.add(animal);
        return true;
    }

    @Override
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    @Override
    public void showAnimals() {
        System.out.println("Animales en el hábitat " + name + ":");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName());
        }
    }

    public HabitatType getType() { return type; }
    public double getSize() { return size; }
}
