package SuperFarmerKuro.dices;

import SuperFarmerKuro.animal.AnimalBase;

public class RedDice extends DiceRoll{

    public int rollADice() {
        return dice.nextInt(12);
    }

    public String giveRollResult(int score){
        result = "";

        if (score <= 5)
            result = AnimalBase.RABBIT.getName();
        else if (score > 5 && score <= 8)
            result = AnimalBase.SHEEP.getName();
        else if (score == 9)
            result = AnimalBase.PIG.getName();
        else if (score == 10)
            result = AnimalBase.HORSE.getName();
        else if (score == 11)
            result = AnimalBase.FOX.getName();
        diceRollsCount++;
        return result;
    }
}
