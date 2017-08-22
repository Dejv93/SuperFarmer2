package SuperFarmer2.animal;

import java.util.HashMap;
import java.util.Map;

public class Horse extends Animal{

    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.COW, new int[]{2,1});

        return animalMap;
    }
}
