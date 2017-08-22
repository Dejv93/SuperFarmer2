package SuperFarmer2.animal;

import java.util.HashMap;
import java.util.Map;

public class Sheep extends Animal{

    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.RABBIT, new int[]{6,1});
        animalMap.put(AnimalBase.PIG, new int[]{1,2});
        animalMap.put(AnimalBase.SMALL_DOG, new int[]{1,1});

        return animalMap;
    }
}
