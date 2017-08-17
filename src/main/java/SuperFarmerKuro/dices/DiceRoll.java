package SuperFarmerKuro.dices;

import java.util.Random;

public abstract class DiceRoll {

    Random dice = new Random();
    int diceRollsCount;
    String result;

    public final String makeARoll(){
        return giveRollResult(rollADice());
    }

    public abstract int rollADice();

    public abstract String giveRollResult(int score);
}
