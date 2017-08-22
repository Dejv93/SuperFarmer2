package SuperFarmer2.dices;

import SuperFarmer2.animal.AnimalBase;

public class RedDice extends DiceRoll{

    public int rollADice() {
        return dice.nextInt(12);
    }

    public AnimalBase giveRollResult(int score){

        if (score <= 5)
            result = AnimalBase.RABBIT;
        else if (score > 5 && score <= 8)
            result = AnimalBase.SHEEP;
        else if (score == 9)
            result = AnimalBase.PIG;
        else if (score == 10)
            result = AnimalBase.HORSE;
        else if (score == 11)
            result = AnimalBase.FOX;
        diceRollsCount++;
        return result;
    }

    public int[] executeRoll(int[] bonusRedArray) {

        if (makeARoll().equals(AnimalBase.RABBIT))
            bonusRedArray[0] += 1;
        else if (makeARoll().equals(AnimalBase.SHEEP))
            bonusRedArray[1] += 1;
        else if (makeARoll().equals(AnimalBase.PIG))
            bonusRedArray[2] += 1;
        else if (makeARoll().equals(AnimalBase.HORSE))
            bonusRedArray[4] += 1;

        return bonusRedArray;
    }
}
