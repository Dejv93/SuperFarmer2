package SuperFarmer2.dices;

import SuperFarmer2.animal.AnimalBase;

import java.util.Random;

public abstract class DiceRoll {

    Random dice = new Random();
    int diceRollsCount;
    AnimalBase result;

    public final AnimalBase makeARoll(){
        return giveRollResult(rollADice());
    }

    public abstract int rollADice();

    public abstract AnimalBase giveRollResult(int score);

    public final int[] executeRoll(){

        int[] bonusRollArray = new int[]{0, 0, 0, 0, 0, 0 ,0};//RABBIT SHEEP PIG COW HORSE SMALLDOG BIGDOG

        return executeRoll(bonusRollArray);
    }

    public abstract int[] executeRoll(int[] bonusRollArray);

}
