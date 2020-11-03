package farm;

import plants.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Farm {
    private int allProduction;
    private Set<Plant> plants = new LinkedHashSet<Plant>();


    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public int allProducedFood() {
        int producedFood = 0;
        for (int i = 1; i < 81; i++) {
            for (Plant plant : plants) {
                if (plant.getClass().equals(Spruce.class) || plant.getClass().equals(Juniper.class)) {
                    if (i % 5 == 0) {
                        ((Evergreen) plant).growLeaves();
                    } else {
                        plant.defaultGrowing();
                    }
                    ((Evergreen) plant).isProductionAtMax();
                } else {
                    plant.defaultGrowing();
                }
                if (plant.getClass().equals(Spruce.class)) {
                    ((Spruce) plant).mushroomGrowing();
                    ((Spruce) plant).rotting();
                    ((Spruce) plant).checkIfRotted();
                } else if (plant.getClass().equals(Almond.class)) {
                    ((Almond) plant).mushroomGrowing();
                    ((Almond) plant).rotting();
                    ((Almond) plant).checkIfRotted();
                }
                System.out.println(plant);
                producedFood += plant.getProduction();
            }
        }
        return producedFood;
    }
}

