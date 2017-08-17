package SuperFarmerKuro.animal;

import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Animal {


    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.SHEEP, new int[]{1,6});
        animalMap.put(AnimalBase.PIG, new int[]{3,8});

        return animalMap;
    }
}
