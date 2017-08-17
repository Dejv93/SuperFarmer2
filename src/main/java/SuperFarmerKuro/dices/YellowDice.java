package SuperFarmerKuro.dices;

import SuperFarmerKuro.animal.AnimalBase;

public class YellowDice extends DiceRoll {

    public int rollADice() {
        return dice.nextInt(12);
    }

    public String giveRollResult(int score){
        result = "";

        if (score <= 5)
            result = AnimalBase.RABBIT.getName();
        else if (score == 6 || score == 7)
            result = AnimalBase.SHEEP.getName();
        else if (score == 8 || score == 9)
            result = AnimalBase.PIG.getName();
        else if (score == 10)
            result = AnimalBase.COW.getName();
        else if (score == 11)
            result = AnimalBase.WOLF.getName();
        return result;
    }
}
