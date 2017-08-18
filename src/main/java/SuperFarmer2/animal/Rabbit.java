package SuperFarmer2.animal;

import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Animal {

    int count;

    public int getCount() {
        return count;
    }

    public Map<AnimalBase, int[]> setRules(){
        Map<AnimalBase, int[]> animalMap = new HashMap<>();

        animalMap.put(AnimalBase.SHEEP, new int[]{1,6});

        return animalMap;
    }
}
