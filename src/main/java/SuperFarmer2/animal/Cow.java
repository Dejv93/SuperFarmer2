package SuperFarmer2.animal;

import java.util.HashMap;
import java.util.Map;

public class Cow extends Animal {

    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.HORSE, new int[]{1,2});
        animalMap.put(AnimalBase.PIG, new int[]{3,1});
        animalMap.put(AnimalBase.BIG_DOG, new int[]{1,1});

        return animalMap;
    }
}
