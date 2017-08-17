package SuperFarmerKuro;

import SuperFarmerKuro.dices.DiceRoll;
import SuperFarmerKuro.dices.RedDice;

public class Testowy {

    public static void main(String[] args){
        DiceRoll redDice = new RedDice();
        RedDice redDice2 = new RedDice();
        redDice.rollADice();
        redDice2.rollADice();
    }
}