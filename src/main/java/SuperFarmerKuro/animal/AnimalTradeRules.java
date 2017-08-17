package SuperFarmerKuro.animal;

import SuperFarmerKuro.animal.AnimalBase;

import java.util.Map;

public class AnimalTradeRules {
    private Map<AnimalBase, int[]> viableTrades;

    public AnimalTradeRules(Map<AnimalBase, int[]> map){
        viableTrades=map;
    }

    public Map<AnimalBase, int[]> getViableTrades() {
        return viableTrades;
    }
}
