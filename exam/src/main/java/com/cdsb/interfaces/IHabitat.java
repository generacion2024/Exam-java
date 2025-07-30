package com.cdsb.interfaces;

import com.cdsb.classes.Animal;

public interface IHabitat {
    boolean addAnimal(Animal animal);  // Añadir animal al hábitat
    boolean removeAnimal(Animal animal); // Eliminar animal del hábitat
    void showAnimals();                 // Mostrar animales en el hábitat

}
