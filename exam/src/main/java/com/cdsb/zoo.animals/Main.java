package zoo;

import zoo.animals.*;
import zoo.habitats.*;
import zoo.management.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create zoo
        Zoo myZoo = new Zoo("Wildlife Adventure");


        Habitat savanna = new TerrestrialHabitat("Savanna Exhibit", 500.0, true, true);
        Habitat tropicalBirdHouse = new TerrestrialHabitat("Tropical Bird House", 200.0, true, false);
        Habitat reptileHouse = new Terrarium("Reptile House", 30.0, 28.0, 70.0);
        Habitat dolphinPool = new AquaticHabitat("Dolphin Pool", 300.0, 5.0, true);

        myZoo.addHabitat(savanna);
        myZoo.addHabitat(tropicalBirdHouse);
        myZoo.addHabitat(reptileHouse);
        myZoo.addHabitat(dolphinPool);


        Animal simba = new Lion("Simba", 5, 190.0);
        Animal dumbo = new Elephant("Dumbo", 10, 5000.0);
        Animal marty = new Zebra("Marty", 7, 350.0);
        Animal polly = new Parrot("Polly", 2, 0.5);
        Animal tuco = new Toucan("Tuco", 3, 0.6);
        Animal naga = new Snake("Naga", 4, 5.0);
        Animal iggy = new Iguana("Iggy", 2, 4.0);
        Animal flipper = new Dolphin("Flipper", 8, 200.0);
        Animal seal = new Seal("Seal", 6, 150.0);

        // Set food schedules
        simba.setFoodSchedule(new FoodSchedule("Carnivore", "Twice daily",
            new String[]{"Beef", "Chicken"}, "Supplement with vitamins"));
        dumbo.setFoodSchedule(new FoodSchedule("Herbivore", "Three times daily",
            new String[]{"Hay", "Fruits", "Vegetables"}, "Large quantities needed"));


        myZoo.addAnimal(simba);
        myZoo.addAnimal(dumbo);
        myZoo.addAnimal(marty);
        myZoo.addAnimal(polly);
        myZoo.addAnimal(tuco);
        myZoo.addAnimal(naga);
        myZoo.addAnimal(iggy);
        myZoo.addAnimal(flipper);
        myZoo.addAnimal(seal);


        myZoo.assignAnimalToHabitat(dumbo, savanna);
        myZoo.assignAnimalToHabitat(marty, savanna);
        myZoo.assignAnimalToHabitat(polly, tropicalBirdHouse);
        myZoo.assignAnimalToHabitat(tuco, tropicalBirdHouse);
        myZoo.assignAnimalToHabitat(naga, reptileHouse);
        myZoo.assignAnimalToHabitat(iggy, reptileHouse);
        myZoo.assignAnimalToHabitat(flipper, dolphinPool);
        myZoo.assignAnimalToHabitat(seal, dolphinPool);

        myZoo.assignAnimalToHabitat(simba, savanna);

        List<Habitat> suitableForIggy = myZoo.findSuitableHabitats(iggy);
        System.out.println("\nSuitable habitats for Iggy:");
        suitableForIggy.forEach(habitat -> System.out.println(" - " + habitat.getName()));

        // Display zoo status
        myZoo.displayZooStatus();
    }
}
