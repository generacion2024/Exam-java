package com.cdsb.zoo.animals;

import zoo.animals.Animal;
import zoo.animals.Mammal;
import zoo.animals.Bird;

public class TerrestrialHabitat extends Habitat {
    private boolean hasTrees;
    private boolean hasPond;

    public TerrestrialHabitat(String name, double size, boolean hasTrees, boolean hasPond) {
        super(name, size, hasPond ? size * 100 : 0); // Estimate water volume if there's a pond
        this.hasTrees = hasTrees;
        this.hasPond = hasPond;
    }

    @Override
    protected boolean canAddAnimal(Animal animal) {
        // Check space
        if (animal.getSpaceRequired() > getAvailableSpace()) {
            return false;
        }

        // Terrestrial habitat can only hold mammals and birds
        if (!(animal instanceof Mammal) && !(animal instanceof Bird)) {
            return false;
        }

        // Birds need trees
        if (animal instanceof Bird && !hasTrees) {
            return false;
        }

        return true;
    }
}
