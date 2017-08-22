package SuperFarmer2.dices;

import SuperFarmer2.animal.AnimalBase;

public class YellowDice extends DiceRoll {

    public int rollADice() {
        return dice.nextInt(12);
    }

    public AnimalBase giveRollResult(int score){
        if (score <= 5)
            result = AnimalBase.RABBIT;
        else if (score == 6 || score == 7)
            result = AnimalBase.SHEEP;
        else if (score == 8 || score == 9)
            result = AnimalBase.PIG;
        else if (score == 10)
            result = AnimalBase.COW;
        else if (score == 11)
            result = AnimalBase.WOLF;
        return result;
    }

    public int[] executeRoll(int[] bonusYellowArray){

        if(makeARoll().equals(AnimalBase.RABBIT))
            bonusYellowArray[0] +=1;
        else if(makeARoll().equals(AnimalBase.SHEEP))
            bonusYellowArray[1] +=1;
        else if(makeARoll().equals(AnimalBase.PIG))
            bonusYellowArray[2] +=1;
        else if(makeARoll().equals(AnimalBase.COW))
            bonusYellowArray[3] +=1;

        return bonusYellowArray;
    }
}
