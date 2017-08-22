package SuperFarmer2.animal;

import java.util.HashMap;
import java.util.Map;

public class Pig extends Animal {

    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.SHEEP, new int[]{2,1});
        animalMap.put(AnimalBase.COW, new int[]{1,3});

        return animalMap;
    }
}
