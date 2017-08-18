package SuperFarmer2.animal;

import java.util.Map;

public abstract class Animal {

    int count =0;

    AnimalTradeRules animalTradeRules;

    public Animal(){
        animalTradeRules = new AnimalTradeRules(setRules());
    }

    public abstract Map<AnimalBase, int[]> setRules();

    public String printViableTrades(){
        String trades = "";
        for (Map.Entry<AnimalBase, int[]> entry : animalTradeRules.getViableTrades().entrySet())
        {
            trades += String.format("Trade %-10s for %-10s gain:%-10d cost:%-10d\n",this.getClass().getSimpleName(), entry.getKey(),entry.getValue()[0],entry.getValue()[1]);
        }
        return trades;
    }
}
