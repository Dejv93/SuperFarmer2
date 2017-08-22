package SuperFarmer2.animal;


import java.util.HashMap;
import java.util.Map;

public class Farm {
    Map<AnimalBase, Integer> breedAnimals = new HashMap<>();

    public Farm(){

        breedAnimals.put(AnimalBase.RABBIT, 0);
        breedAnimals.put(AnimalBase.SHEEP, 0);
        breedAnimals.put(AnimalBase.PIG, 0);
        breedAnimals.put(AnimalBase.COW, 0);
        breedAnimals.put(AnimalBase.HORSE, 0);
        breedAnimals.put(AnimalBase.SMALL_DOG, 0);
        breedAnimals.put(AnimalBase.BIG_DOG, 0);
    }

    public Map<AnimalBase, Integer> getBreedAnimals() {
        return breedAnimals;
    }

    public void changeAnimalQuantity(AnimalBase animal, int quantityChange){

        breedAnimals.put(animal, breedAnimals.get(animal)+quantityChange);
    }
    public int[] getFarmAnimalsArray(){
        int[]farmAnimalArray = {breedAnimals.get(AnimalBase.RABBIT), breedAnimals.get(AnimalBase.SHEEP), breedAnimals.get(AnimalBase.PIG), breedAnimals.get(AnimalBase.COW), breedAnimals.get(AnimalBase.HORSE)};
        return farmAnimalArray;
    }
}

